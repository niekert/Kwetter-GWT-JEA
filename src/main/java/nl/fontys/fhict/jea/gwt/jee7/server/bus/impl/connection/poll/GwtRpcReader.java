/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.server.bus.impl.connection.poll;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.server.rpc.impl.ServerSerializationStreamReader;
import nl.fontys.fhict.jea.gwt.jee7.server.bus.impl.gwt.RpcSerializationPolicyProvider;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.ServerIncoming;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.gwt.BusService;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author jgeenen
 */
@Provider
@Consumes(BusService.MIME_TYPE_GWT_RPC)
public class GwtRpcReader implements MessageBodyReader<ArrayList<ServerIncoming>> {
    
    private final ServerSerializationStreamReader reader = RpcSerializationPolicyProvider.get().createReader();
    

    @Override
    public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return type==ArrayList.class;
    }

    @Override
    public ArrayList<ServerIncoming> readFrom(Class<ArrayList<ServerIncoming>> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, String> httpHeaders, InputStream entityStream) throws IOException, WebApplicationException {
        try {
            reader.prepareToRead(new java.util.Scanner(entityStream,BusService.CONTENT_ENCODING).useDelimiter("\\A").next());
            ArrayList<ServerIncoming> retval = (ArrayList<ServerIncoming>) reader.readObject();
            return retval;
        } catch (SerializationException ex) {
            throw new WebApplicationException("cannot be deserialized", Response.Status.BAD_REQUEST);
        }
    }
    
}
