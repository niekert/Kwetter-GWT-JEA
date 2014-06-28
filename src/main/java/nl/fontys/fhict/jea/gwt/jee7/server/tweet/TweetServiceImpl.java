/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.fontys.fhict.jea.gwt.jee7.server.tweet;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;

import nl.fontys.fhict.jea.gwt.jee7.shared.domain.User;
import nl.fontys.fhict.jea.gwt.jee7.shared.tweet.TweetService;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.Role;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet;

import java.util.List;

/**
 *
 * @author jgeenen
 */
@RolesAllowed({Role.CIVIL_SERVANT,Role.POLICEMAN})
@WebServlet(name = "TweetServiceImpl", urlPatterns = {"/Main/tweet"})
public class TweetServiceImpl extends RemoteServiceServlet implements TweetService{

    @EJB
    TweetServiceBean tweetServiceBean;

    @Override
    public Tweet tweet(Tweet tweet) {
        return tweetServiceBean.tweet(tweet);
    }
}
