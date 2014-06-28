/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.fontys.fhict.jea.gwt.jee7.server.bus;

import nl.fontys.fhict.jea.gwt.jee7.shared.bus.ClientIncoming;


/**
 * Specified the {@link Bus}' configuration
 *
 * @author jgeenen
 */
public class Config{

    /**
     * Determines the maximum number of {@link ClientIncoming}s allowed in a
     * queue for any {@link Session}. A queue is stored in the {@link Session}'s
     * {@link javax.servlet.http.HttpSession}: it prevents message loss between reconnections of a
     * {@link Session} by a bus-client. When using long polling,
     * reconnections happen after each delivery hence queuing is vital. When
     * using websockets, reconnections are infrequent and typically due to
     * network errors. If a message cannot be queued because the queue is full,
     * the message is lost for that {@link Session}. Hence the queue size must
     * be chosen with the following considerations in mind:
     * <ol>
     * <li>setting it low leads to lower memory consumption when dealing with
     * poor throughput (high network load, slow networks)</li>
     * <li>setting it high leads to a smaller chance of message loss</li>
     * </ol>
     */
    public static final byte QUEUE_SIZE=30;

    
    /**
     * your GWT module name
     */
    public static final String MODULE_NAME="Main";
    
}
