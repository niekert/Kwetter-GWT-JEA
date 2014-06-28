package nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.gwt;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface BusServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.gwt.BusService
     */
    void connect( AsyncCallback<java.util.ArrayList<nl.fontys.fhict.jea.gwt.jee7.shared.bus.ClientIncoming>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.gwt.BusService
     */
    void send( java.util.ArrayList<nl.fontys.fhict.jea.gwt.jee7.shared.bus.ServerIncoming> incoming, AsyncCallback<Void> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static BusServiceAsync instance;

        public static final BusServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (BusServiceAsync) GWT.create( BusService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
