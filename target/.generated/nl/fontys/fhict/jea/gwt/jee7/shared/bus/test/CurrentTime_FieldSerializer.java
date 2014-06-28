package nl.fontys.fhict.jea.gwt.jee7.shared.bus.test;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class CurrentTime_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getTime(nl.fontys.fhict.jea.gwt.jee7.shared.bus.test.CurrentTime instance) /*-{
    return instance.@nl.fontys.fhict.jea.gwt.jee7.shared.bus.test.CurrentTime::time;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setTime(nl.fontys.fhict.jea.gwt.jee7.shared.bus.test.CurrentTime instance, long value) 
  /*-{
    instance.@nl.fontys.fhict.jea.gwt.jee7.shared.bus.test.CurrentTime::time = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, nl.fontys.fhict.jea.gwt.jee7.shared.bus.test.CurrentTime instance) throws SerializationException {
    setTime(instance, streamReader.readLong());
    
  }
  
  public static native nl.fontys.fhict.jea.gwt.jee7.shared.bus.test.CurrentTime instantiate(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @nl.fontys.fhict.jea.gwt.jee7.shared.bus.test.CurrentTime::new()();
  }-*/;
  
  public static void serialize(SerializationStreamWriter streamWriter, nl.fontys.fhict.jea.gwt.jee7.shared.bus.test.CurrentTime instance) throws SerializationException {
    streamWriter.writeLong(getTime(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return nl.fontys.fhict.jea.gwt.jee7.shared.bus.test.CurrentTime_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    nl.fontys.fhict.jea.gwt.jee7.shared.bus.test.CurrentTime_FieldSerializer.deserialize(reader, (nl.fontys.fhict.jea.gwt.jee7.shared.bus.test.CurrentTime)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    nl.fontys.fhict.jea.gwt.jee7.shared.bus.test.CurrentTime_FieldSerializer.serialize(writer, (nl.fontys.fhict.jea.gwt.jee7.shared.bus.test.CurrentTime)object);
  }
  
}
