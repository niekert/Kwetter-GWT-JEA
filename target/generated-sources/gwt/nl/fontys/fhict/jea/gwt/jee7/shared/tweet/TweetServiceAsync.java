package nl.fontys.fhict.jea.gwt.jee7.shared.tweet;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface TweetServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see nl.fontys.fhict.jea.gwt.jee7.shared.tweet.TweetService
     */
    void tweet( nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet tweet, AsyncCallback<nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static TweetServiceAsync instance;

        public static final TweetServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (TweetServiceAsync) GWT.create( TweetService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
