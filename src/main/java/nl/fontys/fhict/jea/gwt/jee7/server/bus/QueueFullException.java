/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.server.bus;

/**
 *
 * @author jgeenen
 */
public class QueueFullException extends Exception {

    public QueueFullException() {
    }

    public QueueFullException(String message) {
        super(message);
    }

    public QueueFullException(String message, Throwable cause) {
        super(message, cause);
    }

}
