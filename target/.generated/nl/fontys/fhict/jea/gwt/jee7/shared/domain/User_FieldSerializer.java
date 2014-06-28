package nl.fontys.fhict.jea.gwt.jee7.shared.domain;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class User_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getFollowers(nl.fontys.fhict.jea.gwt.jee7.shared.domain.User instance) /*-{
    return instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.User::followers;
  }-*/;
  
  private static native void setFollowers(nl.fontys.fhict.jea.gwt.jee7.shared.domain.User instance, java.util.List value) 
  /*-{
    instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.User::followers = value;
  }-*/;
  
  private static native java.util.List getLeaders(nl.fontys.fhict.jea.gwt.jee7.shared.domain.User instance) /*-{
    return instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.User::leaders;
  }-*/;
  
  private static native void setLeaders(nl.fontys.fhict.jea.gwt.jee7.shared.domain.User instance, java.util.List value) 
  /*-{
    instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.User::leaders = value;
  }-*/;
  
  private static native java.lang.String getPassword(nl.fontys.fhict.jea.gwt.jee7.shared.domain.User instance) /*-{
    return instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.User::password;
  }-*/;
  
  private static native void setPassword(nl.fontys.fhict.jea.gwt.jee7.shared.domain.User instance, java.lang.String value) 
  /*-{
    instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.User::password = value;
  }-*/;
  
  private static native java.lang.String getPicture(nl.fontys.fhict.jea.gwt.jee7.shared.domain.User instance) /*-{
    return instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.User::picture;
  }-*/;
  
  private static native void setPicture(nl.fontys.fhict.jea.gwt.jee7.shared.domain.User instance, java.lang.String value) 
  /*-{
    instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.User::picture = value;
  }-*/;
  
  private static native java.util.Collection getRoles(nl.fontys.fhict.jea.gwt.jee7.shared.domain.User instance) /*-{
    return instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.User::roles;
  }-*/;
  
  private static native void setRoles(nl.fontys.fhict.jea.gwt.jee7.shared.domain.User instance, java.util.Collection value) 
  /*-{
    instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.User::roles = value;
  }-*/;
  
  private static native java.util.List getTweets(nl.fontys.fhict.jea.gwt.jee7.shared.domain.User instance) /*-{
    return instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.User::tweets;
  }-*/;
  
  private static native void setTweets(nl.fontys.fhict.jea.gwt.jee7.shared.domain.User instance, java.util.List value) 
  /*-{
    instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.User::tweets = value;
  }-*/;
  
  private static native java.lang.String getUserName(nl.fontys.fhict.jea.gwt.jee7.shared.domain.User instance) /*-{
    return instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.User::userName;
  }-*/;
  
  private static native void setUserName(nl.fontys.fhict.jea.gwt.jee7.shared.domain.User instance, java.lang.String value) 
  /*-{
    instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.User::userName = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, nl.fontys.fhict.jea.gwt.jee7.shared.domain.User instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setFollowers(instance, (java.util.List) streamReader.readObject());
    setLeaders(instance, (java.util.List) streamReader.readObject());
    setPassword(instance, streamReader.readString());
    setPicture(instance, streamReader.readString());
    setRoles(instance, (java.util.Collection) streamReader.readObject());
    setTweets(instance, (java.util.List) streamReader.readObject());
    setUserName(instance, streamReader.readString());
    
  }
  
  public static nl.fontys.fhict.jea.gwt.jee7.shared.domain.User instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new nl.fontys.fhict.jea.gwt.jee7.shared.domain.User();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, nl.fontys.fhict.jea.gwt.jee7.shared.domain.User instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeObject(getFollowers(instance));
    streamWriter.writeObject(getLeaders(instance));
    streamWriter.writeString(getPassword(instance));
    streamWriter.writeString(getPicture(instance));
    streamWriter.writeObject(getRoles(instance));
    streamWriter.writeObject(getTweets(instance));
    streamWriter.writeString(getUserName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return nl.fontys.fhict.jea.gwt.jee7.shared.domain.User_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    nl.fontys.fhict.jea.gwt.jee7.shared.domain.User_FieldSerializer.deserialize(reader, (nl.fontys.fhict.jea.gwt.jee7.shared.domain.User)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    nl.fontys.fhict.jea.gwt.jee7.shared.domain.User_FieldSerializer.serialize(writer, (nl.fontys.fhict.jea.gwt.jee7.shared.domain.User)object);
  }
  
}
