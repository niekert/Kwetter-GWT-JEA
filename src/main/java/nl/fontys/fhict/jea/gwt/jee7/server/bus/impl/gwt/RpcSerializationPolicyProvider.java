/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.fontys.fhict.jea.gwt.jee7.server.bus.impl.gwt;

import com.google.gwt.user.server.rpc.SerializationPolicy;
import com.google.gwt.user.server.rpc.SerializationPolicyProvider;
import com.google.gwt.user.server.rpc.impl.ServerSerializationStreamReader;
import com.google.gwt.user.server.rpc.impl.ServerSerializationStreamWriter;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.CDI;

/**
 *
 * @author jgeenen
 */
@ApplicationScoped
public class RpcSerializationPolicyProvider implements SerializationPolicyProvider {

    private SerializationPolicy serializationPolicy;

    protected RpcSerializationPolicyProvider(){}

    void setSerializationPolicy(SerializationPolicy serializationPolicy) {
        this.serializationPolicy = serializationPolicy;
    }
    
    public static RpcSerializationPolicyProvider get(){
        return CDI.current().select(RpcSerializationPolicyProvider.class).get();
    }

    public SerializationPolicy getSerializationPolicy() {
        return serializationPolicy;
    }

    @Override
    public SerializationPolicy getSerializationPolicy(String moduleBaseURL, String serializationPolicyStrongName) {
        return serializationPolicy;
    }
    
    @Produces
    @Dependent
    public ServerSerializationStreamReader createReader(){
        return new ServerSerializationStreamReader(getClass().getClassLoader(), this);
    }
    
    @Produces
    @Dependent
    public ServerSerializationStreamWriter createWriter(){
        return new ServerSerializationStreamWriter(getSerializationPolicy());
    }

}
