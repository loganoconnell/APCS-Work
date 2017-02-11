// Lab06v100_OCONNELL.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
																
public class Lab06v100_OCONNELL extends Applet {
	public void paint(Graphics g) {
      this.setSize(800, 600);
      
		// Draw Grid
		g.drawRect(10, 10, 780, 580);
		g.drawLine(400, 10, 400, 590);
		g.drawLine(10, 300, 790, 300);
		
		// Draw Random Lines
      for (int i = 0; i < 100; i++) {
         g.setColor(new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256)));
         g.drawLine((int)(Math.random() * 390 + 10), (int)(Math.random() * 290 + 10), (int)(Math.random() * 390 + 10), (int)(Math.random() * 290 + 10));
		}
      
		// Draw Random Squares
      for (int i = 0; i < 100; i++) {
         g.setColor(new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256)));
         g.fillRect((int)(Math.random() * 340 + 400), (int)(Math.random() * 240 + 10), 50, 50);
      }

		
		// Draw Random Circles
      for (int i = 0; i < 100; i++) {
         g.setColor(new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256)));
         int x = (int)(Math.random() * 201);
         g.drawOval((int)(Math.random() * ((400 - x) - 10 + 1) + 10), (int)(Math.random() * ((590 - x) - 300 + 1) + 300), x, x); 
      }
		
		// Draw 3-D Box
	   Polygon box1 = new Polygon(new int[] {555, 635, 635, 555}, new int[] {405, 405, 485, 485}, 4);
      g.setColor(Color.yellow);
      g.fillPolygon(box1);
      
      Polygon box2 = new Polygon(new int[] {635, 675, 675, 635}, new int[] {405, 445, 525, 525}, 4);
      g.setColor(Color.blue);
      g.fillPolygon(box2);
      
      Polygon box3 = new Polygon(new int[] {555, 595, 595, 555}, new int[] {405, 445, 525, 485}, 4);
      g.setColor(Color.green);
      g.fillPolygon(box3);
      
      Polygon box4 = new Polygon(new int[] {595, 675, 675, 595}, new int[] {445, 445, 525, 525}, 4);
      g.setColor(Color.red);
      g.fillPolygon(box4);
	}	
}