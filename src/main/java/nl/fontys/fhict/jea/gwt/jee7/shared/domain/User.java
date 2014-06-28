/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.fontys.fhict.jea.gwt.jee7.shared.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author jgeenen
 */
@Entity
@Table(name="USERTABLE")
public class User implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    private String userName;
    
    private String password;
    
    @Lob
    private String picture;
    
    @JoinTable(name="USER_ROLE",
        joinColumns=
            @JoinColumn(name="USERNAME", referencedColumnName="userName"),
        inverseJoinColumns=
        @JoinColumn(name="ROLENAME", referencedColumnName="roleName")
    )
    @ManyToMany(cascade={CascadeType.ALL},fetch = FetchType.EAGER)
    private Collection<Role> roles = new ArrayList<Role>();
    
    
    @JoinTable(
        joinColumns = {
            @JoinColumn(name = "leaderUserName", referencedColumnName = "userName")
        }, 
        inverseJoinColumns = {
            @JoinColumn(name = "followerUserName", referencedColumnName = "userName")
        }
    )
    @ManyToMany(fetch = FetchType.EAGER)
    private List<User> leaders = new ArrayList<User>();
    
    @ManyToMany(mappedBy ="leaders",fetch = FetchType.EAGER)
    private List<User> followers = new ArrayList<User>();
    
    @OneToMany(mappedBy = "author",fetch = FetchType.EAGER)
    @OrderBy("creationTimeMillis ASC")
    private List<Tweet> tweets = new ArrayList<Tweet>();

    
    
    public User() {
    }

    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }
    
    
    public List<User> getLeaders() {
        return leaders;
    }

    public void setLeaders(List<User> leaders) {
        this.leaders = leaders;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    
    public void addTweet(Tweet tweet) {
        this.tweets.add(tweet);
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if ((this.userName == null) ? (other.userName != null) : !this.userName.equals(other.userName)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (this.userName != null ? this.userName.hashCode() : 0);
        return hash;
    }
    
    
    
    
    
}
