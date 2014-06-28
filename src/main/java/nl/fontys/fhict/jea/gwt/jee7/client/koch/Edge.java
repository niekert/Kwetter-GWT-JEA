/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.fontys.fhict.jea.gwt.jee7.client.koch;

/**
 *
 * @author Peter Boots
 * @author Jurjen van Geenen (GWT adaptation)
 */
public class Edge {
    public double X1, Y1, X2, Y2;
    public float hue;
    
    public Edge(double X1, double Y1, double X2, double Y2, float hue) {
        this.X1 = X1;
        this.Y1 = Y1;
        this.X2 = X2;
        this.Y2 = Y2;
        this.hue = hue;
    }
}
