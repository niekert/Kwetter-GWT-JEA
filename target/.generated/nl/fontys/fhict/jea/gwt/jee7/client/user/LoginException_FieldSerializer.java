package nl.fontys.fhict.jea.gwt.jee7.client.user;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class LoginException_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, nl.fontys.fhict.jea.gwt.jee7.client.user.LoginException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static nl.fontys.fhict.jea.gwt.jee7.client.user.LoginException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new nl.fontys.fhict.jea.gwt.jee7.client.user.LoginException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, nl.fontys.fhict.jea.gwt.jee7.client.user.LoginException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return nl.fontys.fhict.jea.gwt.jee7.client.user.LoginException_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    nl.fontys.fhict.jea.gwt.jee7.client.user.LoginException_FieldSerializer.deserialize(reader, (nl.fontys.fhict.jea.gwt.jee7.client.user.LoginException)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    nl.fontys.fhict.jea.gwt.jee7.client.user.LoginException_FieldSerializer.serialize(writer, (nl.fontys.fhict.jea.gwt.jee7.client.user.LoginException)object);
  }
  
}
