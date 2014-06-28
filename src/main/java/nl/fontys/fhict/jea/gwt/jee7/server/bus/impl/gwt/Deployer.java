/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.server.bus.impl.gwt;

import com.google.gwt.user.server.rpc.SerializationPolicyLoader;
import nl.fontys.fhict.jea.gwt.jee7.server.bus.Config;
import nl.fontys.fhict.jea.gwt.jee7.shared.bus.impl.gwt.BusService;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Inits {@link RpcSerializationPolicyProvider}
 * @author jgeenen
 */
@WebListener
public class Deployer implements ServletContextListener{
    
    private static final Logger LOG = Logger.getLogger(Deployer.class.getName());
    
    @Inject
    RpcSerializationPolicyProvider provider;
    
    private void initSerializationPolicyProvider(final ServletContext ctx) throws IllegalStateException {
        final String modulePath = "/" + Config.MODULE_NAME + "/";
        try {
            for(Iterator<String> resourcePaths = ctx.getResourcePaths(modulePath).iterator(); resourcePaths.hasNext() && provider.getSerializationPolicy() == null; ) {
                String resourcePath = resourcePaths.next();
                if(resourcePath.endsWith(".gwt.rpc")){
                    final URL url = ctx.getResource(resourcePath);
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                        final String busServiceClassName = BusService.class.getName();
                        for (String line = reader.readLine(); provider.getSerializationPolicy() == null && line != null; line = reader.readLine()) {
                            if (line.contains(busServiceClassName)) {
                                provider.setSerializationPolicy(SerializationPolicyLoader.loadFromStream(url.openStream(), null));
                                LOG.log(Level.INFO, "loaded serialization policy {0} for bus communication", url);
                            }
                        }
                    }
                }
            }
        } catch (Throwable t) {
            throw new IllegalStateException("error scanning and/or parsing .gwt.rpc files in folder " + modulePath, t);
        }
        if(provider.getSerializationPolicy()==null){
            LOG.severe("no GWT serialization policy found in folder " + modulePath);
        }
    }

    @Override
    public final void contextInitialized(ServletContextEvent sce) {
        initSerializationPolicyProvider(sce.getServletContext());
        
    }


    @Override
    public void contextDestroyed(ServletContextEvent sce){}
}
