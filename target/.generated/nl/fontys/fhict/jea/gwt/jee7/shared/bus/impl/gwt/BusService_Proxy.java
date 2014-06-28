package nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.gwt;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.RpcToken;
import com.google.gwt.user.client.rpc.RpcTokenException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class BusService_Proxy extends RemoteServiceProxy implements nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.gwt.BusServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.gwt.BusService";
  private static final String SERIALIZATION_POLICY ="E0B51D6431D99D241FD40B565C9CA48F";
  private static final nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.gwt.BusService_TypeSerializer SERIALIZER = new nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.gwt.BusService_TypeSerializer();
  
  public BusService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "com/mousepilots/bus/bs", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void connect(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("BusService_Proxy", "connect");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 0);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void send(java.util.ArrayList incoming, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("BusService_Proxy", "send");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.util.ArrayList/4159755760");
      streamWriter.writeObject(incoming);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  @Override
  public SerializationStreamWriter createStreamWriter() {
    ClientSerializationStreamWriter toReturn =
      (ClientSerializationStreamWriter) super.createStreamWriter();
    if (getRpcToken() != null) {
      toReturn.addFlags(ClientSerializationStreamWriter.FLAG_RPC_TOKEN_INCLUDED);
    }
    return toReturn;
  }
  @Override
  protected void checkRpcTokenType(RpcToken token) {
    if (!(token instanceof com.google.gwt.user.client.rpc.XsrfToken)) {
      throw new RpcTokenException("Invalid RpcToken type: expected 'com.google.gwt.user.client.rpc.XsrfToken' but got '" + token.getClass() + "'");
    }
  }
}
