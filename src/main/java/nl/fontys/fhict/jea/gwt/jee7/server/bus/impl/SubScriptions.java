/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.server.bus.impl;

import nl.fontys.fhict.jea.gwt.jee7.server.bus.Session;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SubScriptions {
    
    private final Map<String, Set<SessionImpl>> topicToSessions = new ConcurrentHashMap<>();

    /**
     * @param topic the topic
     * @return an unmodifiable non-{@code null} but possibly empty thread-safe
     * {@link Set} of {@link Session}s subscribed to the {@code topic}
     */
    public Set<SessionImpl> get(String topic) {
        final Set<SessionImpl> retval = topicToSessions.get(topic);
        return retval == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(retval);
    }

    protected void onSubscribe(SessionImpl session, Collection<String> topics) {
        for (String topic : topics) {
            Set<SessionImpl> sessions;
            synchronized (topicToSessions) {
                sessions = topicToSessions.get(topic);
                if (sessions == null) {
                    sessions = Collections.synchronizedSet(new HashSet<SessionImpl>());
                    topicToSessions.put(topic, sessions);
                }
            }
            sessions.add(session);
        }
    }

    protected void onUnsubscribe(SessionImpl session, Collection<String> topics) {
        synchronized (topicToSessions) {
            for (String topic : topics) {
                final Set<SessionImpl> sessions = topicToSessions.get(topic);
                if (sessions != null) {
                    sessions.remove(session);
                    if (sessions.isEmpty()) {
                        topicToSessions.remove(topic);
                    }
                }
            }
        }
    }    
}
