/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.server.bus.impl.connection.poll;

import nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.Connection;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.ConnectionException;
import nl.fontys.fhict.jea.gwt.jee7.server.bus.impl.SessionImpl;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.ClientIncoming;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.EncodeException;
import java.util.ArrayList;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.CompletionCallback;

/**
 *
 * @author jgeenen
 */

public class LongPoll implements Connection<ClientIncoming>, CompletionCallback{
    
    private final SessionImpl session;
    
    private final AsyncResponse asyncResponse;
    
    public LongPoll(SessionImpl sessionImpl, AsyncResponse asyncResponse) {
        this.asyncResponse = asyncResponse;
        this.session = sessionImpl;
    }

    public void start() {
        this.session.setConnection(this);
        this.asyncResponse.register(this);
    }
    
    @Override
    public void send(ArrayList<ClientIncoming> clientIncomings) throws ConnectionException, EncodeException {
        try{
            asyncResponse.resume(clientIncomings);
        } catch(Throwable t){
            throw new ConnectionException(t);
        }
    }
    
    @Override
    public boolean isDurable() {
        return false;
    }

    @Override
    public boolean isAlive() {
        return asyncResponse.isSuspended();
    }

    @Override
    public void release() {
        if(isAlive()){
            asyncResponse.cancel();
        }
    }

    @Override
    public void onComplete(Throwable throwable) {
        session.onDisconnect(this);
    }
}
