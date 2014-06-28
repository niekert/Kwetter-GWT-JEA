/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.fontys.fhict.jea.gwt.jee7.server.bus.impl;

import nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.ConnectionException;
import nl.fontys.fhict.jea.gwt.jee7.server.bus.QueueFullException;
import nl.fontys.fhict.jea.gwt.jee7.server.bus.Broadcaster;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.ClientIncoming;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.EncodeException;
import java.util.Collection;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.AsyncResult;
import javax.ejb.Asynchronous;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

/**
 * @author jgeenen
 */
@Local(Broadcaster.class)
@Stateless
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class BroadcasterBean implements Broadcaster {

    private static final Logger LOG = Logger.getLogger(BroadcasterBean.class.getName());

    @Inject
    private SubScriptions subscriptions;
    
    @Override
    public void broadcast(String topic, Collection<ClientIncoming> messages){
        for (SessionImpl s : subscriptions.get(topic)) {
            try {
                s.queue(messages);
                s.flush();
            } catch (QueueFullException | ConnectionException ex) {
                //swallow
            } catch (EncodeException ex) {
                LOG.log(Level.SEVERE, "encode failure", ex);
            }
        }
    }
    
    @Override
    @Asynchronous
    public Future<Void> broadcastAsync(String topic, Collection<ClientIncoming> messages){
        final AsyncResult<Void> asyncResult = new AsyncResult<>(null);
        broadcast(topic, messages);
        return asyncResult;
    }

    
    
}
