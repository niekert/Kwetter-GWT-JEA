/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.server.bus;

import nl.fontys.fhict.jea.gwt.jee7.shared.bus.ClientIncoming;
import java.util.Collection;
import java.util.concurrent.Future;
import javax.inject.Inject;

/**
 * {@link Inject} an implementation in your code where needed.
 * @author jgeenen
 */
public interface Broadcaster {
    
    /**
     * Synchronously broadcasts the {@code messages} to the specified {@link topic}.
     * @param topic the topic for the {@code messages}
     * @param messages the messages to broadcast
     */
    public void broadcast(String topic, Collection<ClientIncoming> messages);

    /**
     * Asynchronously broadcasts the {@code messages} to the specified {@link topic}.
     * @param topic the topic for the {@code messages}
     * @param messages the messages to broadcast
     * @return a {@link Future} containing {@code null} 
     */
    public Future<Void> broadcastAsync(String topic, Collection<ClientIncoming> messages);
    
}
