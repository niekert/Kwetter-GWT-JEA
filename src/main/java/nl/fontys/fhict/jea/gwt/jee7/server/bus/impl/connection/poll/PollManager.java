/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.server.bus.impl.connection.poll;

import nl.fontys.fhict.jea.gwt.jee7.server.bus.impl.SessionImpl;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.gwt.BusService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.Context;

/**
 *
 * @author jgeenen
 */
@Path("/poll")
@ApplicationScoped
public class PollManager {

    private static final Logger LOG = Logger.getLogger(PollManager.class.getName());
    
    @Path("/long")
    @GET
    @Produces(BusService.MIME_TYPE_GWT_RPC)
    public void onLongPoll(final @Suspended AsyncResponse asyncResponse, final @Context HttpServletRequest httpServletRequest){
        final SessionImpl session = SessionImpl.get(httpServletRequest.getSession());
        new LongPoll(session, asyncResponse).start();
        LOG.log(Level.INFO, "started long poll for {0}", httpServletRequest.getRemoteUser());
    }    
}
