package nl.fontys.fhict.jea.gwt.jee7.shared.domain;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Tweet_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native nl.fontys.fhict.jea.gwt.jee7.shared.domain.User getAuthor(nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet instance) /*-{
    return instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet::author;
  }-*/;
  
  private static native void setAuthor(nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet instance, nl.fontys.fhict.jea.gwt.jee7.shared.domain.User value) 
  /*-{
    instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet::author = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getCreationTimeMillis(nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet instance) /*-{
    return instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet::creationTimeMillis;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setCreationTimeMillis(nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet instance, long value) 
  /*-{
    instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet::creationTimeMillis = value;
  }-*/;
  
  private static native java.lang.Long getId(nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet instance) /*-{
    return instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet::id;
  }-*/;
  
  private static native void setId(nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet instance, java.lang.Long value) 
  /*-{
    instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet::id = value;
  }-*/;
  
  private static native java.lang.String getText(nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet instance) /*-{
    return instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet::text;
  }-*/;
  
  private static native void setText(nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet instance, java.lang.String value) 
  /*-{
    instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet::text = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setAuthor(instance, (nl.fontys.fhict.jea.gwt.jee7.shared.domain.User) streamReader.readObject());
    setCreationTimeMillis(instance, streamReader.readLong());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setText(instance, streamReader.readString());
    
  }
  
  public static nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeObject(getAuthor(instance));
    streamWriter.writeLong(getCreationTimeMillis(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getText(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet_FieldSerializer.deserialize(reader, (nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet_FieldSerializer.serialize(writer, (nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet)object);
  }
  
}
