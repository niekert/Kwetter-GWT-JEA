/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.client.bus.impl.connection.poll;

import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.rpc.AsyncCallback;
import nl.fontys.fhict.jea.gwt.jee7.client.bus.BusListener;
import nl.fontys.fhict.jea.gwt.jee7.client.bus.impl.RPC_MIME_TYPE;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.ConnectionException;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.EncodeException;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.ServerIncoming;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.Connection;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.gwt.BusService;
import java.util.ArrayList;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.gwt.BusServiceAsync;

/**
 * Implements a long polling connection
 * @author jgeenen
 */
public class PollConnection implements Connection<ServerIncoming>, RequestCallback {
    
    private static long POLL_ID=0;
    private final BusListener listener;
    private final String url;
    private boolean alive=false;
    
    /**
     * 
     * @param url the url to connect to, must NOT contain a query string
     * @param listener the listener to report back to for this connection
     * @throws ConnectionException 
     */
    public PollConnection(String url, BusListener listener) throws ConnectionException{
        this.listener = listener;
        this.url=url;
        connect();        
    }
    
    protected final String createURL(){
        return new StringBuilder(url).append("?pid=").append(POLL_ID++).toString();
    }

    private void connect() throws ConnectionException {
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, createURL());
        requestBuilder.setTimeoutMillis(0);
        requestBuilder.setHeader("Accept", BusService.MIME_TYPE_GWT_RPC);
        try {
            requestBuilder.sendRequest("", this);
            alive=true;
        } catch (RequestException ex) {
            throw new ConnectionException(ex);
        }
    }

    @Override
    public void send(ArrayList<ServerIncoming> incomings) throws ConnectionException, EncodeException {
        BusServiceAsync.Util.getInstance().send(incomings, new AsyncCallback<Void>() {
            @Override
            public void onFailure(Throwable caught) {
                listener.onError(PollConnection.this, caught);
            }
            @Override
            public void onSuccess(Void result){}
        });
    }

    @Override
    public boolean isDurable() {
        return false;
    }

    @Override
    public boolean isAlive() {
        return alive;
    }

    @Override
    public void release() {
        alive=false;
    }

    @Override
    public void onResponseReceived(Request request, Response response) {
        try {
            listener.onIncoming(this, RPC_MIME_TYPE.decode(response.getText()));
            if(alive){
                alive=false;
                connect();
            }
        } catch (Throwable ex) {
            this.listener.onError(this, ex);
        }
    }

    @Override
    public void onError(Request request, Throwable exception) {
        listener.onError(this, exception);
        if(alive){
            try {
                alive=false;
                connect();
            } catch (ConnectionException ex) {
                listener.onError(this, ex);
            }
        } else {
            listener.onDestroy(this);
        }
    }
    
    
    
}
