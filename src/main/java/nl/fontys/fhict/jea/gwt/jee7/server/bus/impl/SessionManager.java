/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.server.bus.impl;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;

/**
 *
 * @author jgeenen
 */
@WebListener
public class SessionManager implements javax.servlet.http.HttpSessionListener{

    @Override
    public void sessionCreated(HttpSessionEvent se) {
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        SessionImpl.get(se.getSession()).onPredestroy();
    }
    
    
    
}
