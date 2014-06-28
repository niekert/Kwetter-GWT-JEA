/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.shared.bus.test;

import java.util.Date;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.ClientIncoming;

/**
 *
 * @author jgeenen
 */
public class CurrentTime implements ClientIncoming{

    private long time;
    
    // for GWT
    private CurrentTime(){
        
    }

    public CurrentTime(long time) {
        this.time = time;
    }
    
    
    
    @Override
    public String toString() {
        return "the server's local date/time is " + new Date(time);
    }
    
    
    
}
