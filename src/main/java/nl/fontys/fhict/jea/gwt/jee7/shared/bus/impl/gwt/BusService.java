/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.gwt;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.ClientIncoming;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.ServerIncoming;
import java.util.ArrayList;

/**
 * A dummy interface which lets GWT generate RPC serialization policies for your concrete subtypes of {@link ClientIncoming} and {@link ServerIncoming}. There is no
 * {@link RemoteServiceServlet} backing this interface: it is just here for (de-)serialization.
 * @author jgeenen
 */
@RemoteServiceRelativePath(BusService.REMOTE_SERVICE_RELATIVE_PATH)
public interface BusService extends RemoteService{
    
    public static final String REMOTE_SERVICE_RELATIVE_PATH="com/mousepilots/bus/bs";
    
    public static final String CONTENT_ENCODING="UTF-8";
    
    /**
     * the official GWT-RPC mime type, see <a href="https://docs.google.com/document/d/1eG0YocsYYbNAtivkLtcaiEE5IOF5u4LUol8-LL0TIKU/edit"> manual</a>
     * 
     */
    public static final String MIME_TYPE_GWT_RPC="gwt/x-gwt-rpc";
    
    /**
     * @return {@code null}
     * @throws UnsupportedOperationException always
     */
    ArrayList<ClientIncoming> connect() throws UnsupportedOperationException;
    
    /**
     * @param incoming 
     */
    void send(ArrayList<ServerIncoming> incoming);
    
}
