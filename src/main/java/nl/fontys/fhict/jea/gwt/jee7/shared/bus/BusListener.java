/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.shared.bus;

import java.util.ArrayList;

/**
 * 
 * @author jgeenen
 * @param <S> the event source
 * @param <I> the incoming message-type
 */
public interface BusListener<S,I> {
    
    /**
     * @param source 
     */
    void onCreate(S source);
    
    /**
     * @param source 
     */
    void onConnect(S source);

    /**
     * Receives notification of incoming messages
     * @param source
     * @param incoming 
     */
    void onIncoming(S source, ArrayList<I> incoming);
    
    
    /**
     * @param source
     * @param error 
     */
    void onError(S source, Throwable error);

    /**
     * @param source 
     */
    void onDisconnect(S source);
    

    /**
     * @param source 
     */
    void onDestroy(S source);
    
}
