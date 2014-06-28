package nl.fontys.fhict.jea.gwt.jee7.client.koch;

/**
 * 
 * @author Jurjen van Geenen (GWT adaptation)
 *
 * @param <P> the type of the productions
 */
public interface Consumer<P> {
	
	void consume(P production);

}
