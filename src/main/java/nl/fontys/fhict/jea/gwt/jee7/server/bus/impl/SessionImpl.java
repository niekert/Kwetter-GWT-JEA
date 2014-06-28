/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.fontys.fhict.jea.gwt.jee7.server.bus.impl;

import nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.ConnectionException;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.Connection;
import nl.fontys.fhict.jea.gwt.jee7.server.bus.QueueFullException;
import nl.fontys.fhict.jea.gwt.jee7.server.bus.Config;
import nl.fontys.fhict.jea.gwt.jee7.server.bus.Session;
import nl.fontys.fhict.jea.gwt.jee7.server.bus.SessionListener;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.ClientIncoming;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.EncodeException;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.ServerIncoming;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.PreDestroy;
import javax.enterprise.inject.spi.CDI;
import javax.servlet.http.HttpSession;

public class SessionImpl implements Session {
    
    public static SessionImpl get(final HttpSession s){
        synchronized(s){
            SessionImpl retval = (SessionImpl) s.getAttribute(Session.HTTP_SESSION_KEY);
            if(retval==null){
                retval = new SessionImpl();
                retval.httpSession=s;
                s.setAttribute(Session.HTTP_SESSION_KEY, retval);
                retval.sessionListener.onCreate(retval);
            }
            return retval;
        }
    }

    private final SubScriptions subscriptions = CDI.current().select(SubScriptions.class).get();
    
    private final SessionListener sessionListener = CDI.current().select(SessionListener.class).get();

    private final Set<String> mySubscriptions = new HashSet<>();

    private final ArrayList<ClientIncoming> messageQueue = new ArrayList<>();

    private transient HttpSession httpSession;

    private transient Connection connection;

    @Override
    public HttpSession getHttpSession() {
        return httpSession;
    }

    public synchronized void setConnection(Connection connection) {
        this.connection = connection;
        this.sessionListener.onConnect(this);
    }

    public synchronized void onDisconnect(Connection connection) {
        if (this.connection == connection) {
            this.connection = null;
            this.sessionListener.onDisconnect(this);
        }
    }

    @PreDestroy
    protected void onPredestroy() {
        subscriptions.onUnsubscribe(this, mySubscriptions);
        sessionListener.onDestroy(this);
    }

    @Override
    public synchronized void queue(Collection<ClientIncoming> messages) throws QueueFullException {
        if (this.messageQueue.size() + messages.size() <= Config.QUEUE_SIZE) {
            this.messageQueue.addAll(messages);
        } else {
            if (0 < messageQueue.size()) {
                try {
                    flush();
                    queue(messages);
                } catch (EncodeException | ConnectionException ex) {
                    final QueueFullException queueFullException = new QueueFullException("queue failed", ex);
                    this.sessionListener.onError(this, queueFullException);
                    throw queueFullException;
                }

            } else {
                final QueueFullException queueFullException = new QueueFullException("you attempted to queue more messages than the mamximum allowed: this is a programming error!");
                this.sessionListener.onError(this, queueFullException);
                throw queueFullException;
            }
        }
    }
    
    /**
     * Must be invoked by a {@link Connection} upon incoming messages
     * @param incoming 
     */
    public void onIncoming(ArrayList<ServerIncoming> incoming){
        this.sessionListener.onIncoming(this, incoming);
    }

    @Override
    public synchronized void flush() throws ConnectionException, EncodeException{
        if(!messageQueue.isEmpty()){
            if (connection != null && connection.isAlive()) {
                try {
                    connection.send(messageQueue);
                } catch (ConnectionException | EncodeException ex) {
                    connection.release();
                    this.connection=null;
                    this.sessionListener.onError(this, ex);
                    throw ex;
                }
                messageQueue.clear();
            } else {
                final ConnectionException connectionException = new ConnectionException("not connected");
                this.sessionListener.onError(this, connectionException);
                throw connectionException;
            }
        }
    }

    @Override
    public synchronized void subscribe(Collection<String> topics) {
        subscriptions.onSubscribe(this, topics);
        mySubscriptions.addAll(topics);
    }

    @Override
    public synchronized void unsubscribe(Collection<String> topics) {
        subscriptions.onUnsubscribe(this, topics);
        mySubscriptions.removeAll(topics);
    }
}
