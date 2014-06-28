/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.fontys.fhict.jea.gwt.jee7.shared.tweet;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.User;

import java.util.List;

/**
 * Allows authors to publish new {@link Tweet}s
 * @author jgeenen
 */
@RemoteServiceRelativePath("tweet")
public interface TweetService extends RemoteService {
    
    /**
     * Invoked by the {@code tweet}'s author upon creation of a new tweet. Persists
     * the {@code tweet}, links it to the author, and pushes it asynchronously
     * to each of the author's followers.
     * @param tweet a new {@link Tweet}
     * @return the persisted {@code tweet}
     */
    public Tweet tweet(Tweet tweet);

}