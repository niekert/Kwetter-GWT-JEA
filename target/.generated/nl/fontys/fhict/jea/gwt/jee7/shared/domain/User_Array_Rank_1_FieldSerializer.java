package nl.fontys.fhict.jea.gwt.jee7.shared.domain;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class User_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, nl.fontys.fhict.jea.gwt.jee7.shared.domain.User[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static nl.fontys.fhict.jea.gwt.jee7.shared.domain.User[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new nl.fontys.fhict.jea.gwt.jee7.shared.domain.User[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, nl.fontys.fhict.jea.gwt.jee7.shared.domain.User[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return nl.fontys.fhict.jea.gwt.jee7.shared.domain.User_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    nl.fontys.fhict.jea.gwt.jee7.shared.domain.User_Array_Rank_1_FieldSerializer.deserialize(reader, (nl.fontys.fhict.jea.gwt.jee7.shared.domain.User[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    nl.fontys.fhict.jea.gwt.jee7.shared.domain.User_Array_Rank_1_FieldSerializer.serialize(writer, (nl.fontys.fhict.jea.gwt.jee7.shared.domain.User[])object);
  }
  
}
