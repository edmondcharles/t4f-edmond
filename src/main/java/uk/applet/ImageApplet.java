package uk.applet;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageApplet extends Applet {
    
    public void paint(Graphics g){
        
        try {
            Image image= ImageIO.read(ImageApplet.class.getResourceAsStream("/caca.gif"));
            
            g.drawImage(image,0,0,this);
            
            g.drawString("vilnvlrfvlje",0,400);
        }
        catch (IOException e) {
           
            e.printStackTrace();
        }
    }

}
