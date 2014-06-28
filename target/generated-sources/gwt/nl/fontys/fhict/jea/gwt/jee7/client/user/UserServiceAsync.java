package nl.fontys.fhict.jea.gwt.jee7.client.user;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface UserServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see nl.fontys.fhict.jea.gwt.jee7.client.user.UserService
     */
    void login( java.lang.String userName, java.lang.String password, AsyncCallback<nl.fontys.fhict.jea.gwt.jee7.shared.domain.User> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see nl.fontys.fhict.jea.gwt.jee7.client.user.UserService
     */
    void logout( AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see nl.fontys.fhict.jea.gwt.jee7.client.user.UserService
     */
    void getNonLeadersForUser( java.lang.String username, AsyncCallback<java.util.List<nl.fontys.fhict.jea.gwt.jee7.shared.domain.User>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see nl.fontys.fhict.jea.gwt.jee7.client.user.UserService
     */
    void getAllUsers( AsyncCallback<java.util.List<nl.fontys.fhict.jea.gwt.jee7.shared.domain.User>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see nl.fontys.fhict.jea.gwt.jee7.client.user.UserService
     */
    void makeLeader( java.lang.String loggedInUserName, java.lang.String makeLeaderName, AsyncCallback<nl.fontys.fhict.jea.gwt.jee7.shared.domain.User> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see nl.fontys.fhict.jea.gwt.jee7.client.user.UserService
     */
    void unLeader( java.lang.String loggedInUserName, java.lang.String unLeaderName, AsyncCallback<nl.fontys.fhict.jea.gwt.jee7.shared.domain.User> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see nl.fontys.fhict.jea.gwt.jee7.client.user.UserService
     */
    void getImage( java.lang.String username, AsyncCallback<java.lang.String> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static UserServiceAsync instance;

        public static final UserServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (UserServiceAsync) GWT.create( UserService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
