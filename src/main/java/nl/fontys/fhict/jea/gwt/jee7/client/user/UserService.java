package nl.fontys.fhict.jea.gwt.jee7.client.user;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.User;

import java.util.List;

/**
 * Provides {@link User}-related services
 */
@RemoteServiceRelativePath("user")
public interface UserService extends RemoteService {
    
    /**
     * Performs a login with the supplied credentials
     * @param userName
     * @param password
     * @return the {@link User} object upon succesful login
     * @throws LoginException if login fails due to a wrong credentials or container error
     */
    public User login(String userName, String password) throws LoginException;
    
    /**
     * Invalidates the requestor's session, if any
     */
    public void logout();

    public List<User> getNonLeadersForUser(String username);

    public List<User> getAllUsers();

    public User makeLeader(String loggedInUserName, String makeLeaderName);

    public User unLeader(String loggedInUserName, String unLeaderName);

    public String getImage(String username);


}
