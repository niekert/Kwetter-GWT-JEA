/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.server.test;

import java.util.Comparator;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet;

/**
 *
 * @author Niek
 */
public class TweetComparer implements Comparator<Tweet> {

    @Override
    public int compare(Tweet o1, Tweet o2) {
        if(o1.getCreationTimeMillis() < o2.getCreationTimeMillis())
        {
            return -1;
        } else if(o1.getCreationTimeMillis() > o2.getCreationTimeMillis()){
            return 1;
        } else {
            return 0;
        }
    }
    
}
