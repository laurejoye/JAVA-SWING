package com.imie.javaSwingExe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

 

public class PanGraph extends JPanel { 

	
	
  public void paintComponent(Graphics g){
	 int a = Math.min(this.getWidth()/2, this.getHeight()/2);
	
//**les lines ( pour se reperer)
	  g.drawLine(0, this.getHeight()/2, this.getWidth(), this.getHeight()/2);
	  g.drawLine(this.getWidth()/2, 0, this.getWidth()/2, this.getHeight());
	  
	  
//* le cercle
	g.setColor(Color.YELLOW);
    g.fillOval((this.getWidth()/2-a)/2, ((this.getHeight()/2-a)/2)+(this.getHeight()/2), a, a);
    
//* le carre  
   
    g.setColor(Color.BLUE);
    g.fillRect(((this.getWidth()/2-a)/2)+(this.getWidth()/2), (this.getHeight()/2-a)/2, a, a);
    
//* le triangle
    g.setColor(Color.GREEN);
    int x[] = {0, this.getWidth()/2, this.getWidth()/4};
    int y[] = {this.getHeight()/2, this.getHeight()/2, 0};
    g.fillPolygon(x, y, 3);

//* importer une image   
    try {
        Image img = ImageIO.read(new File("imie.jpeg"));
        int r = img.getWidth(null)/img.getHeight(null);
        g.drawImage(img, (((this.getWidth()/2-a)/2)+this.getWidth()/2), (((this.getHeight()/2)-a/2)/2)+this.getHeight()/2, a, a/r, this);
     
    } catch (IOException e) {

        e.printStackTrace();

      }                
    
    

  }


}               
