/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.server.bus.impl.connection.poll;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.server.rpc.impl.ServerSerializationStreamWriter;
import nl.fontys.fhict.jea.gwt.jee7.server.bus.impl.gwt.RpcSerializationPolicyProvider;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.ClientIncoming;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.gwt.BusService;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author jgeenen
 */
@Provider
@Produces(BusService.MIME_TYPE_GWT_RPC)
public class GwtRpcWriter implements MessageBodyWriter<ArrayList<ClientIncoming>>{

    private final ServerSerializationStreamWriter writer = RpcSerializationPolicyProvider.get().createWriter();
    
    @Override
    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return type==ArrayList.class;
    }

    @Override
    public long getSize(ArrayList<ClientIncoming> t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return -1;
    }

    @Override
    public void writeTo(ArrayList<ClientIncoming> t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) throws IOException, WebApplicationException {
        try {
            writer.prepareToWrite();
            writer.writeObject(t);
            entityStream.write(writer.toString().getBytes("UTF-8"));
        } catch (SerializationException ex) {
            throw new IOException("cannot serialize " + t, ex);
        }
    }
    
}
