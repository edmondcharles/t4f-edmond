package be.colours;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class DrawingLines extends Applet {

    private int width;
    private int height;
        
    public void init(){
        width = getSize().width;
        height=getSize().height;
        setBackground(Color.BLACK);
    }
    
    public void paint(Graphics graphics){
        graphics.setColor(Color.BLUE);
        graphics.drawLine(0, 0, width, height);
        for(int i =0; i<10; i++){
            graphics.drawLine(width, height, i*width/10, 0);
            
        }
    }

}
