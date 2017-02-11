// Lab04b_OCONNELL.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.

import java.awt.*;
import java.applet.*;

public class Lab04b_OCONNELL extends Applet {
	public void paint(Graphics g) {
      this.setSize(475, 350);
   
		// DRAW CUBE
      g.drawRect(10, 10, 100, 100);
      g.drawRect(45, 45, 100, 100);
      g.drawLine(10, 10, 45, 45);
      g.drawLine(110, 10, 145, 45);
      g.drawLine(10, 110, 45, 145);
      g.drawLine(110, 110, 145, 145);

		// DRAW SPHERE
      g.drawOval(27, 27, 100, 100);
      g.drawOval(27, 39, 100, 75);
      g.drawOval(27, 52, 100, 50);
      g.drawOval(27, 64, 100, 25);
      g.drawOval(39, 27, 75, 100);
      g.drawOval(52, 27, 50, 100);
      g.drawOval(64, 27, 25, 100);

		// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
      g.drawOval(300, 200, 100, 100);
      g.drawLine(300, 250, 385, 214);
      g.drawLine(300, 250, 338, 298);
      g.drawLine(338, 298, 385, 214); 
      g.drawOval(313, 238, 43, 43);

		// DRAW APCS
      g.fillRect(10, 250, 10, 50);
      g.fillRect(20, 250, 10, 10);
      g.fillRect(20, 270, 10, 10);
      g.fillRect(30, 250, 10, 50);
      
      g.fillRect(50, 250, 10, 50);
      g.fillRect(60, 250, 10, 10);
      g.fillRect(60, 270, 10, 10);
      g.fillRect(70, 250, 10, 30);
      
      g.fillRect(90, 250, 10, 50);
      g.fillRect(100, 250, 10, 10);
      g.fillRect(100, 290, 10, 10);
      g.fillRect(110, 250, 10, 10);
      g.fillRect(110, 290, 10, 10);
      
      g.fillRect(130, 250, 10, 30);
      g.fillRect(130, 290, 10, 10);
      g.fillRect(140, 250, 10, 10);
      g.fillRect(140, 270, 10, 10);
      g.fillRect(140, 290, 10, 10);
      g.fillRect(150, 250, 10, 10);
      g.fillRect(150, 270, 10, 30);

		// DRAW PACMEN FLOWER
      g.fillArc(220, 120, 50, 50, 135, 270);
      g.fillArc(185, 155, 50, 50, 225, 270);
      g.fillArc(220, 190, 50, 50, 315, 270);
      g.fillArc(255, 155, 50, 50, 45, 270);
	}
}