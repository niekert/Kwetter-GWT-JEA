/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.fontys.fhict.jea.gwt.jee7.server.tweet;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import nl.fontys.fhict.jea.gwt.jee7.server.util.Encryption;
import nl.fontys.fhict.jea.gwt.jee7.shared.tweet.TweetService;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.Role;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.User;

import java.util.List;

/**
 * EJB backend for {@link TweetService}
 * @author jgeenen
 */

@Stateless
@LocalBean
@RolesAllowed({Role.CIVIL_SERVANT,Role.POLICEMAN})
public class TweetServiceBean implements TweetService{
    
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Tweet tweet(Tweet tweet) {
        try {
            tweet.setAuthor(entityManager.find(User.class, tweet.getAuthor().getUserName()));
            entityManager.persist(tweet);
            entityManager.flush();
            return tweet;
        } catch (EntityExistsException ex) {
            throw new IllegalStateException(ex);
        }
    }
}
