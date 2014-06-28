/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.server.test;

import nl.fontys.fhict.jea.gwt.jee7.server.bus.Session;
import nl.fontys.fhict.jea.gwt.jee7.server.bus.SessionListener;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.ServerIncoming;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.EncodeException;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.ConnectionException;

/**
 *
 * @author jgeenen
 */
@Stateless
@LocalBean
public class TestListener implements SessionListener{
    
    private static final Logger LOG = Logger.getLogger(TestListener.class.getName());

    @Override
    public void onCreate(Session source) {
        source.subscribe(Arrays.asList(PushyBean.TOPIC));
        LOG.log(Level.INFO, "subscribed {0} to topic \"{1}\"", new Object[]{source,PushyBean.TOPIC});
    }

    @Override
    public void onConnect(Session source) {
        LOG.log(Level.INFO, "connected {0}", source);
        try {
            source.flush();
        } catch (EncodeException ex) {
            Logger.getLogger(TestListener.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ConnectionException ex) {
            Logger.getLogger(TestListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void onIncoming(Session source, ArrayList<ServerIncoming> incoming) {
        LOG.log(Level.INFO, "received {0}", incoming);
    }

    @Override
    public void onError(Session source, Throwable error) {
        LOG.log(Level.OFF, source + " encountered an error", error);
    }

    @Override
    public void onDisconnect(Session source) {
        LOG.log(Level.INFO, "{0} disconnected", source);
    }

    @Override
    public void onDestroy(Session source) {
        LOG.log(Level.INFO, "{0} destroyed", source);
    }
    
}
