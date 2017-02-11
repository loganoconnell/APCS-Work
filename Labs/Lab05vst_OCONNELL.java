// Lab05vst_OCONNELL.java
// This is the student, starting version of the Lab05 assignment.

import java.awt.*;
import java.applet.*;

public class Lab05vst_OCONNELL extends Applet {
	public void paint(Graphics g) {
      this.setSize(1000, 650);
      
		int width = 980;
		int height = 630;

		g.drawRect(10, 10, width, height);
      
      // Bottom Right
      for (int k = 0; k < 30; k++)
         g.drawLine(990, 620 - (k * 21), Math.max(Math.min(k * 40, 990), 10), 640);

      // Bottom Left
      for (int k = 0; k < 30; k++)
         g.drawLine(10, 620 - (k * 21), Math.max(Math.min(990 - (k * 40), 990), 10), 640);

      // Top Left
      for (int k = 0; k < 30; k++)
         g.drawLine(10, Math.max(k * 21, 10), Math.max(990 - (k * 40), 10), 10);
         
      // Top Right
      for (int k = 0; k < 30; k++)
         g.drawLine(990, Math.max(k * 21, 10), Math.max(Math.min(k * 40, 990), 10), 10);
	}
}