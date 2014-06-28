/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.client.bus.impl;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.ClientIncoming;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.DecodeException;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.EncodeException;
import java.util.ArrayList;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.gwt.BusServiceAsync;

/**
 * Client-side GWT-RPC encoder/decoder, depends on {@link BusServiceAsync}
 * @author jgeenen
 */
public class RPC_MIME_TYPE {
    
    private static final RemoteServiceProxy PROXY = (RemoteServiceProxy) BusServiceAsync.Util.getInstance();
    
    public static ArrayList<ClientIncoming> decode(String message) throws DecodeException{
        try {
            final SerializationStreamReader reader = PROXY.createStreamReader(message);
            return (ArrayList<ClientIncoming>) reader.readObject();
        } catch (SerializationException ex) {
            throw new DecodeException("cannot decode " + message, ex);
        }
    }
    
    public static String encode(ArrayList<ClientIncoming> incomings) throws EncodeException{
        try {
            final SerializationStreamWriter writer = PROXY.createStreamWriter();
            writer.writeObject(incomings);
            return writer.toString();
        } catch (SerializationException ex) {
            throw new EncodeException("cannot decode " + incomings, ex);
        }
    }
    
    
}
