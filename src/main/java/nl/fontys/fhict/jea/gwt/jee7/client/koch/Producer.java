package nl.fontys.fhict.jea.gwt.jee7.client.koch;

import java.util.LinkedList;

public abstract class Producer<P> {

    private LinkedList<Consumer<P>> consumers = new LinkedList<Consumer<P>>();

    protected void onProduction(P production) {
        for (Consumer<P> consumer : consumers) {
            consumer.consume(production);
        }
    }

    public void addConsumer(Consumer<P> c) {
        this.consumers.add(c);
    }

    public void removeConsumer(Consumer<P> c) {
        this.consumers.remove(c);
    }

}
