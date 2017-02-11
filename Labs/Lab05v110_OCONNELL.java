// Lab05v110_OCONNELL.java
// This is the student, starting version of the Lab05 assignment.

import java.awt.*;
import java.applet.*;

public class Lab05v110_OCONNELL extends Applet {
	public void paint(Graphics g) {
		int width = 980;
		int height = 630;
      
      this.setSize(1000, 650);

		g.drawRect(10, 10, width, height);
      g.drawRect(200, 200, 600, 250);
   
      // Big Top Left
      int x1 = 990;
      int y1 = 10;
      int x2 = 10;
      int y2 = 10;
      
      for (int k = 1; k < 47; k++) {
         g.drawLine(x1, y1, x2, y2);
         y2 += 13;
         x1 -= 21;
	   }
      
      // Big Top Right
      x1 = 10;
      y1 = 10;
      x2 = 990;
      y2 = 10;
      
      for (int k = 1; k < 47; k++) {
         g.drawLine(x1, y1, x2, y2);
         y2 += 13;
         x1 += 21;
	   }
      
      // Big Bottom Left
      x1 = 990;
      y1 = 640;
      x2 = 10;
      y2 = 640;
      
      for (int k = 1; k < 47; k++) {
         g.drawLine(x1, y1, x2, y2);
         y2 -= 13;
         x1 -= 21;
	   }
      
      // Big Bottom Right
      x1 = 10;
      y1 = 640;
      x2 = 990;
      y2 = 640;
      
      for (int k = 1; k < 47; k++) {
         g.drawLine(x1, y1, x2, y2);
         y2 -= 13;
         x1 += 21;
	   }
      
      // Little Top Left
      x1 = 800;
      y1 = 200;
      x2 = 200;
      y2 = 200;
      
      for (int k = 1; k < 47; k++) {
         if (x1 >= 200)
            g.drawLine(x1, y1, x2, y2);
         y2 += 5;
         x1 -= 14;
	   }
      
      // Little Top Right
      x1 = 200;
      y1 = 200;
      x2 = 800;
      y2 = 200;
      
      for (int k = 1; k < 47; k++) {
         if (x1 <= 800)
            g.drawLine(x1, y1, x2, y2);
         y2 += 5;
         x1 += 14;
	   }
      
      // Little Bottom Left
      x1 = 800;
      y1 = 450;
      x2 = 200;
      y2 = 450;
      
      for (int k = 1; k < 47; k++) {
         if (x1 >= 200)
            g.drawLine(x1, y1, x2, y2);
         y2 -= 5;
         x1 -= 14;
	   }
      
      // Little Bottom Right
      x1 = 200;
      y1 = 450;
      x2 = 800;
      y2 = 450;
      
      for (int k = 1; k < 47; k++) {
         if (x1 <= 800)
            g.drawLine(x1, y1, x2, y2);
         y2 -= 5;
         x1 += 14;
	   }
   }
}

