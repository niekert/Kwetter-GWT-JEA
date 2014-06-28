/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.client.bus;

import com.google.gwt.core.client.GWT;
import nl.fontys.fhict.jea.gwt.jee7.client.bus.impl.connection.poll.PollConnection;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.ServerIncoming;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.Connection;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.ConnectionException;

/**
 *
 * @author jgeenen
 */
public class BusClient {
    
    private static final String URL = GWT.getModuleBaseURL() + "bus/poll/long";

    public static Connection<ServerIncoming> connect(BusListener listener) throws ConnectionException{
        return new PollConnection(URL, listener);
    }
}
