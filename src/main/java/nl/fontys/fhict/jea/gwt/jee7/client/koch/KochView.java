package nl.fontys.fhict.jea.gwt.jee7.client.koch;

import nl.fontys.fhict.jea.gwt.jee7.client.koch.Edge;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.SimplePanel;

public class KochView extends Composite {

	private static KochViewUiBinder uiBinder = GWT.create(KochViewUiBinder.class);
	
	@UiField PushButton decreaseButton;
	@UiField IntegerBox levelField;
	@UiField PushButton increaseButton;
	@UiField PushButton calculateButton;
	@UiField SimplePanel canvasPlaceholder;
	final Canvas canvas;
	final Context2d context2d;
	
	public static final int H=800, W=800;
	


	interface KochViewUiBinder extends UiBinder<Widget, KochView> {
	
	}

	public KochView() {
		initWidget(uiBinder.createAndBindUi(this));
		canvas = Canvas.createIfSupported();
		canvasPlaceholder.add(canvas);
		canvas.setHeight("100%");
		canvas.setWidth("100%");
		canvas.setCoordinateSpaceHeight(H);
		canvas.setCoordinateSpaceWidth(W);
		context2d=canvas.getContext2d();
		context2d.setFillStyle("black");
		clear();
	}
	
	public void clear(){
		this.context2d.fillRect(0, 0, H, W);
	}
	
	public void drawEdge(Edge edge){
		this.context2d.beginPath();
		this.context2d.setStrokeStyle(toHSL(edge.hue));
		this.context2d.moveTo(edge.X1*W,edge.Y1*H);
		this.context2d.lineTo(edge.X2*W,edge.Y2*H);
		this.context2d.stroke();
		this.context2d.closePath();
	}
	
	private static String toHSL(double hue){
		return  new StringBuilder("hsl(")
                        .append(360*hue)
                        .append(",75%,75%")
                        .toString();
	}
	
}
