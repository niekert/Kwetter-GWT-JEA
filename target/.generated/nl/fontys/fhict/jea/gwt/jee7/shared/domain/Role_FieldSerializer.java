package nl.fontys.fhict.jea.gwt.jee7.shared.domain;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Role_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getDescription(nl.fontys.fhict.jea.gwt.jee7.shared.domain.Role instance) /*-{
    return instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.Role::description;
  }-*/;
  
  private static native void setDescription(nl.fontys.fhict.jea.gwt.jee7.shared.domain.Role instance, java.lang.String value) 
  /*-{
    instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.Role::description = value;
  }-*/;
  
  private static native java.lang.String getRoleName(nl.fontys.fhict.jea.gwt.jee7.shared.domain.Role instance) /*-{
    return instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.Role::roleName;
  }-*/;
  
  private static native void setRoleName(nl.fontys.fhict.jea.gwt.jee7.shared.domain.Role instance, java.lang.String value) 
  /*-{
    instance.@nl.fontys.fhict.jea.gwt.jee7.shared.domain.Role::roleName = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, nl.fontys.fhict.jea.gwt.jee7.shared.domain.Role instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setDescription(instance, streamReader.readString());
    setRoleName(instance, streamReader.readString());
    
  }
  
  public static nl.fontys.fhict.jea.gwt.jee7.shared.domain.Role instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new nl.fontys.fhict.jea.gwt.jee7.shared.domain.Role();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, nl.fontys.fhict.jea.gwt.jee7.shared.domain.Role instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeString(getDescription(instance));
    streamWriter.writeString(getRoleName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return nl.fontys.fhict.jea.gwt.jee7.shared.domain.Role_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    nl.fontys.fhict.jea.gwt.jee7.shared.domain.Role_FieldSerializer.deserialize(reader, (nl.fontys.fhict.jea.gwt.jee7.shared.domain.Role)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    nl.fontys.fhict.jea.gwt.jee7.shared.domain.Role_FieldSerializer.serialize(writer, (nl.fontys.fhict.jea.gwt.jee7.shared.domain.Role)object);
  }
  
}
