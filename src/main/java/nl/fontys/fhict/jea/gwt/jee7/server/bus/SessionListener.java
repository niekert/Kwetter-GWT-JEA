/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.server.bus;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.BusListener;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.ServerIncoming;
import javax.inject.Inject;

/**
 * serverside {@link Session}-event listener which must be implemented in a stateless {@link Inject}able CDI bean:
 * either a {@link Stateless} EJB or an {@link ApplicationScoped} bean.
 * @author jgeenen
 */
public interface SessionListener extends BusListener<Session,ServerIncoming>{}
