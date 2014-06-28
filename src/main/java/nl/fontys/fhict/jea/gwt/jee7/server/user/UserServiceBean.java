/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.fontys.fhict.jea.gwt.jee7.server.user;

import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.google.gwt.user.client.Window;
import nl.fontys.fhict.jea.gwt.jee7.client.Main;
import nl.fontys.fhict.jea.gwt.jee7.server.util.Encryption;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.Role;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.User;

/**
 *
 * @author jgeenen
 */
@LocalBean
@Stateless
public class UserServiceBean {
    
    @PersistenceContext
    EntityManager entityManager;

    public User get(String userName){
        User u =  entityManager.find(User.class, userName);
        return u;
    }
    
    public void updateUser(User user) {
        entityManager.merge(user);
    }
    
    /**
     * Creates a new user
     * @param userName
     * @param password
     * @param roleNames
     * @return the newly created user
     * @throws IllegalStateException if the user allready exists
     */
    public User create(String userName, String password,Collection<String> roleNames) throws IllegalStateException{
        try {
            User user = new User(userName, Encryption.SHA256_BASE64(password));
            entityManager.persist(user);
            for(String roleName : roleNames){
                user.getRoles().add(entityManager.find(Role.class, roleName));
            }
            entityManager.flush();
            return user;
        } catch (EntityExistsException ex) {
            throw new IllegalStateException(ex);
        }
    }

    public List<User> getAllUsers()
    {
        Query q = entityManager.createQuery("select user from User user");
        return q.getResultList();
    }

    public User makeLeader(String userInvokingName, String userToMakeName){
        User userInvoking = this.get(userInvokingName);

        User userToMake = this.get(userToMakeName);

        if(!userInvoking.getLeaders().contains(userToMake))
        {
            userInvoking.getLeaders().add(userToMake);
            entityManager.merge(userInvoking);
            entityManager.flush();

            return userToMake;
        } else {
            return null;
        }

    }

    public User unLeader(String invokingUserName, String userToUnleader){
        User userInvoking = this.get(invokingUserName);

        int indexToRemove = -1;
        for (int i = 0; i < userInvoking.getLeaders().size(); i++)
        {
            User curLeader = userInvoking.getLeaders().get(i);
            if(curLeader.getUserName().equals(userToUnleader)){
                indexToRemove = i;
                break;
            }
        }

        if(indexToRemove > -1){
            User toRemove = userInvoking.getLeaders().get(indexToRemove);
            userInvoking.getLeaders().remove(indexToRemove);
            entityManager.merge(userInvoking);
            entityManager.flush();

            return toRemove;
        } else {
            return null;
        }
    }

    public void setPicture(String username, String picture){
        User user = this.get(username);
        user.setPicture(picture);
        entityManager.merge(user);

        entityManager.flush();
    }


}
