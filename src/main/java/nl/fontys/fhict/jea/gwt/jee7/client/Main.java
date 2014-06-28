package nl.fontys.fhict.jea.gwt.jee7.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.CloseEvent;
import com.google.gwt.event.logical.shared.CloseHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import nl.fontys.fhict.jea.gwt.jee7.client.bus.BusClient;
import nl.fontys.fhict.jea.gwt.jee7.client.bus.BusListener;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.ClientIncoming;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.ServerIncoming;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.Connection;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.ConnectionException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import nl.fontys.fhict.jea.gwt.jee7.client.user.LoginListener;
import nl.fontys.fhict.jea.gwt.jee7.client.user.UserServiceAsync;
import nl.fontys.fhict.jea.gwt.jee7.shared.domain.User;
import nl.fontys.fhict.jea.gwt.jee7.client.vc.LoginWidget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Main implements EntryPoint {

    private static final Logger LOG = Logger.getLogger(Main.class.getName());

    private static Main INSTANCE;

    /**
     * @return the singleton instance of the {@link Main} module
     */
    public static Main INSTANCE() {
        return INSTANCE;
    }

    public Main() {
        super();
        INSTANCE = Main.this;
    }

    private final Messages messages = GWT.create(Messages.class);

    private User user;
    
    private void connect() throws ConnectionException {
        BusClient.connect(new BusListener() {

            @Override
            public void onCreate(Connection source) {
                LOG.info("created a new connection");
            }

            @Override
            public void onConnect(Connection source) {
                LOG.info("connected");
            }

            @Override
            public void onIncoming(Connection source, ArrayList<ClientIncoming> incoming) {
                StringBuilder m = new StringBuilder("received:");
                for(ClientIncoming ci : incoming){
                    m.append("\n\t*").append(ci);
                }
                LOG.info(m.toString());
            }

            @Override
            public void onError(Connection source, Throwable error) {
                LOG.log(Level.WARNING, source + " generated an error", error);
            }

            @Override
            public void onDisconnect(Connection source) {
                LOG.info("disconnected");
            }

            @Override
            public void onDestroy(Connection source) {
                LOG.info("destroyed " + source);
            }
        });
    }
    
    public static final Button LOGOUT_BUTTON = Button.wrap(Document.get().getElementById("logout"));

    private final ClickHandler logoutHandler = new ClickHandler() {
        @Override
        public void onClick(ClickEvent event) {
            LOGOUT_BUTTON.setEnabled(false);
            UserServiceAsync.Util.getInstance().logout(new AsyncCallback<Void>() {
                @Override
                public void onFailure(Throwable caught) {
                    LOGOUT_BUTTON.setEnabled(true);
                    Window.alert("you'd better close this mess");
                }
                @Override
                public void onSuccess(Void result) {
                    Window.Location.assign(GWT.getHostPageBaseURL());
                }
            });

        }
    };
    
    /**
     * is executed upon a user closing this' browser window
     */
    private final CloseHandler<Window> windowCloseHandler = new CloseHandler<Window>() {
        @Override
        public void onClose(CloseEvent<Window> event) {
            UserServiceAsync.Util.getInstance().logout(new AsyncCallback<Void>() {
                @Override
                public void onFailure(Throwable caught) {}
                @Override
                public void onSuccess(Void result) {}
            });
        }
    };

    /**
     * This is the entry point method.
     */
    @Override
    public void onModuleLoad() {
        LOGOUT_BUTTON.setEnabled(false);
        
        //add the window close handler
        Window.addCloseHandler(windowCloseHandler);

        //add logout handler to anchor in top right corner
        LOGOUT_BUTTON.addClickHandler(logoutHandler);
        
        //login
        new LoginWidget(messages, new LoginListener() {
            @Override
            public void onLogin(User user) {
                Main.this.user = user;
                try {
                    connect();
                } catch (ConnectionException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "couldn't connect", ex);
                }
            }
        }).start();
    }
    
    /**
     * @return the logged on user (if allready logged on)
     */
    public User getUser() {
        return user;
    }
}
