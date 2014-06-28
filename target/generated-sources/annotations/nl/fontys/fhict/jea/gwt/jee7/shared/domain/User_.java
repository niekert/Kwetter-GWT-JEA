package nl.fontys.fhict.jea.gwt.jee7.shared.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.Role;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.User;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-06-25T10:35:40")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> password;
    public static volatile ListAttribute<User, User> followers;
    public static volatile CollectionAttribute<User, Role> roles;
    public static volatile ListAttribute<User, User> leaders;
    public static volatile SingularAttribute<User, String> userName;
    public static volatile ListAttribute<User, Tweet> tweets;
    public static volatile SingularAttribute<User, String> picture;

}