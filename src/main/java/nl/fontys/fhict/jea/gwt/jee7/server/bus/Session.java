/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.server.bus;

import nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.ConnectionException;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.ClientIncoming;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.EncodeException;
import java.io.Serializable;
import java.util.Collection;
import javax.enterprise.context.SessionScoped;
import javax.servlet.http.HttpSession;

/**
 * Represents a bus-session: a {@link SessionScoped} bean provided by the framework. The bean is created upon {@link HttpSession} creation. The instance
 * can be referenced in two ways:
 * <ol>
 * <li>by {@link Inject}ing it</li>
 * <li>by retrieving it from a user's {@link HttpSession} through its {@link #HTTP_SESSION_KEY}</li>
 * </ol>
 * 
 * @author jgeenen
 */
public interface Session extends Serializable{
    
    /**
     * the {@link HttpSession} attribute-key for {@code this}' {@link SessionScoped} instance
     */
    public static final String HTTP_SESSION_KEY = Session.class.getName();
    
    /**
     * @return {@code this}' {@link HttpSession}
     */
    public HttpSession getHttpSession();

    /**
     * Queues the {@code messages} for later delivery to {@code this}' client: either all messages are queued
     * succesfully or none are and an exception is thrown
     * @param messages the messages to queue
     * @throws QueueFullException if queueing would result in {@code this}'s queue-size exceeding {@link Config#getCacheSize()}
     */
    void queue(Collection<ClientIncoming> messages) throws QueueFullException;
    
    /**
     * Flushes {@code this}' cached messages to the client.
     * @throws EncodeException if encoding fails for a message
     * @throws ConnectionException if a transport problem occured: messages remain cached if this exception is thrown
     */
    void flush() throws EncodeException, ConnectionException;

    /**
     * @param topics subscribe to the specified {@code topics}
     */
    void subscribe(Collection<String> topics);

    /**
     * @param topics unsubscribe from the specified {@code topics}
     */
    void unsubscribe(Collection<String> topics);
    
}
