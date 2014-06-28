package nl.fontys.fhict.jea.gwt.jee7.client.koch;

import com.google.gwt.core.client.Scheduler;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;

public class KochController {
	
	private final KochFractal fractal = new KochFractal();
	
	private final KochView view;
	
	private final Consumer<Edge> c = new Consumer<Edge>() {
		public void consume(Edge e) {
			view.drawEdge(e);
		}
	};
	

	public KochController(final KochView view) {
		super();
		this.view = view;
		view.levelField.setValue(1);
		fractal.addConsumer(c);
		view.calculateButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				calculate();
			}
		});
		
		view.increaseButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				int currentLevel = view.levelField.getValue();
				if(currentLevel<8 || (8<=currentLevel && Window.confirm("are you sure? this seems a bit much"))){
					view.levelField.setValue(++currentLevel);
				}
			}
		});
		view.decreaseButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				int currentLevel = view.levelField.getValue();
				if(1<currentLevel){
					view.levelField.setValue(--currentLevel);
				} else {
					Window.alert("level must be positive");
				}
			}
		});
		
	}
	
	private void calculate(){
                view.calculateButton.setEnabled(false);
		view.clear();
                Scheduler.get().scheduleDeferred(new Scheduler.ScheduledCommand() {
                    @Override
                    public void execute() {
                        fractal.setLevel(view.levelField.getValue());
                        fractal.generateLeftEdge();
                        fractal.generateRightEdge();
                        fractal.generateBottomEdge();
                        view.calculateButton.setEnabled(true);
                    }
                });
	}


}
