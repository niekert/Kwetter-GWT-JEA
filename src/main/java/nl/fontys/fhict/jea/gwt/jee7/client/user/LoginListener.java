/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.fontys.fhict.jea.gwt.jee7.client.user;

import nl.fontys.fhict.jea.gwt.jee7.shared.domain.User;



/**
 *
 * @author jgeenen
 */
public interface LoginListener {
    /**
     * callback for a succesful login
     * @param user 
     */
    void onLogin(User user);
}
