// Lab14av100.java
// Lab14a
// Student starting version

import java.awt.*;
import java.applet.*;
import java.util.ArrayList;

public class Lab14av100 extends Applet {
	public void paint(Graphics g) {
		drawGrid(g);
      this.setSize(820, 620);
      
      ArrayList<Shape> shapes = new ArrayList<Shape>();
      shapes.add(new Shape1Square("Square", 20, 30, "4", 100, 260));
      shapes.add(new Shape2Triangle("Triangle", 430, 30, "3", 510, 260));
      shapes.add(new Shape3Octagon("Octagon", 20, 330, "8", 100, 570));
      shapes.add(new Shape4Circle("Circle", 430, 330, "0", 510, 570));
      
      for (Shape shape : shapes) {
         shape.drawShape(g);
         shape.drawName(g);
         shape.drawInfo(g);
      }
   }

	public void drawGrid(Graphics g) {
      g.drawRect(10, 10, 800, 600);
		g.drawLine(10, 300, 810, 300);
		g.drawLine(410, 10, 410, 610);
	}
}