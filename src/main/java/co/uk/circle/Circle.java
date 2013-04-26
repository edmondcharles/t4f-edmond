package co.uk.circle;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Applet {
    
    private int height;
    private int width;
    
    @Override
    public void init(){
        
        this.height= this.getHeight();
        
        this.width= this.getWidth();
        
        setBackground(Color.YELLOW);
        
    }
    
    @Override
    public void paint( Graphics graphics) {
        
        graphics.setColor(Color.RED);
        
        graphics.drawOval(0, 0, width, height);
        
    }
    

}
