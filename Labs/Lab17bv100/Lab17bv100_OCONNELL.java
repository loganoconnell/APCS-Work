// Lab17bv100_OCONNELL.java
// The student, starting version of the Lab17b assignment.

import java.awt.*;
import java.applet.*;

public class Lab17bv100_OCONNELL extends Applet {
   public void paint(Graphics g) {
      this.setSize(1000, 650);
      drawFractal(g, 375, 244, 250, 162, 0);
   }
  
   public void drawFractal(Graphics g, int x, int y, int width, int height, int fromSide) {
      delay(7000);
      
      if (fromSide == 0) {
         g.setColor(Color.black);
   	   g.fillRect(375, (int)243.75, 250, (int)162.5);
         
         drawFractal(g, x, y, width, height, 1);
      }
      
      if (fromSide != 1) {
         g.setColor(Color.yellow);
         drawRightDown(g, x + width, y + height, width / 2, height / 2, 4);
      }
      
      if (fromSide != 2) {
         g.setColor(Color.green);
         drawLeftDown(g, x - (width / 2), y + height, width / 2, height / 2, 3);
      }
      
      if (fromSide != 3) {
         g.setColor(Color.blue);
         drawRightUp(g, x +  width, y - (height / 2), width / 2, height / 2, 2);
      }
      
      if (fromSide != 4) {
         g.setColor(Color.red);
         drawLeftUp(g, x - (width / 2), y - (height / 2), width / 2, height / 2, 1);
      }
   }
   
   public void drawLeftUp(Graphics g, int x, int y, int width, int height, int fromSide) {
      g.fillRect(x, y, width, height);
      
      if (width > 1)
         drawFractal(g, x, y, width, height, 1);
   }
   
   public void drawRightUp(Graphics g, int x, int y, int width, int height, int fromSide) {
      g.fillRect(x, y, width, height);
      
      if (width > 1)
         drawFractal(g, x, y, width, height, 2);
   }
   
   public void drawLeftDown(Graphics g, int x, int y, int width, int height, int fromSide) {
      g.fillRect(x, y, width, height);
      
      if (width > 1)
         drawFractal(g, x, y, width, height, 3);
   }
   
   public void drawRightDown(Graphics g, int x, int y, int width, int height, int fromSide) {
      g.fillRect(x, y, width, height);
      
      if (width > 1)
         drawFractal(g, x, y, width, height, 4);
   }

	public void delay(long n) {
		n *= 1000;
		long startDelay = System.nanoTime();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.nanoTime();
	}
}