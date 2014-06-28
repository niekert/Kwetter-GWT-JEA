/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.server.bus.impl.connection.poll;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author jgeenen
 */
public class App extends Application{

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> retval = new HashSet<>();
        retval.add(PollManager.class);
        return retval;
    }
}
