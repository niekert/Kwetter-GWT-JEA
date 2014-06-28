package nl.fontys.fhict.jea.gwt.jee7.shared.tweet;

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

public class TweetService_Proxy extends RemoteServiceProxy implements nl.fontys.fhict.jea.gwt.jee7.shared.tweet.TweetServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "nl.fontys.fhict.jea.gwt.jee7.shared.tweet.TweetService";
  private static final String SERIALIZATION_POLICY ="5EA9DE3F9FA414B26E1C437D22C68702";
  private static final nl.fontys.fhict.jea.gwt.jee7.shared.tweet.TweetService_TypeSerializer SERIALIZER = new nl.fontys.fhict.jea.gwt.jee7.shared.tweet.TweetService_TypeSerializer();
  
  public TweetService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "tweet", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void tweet(nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet tweet, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("TweetService_Proxy", "tweet");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("nl.fontys.fhict.jea.gwt.jee7.shared.domain.Tweet/2757868596");
      streamWriter.writeObject(tweet);
      helper.finish(callback, ResponseReader.OBJECT);
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
