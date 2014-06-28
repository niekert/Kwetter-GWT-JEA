package nl.fontys.fhict.jea.gwt.jee7.shared.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.User;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-06-25T10:35:40")
@StaticMetamodel(Tweet.class)
public class Tweet_ { 

    public static volatile SingularAttribute<Tweet, Long> creationTimeMillis;
    public static volatile SingularAttribute<Tweet, User> author;
    public static volatile SingularAttribute<Tweet, Long> id;
    public static volatile SingularAttribute<Tweet, String> text;

}