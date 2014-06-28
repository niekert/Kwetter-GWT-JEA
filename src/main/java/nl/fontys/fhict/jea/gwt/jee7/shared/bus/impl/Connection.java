/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl;

import nl.fontys.fhict.jea.gwt.jee7.shared.bus.EncodeException;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.Incoming;
import java.util.ArrayList;

public interface Connection<I extends Incoming> {
    
    /**
     * Sends the {@code incomings}
     * @param incomings
     * @throws ConnectionException 
     * @throws EncodeException
     */
    public void send(ArrayList<I> incomings) throws ConnectionException, EncodeException;
    
    /**
     * @return whether or not this {@link Connection} can be used for sending more than one message.
     */
    public boolean isDurable();
    
    /**
     * @return whether or not {@code this} is ready to send messages
     */
    public boolean isAlive();
    
    /**
     * Disconnects and releases any resources associated with {@code this}.
     */
    public void release();
    
}
