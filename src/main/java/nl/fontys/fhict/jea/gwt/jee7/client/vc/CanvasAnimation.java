/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.fontys.fhict.jea.gwt.jee7.client.vc;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.dom.client.ImageElement;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Image;

/**
 *
 * @author jgeenen
 */
public class CanvasAnimation {
    
    public abstract class StartListener{
        abstract void onStart();
    }
    
    private final Canvas canvas;
    private final Context2d context2d;
    private double x=0;
    private double width,height;
    private double translateY;
    private double a;
    private double b;
    private final Image image;
    
    private boolean shouldBeRunning=false;

    public CanvasAnimation(Image backGround, Canvas canvas) {
        this.canvas=canvas;
        context2d = canvas.getContext2d();
        this.image = backGround;
    }
    
    private void calculateDimensions(){
        width= context2d.getCanvas().getClientWidth();
        height=context2d.getCanvas().getClientHeight();
        canvas.setCoordinateSpaceWidth((int) width);
        canvas.setCoordinateSpaceHeight((int) height);
        translateY = 0.50*height;
        a = 0.8*translateY;
        b = (4*Math.PI)/width;
    }
    
    private void setBackGround(){
        final double imageOffsetX, imageOffsetY;
        double imageWidth = image.getWidth(), imageHeight = image.getHeight();
        double canvasWidth = canvas.getCoordinateSpaceWidth(), canvasHeight = canvas.getCoordinateSpaceHeight();
        double horizontalScale = canvasWidth/imageWidth, verticalScale = canvasHeight/imageHeight;
        final double targetWidth,targetHeight;
        context2d.setShadowColor("#9DDEFF");
        context2d.setFillStyle("#9DDEFF");
        if(horizontalScale<verticalScale){
            //image is wider
            imageOffsetX=0;
            imageOffsetY = 0.5 * (canvasHeight-(horizontalScale*imageHeight));
            context2d.setShadowBlur(imageOffsetY);
            targetWidth = canvasWidth;
            targetHeight= horizontalScale * imageHeight;
        } else {
            //image is taller
            imageOffsetX =  0.5 * (canvasWidth-(verticalScale*imageWidth));
            imageOffsetY=0;
            context2d.setShadowBlur(imageOffsetX);
            targetWidth = verticalScale * imageWidth;
            targetHeight= canvasHeight;

        }
        context2d.drawImage(ImageElement.as(image.getElement()), imageOffsetX, imageOffsetY,targetWidth,targetHeight);
    }
    
    
    
    private int getY(){
        return (int) Math.round( (a*Math.sin(b*x)) + translateY);
    }

    private void drawFrame(){
        if(width<x){
            context2d.clearRect(0, 0, width, height);
            x=0;
        }
        if(x==0){
            context2d.setGlobalAlpha(1.0);
            setBackGround();
            context2d.setShadowBlur(32);
            context2d.setGlobalAlpha(0.75);
        }
        final int y = getY();
        context2d.fillRect(x-1, y-1, 2, 2);
        x+=0.25;
    }

    public void start() {
        shouldBeRunning=true;
        new Timer(){
            @Override
            public void run() {
                if(shouldBeRunning){
                    if(width<1 && height<1){
                        calculateDimensions();
                    } else {
                        drawFrame();
                    }
                } else {
                    this.cancel();
                }
            }
        }.scheduleRepeating(25);
    }
    
    public void stop(){
        shouldBeRunning=false;
    }

    public boolean isRunning() {
        return shouldBeRunning;
    }
}
