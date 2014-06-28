package nl.fontys.fhict.jea.gwt.jee7.server.user;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import nl.fontys.fhict.jea.gwt.jee7.client.user.LoginException;
import nl.fontys.fhict.jea.gwt.jee7.client.user.UserService;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.User;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Server-side implementation of {@link UserService}.
 */
@WebServlet(urlPatterns = "/Main/user")
public class UserServiceImpl extends RemoteServiceServlet implements UserService {
    
    @EJB
    UserServiceBean userServiceBean;
    
    @Override
    public User login(String userName, String password) throws LoginException{
        //check to see if user allready logged in
        String remoteUser = getThreadLocalRequest().getRemoteUser();
        try {
            if(remoteUser==null){
                //no: perform login
                getThreadLocalRequest().login(userName, password);
                remoteUser=userName;
            }
            return userServiceBean.get(remoteUser);
        } catch (ServletException ex) {
            Logger.getLogger(getClass().getName()).log(Level.FINE, "encountered bad credentials userName={0} and password={1} from {2}", new Object[]{userName,password,getThreadLocalRequest().getRemoteAddr()});
        } catch(EJBException ex){
            Logger.getLogger(getClass().getName()).log(Level.WARNING, "EJB error upon login", ex);
            getThreadLocalRequest().getSession().invalidate();
        }
        throw new LoginException();
    }

    @Override
    public void logout() {
        final HttpServletRequest threadLocalRequest = getThreadLocalRequest();
        final String userName = threadLocalRequest.getRemoteUser();
        if(userName!=null){
            threadLocalRequest.getSession().invalidate();
            Logger.getLogger(getClass().getName()).log(Level.INFO, "{0} logged out", userName);
        }
    }

    @Override
    public List<User> getNonLeadersForUser(String username)
    {
        return userServiceBean.getAllUsers();
    }

    @Override
    public List<User> getAllUsers()
    {
        return userServiceBean.getAllUsers();
    }

    @Override
    public User makeLeader(String loggedInUserName, String makeLeaderName)
    {
        return userServiceBean.makeLeader(loggedInUserName, makeLeaderName);
    }

    @Override
    public User unLeader(String loggedInUserName, String unLeaderName)
    {
        return userServiceBean.unLeader(loggedInUserName, unLeaderName);
    }

    @Override
    public String getImage(String username)
    {
        User user = userServiceBean.get(username);
        return user.getPicture();
    }

}
