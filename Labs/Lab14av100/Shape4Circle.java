// Shape4Circle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape4Circle implements Shape {
   private String title;
   private int titleX;
   private int titleY;
   private String sides;
   private int sidesX;
   private int sidesY;
   
   public Shape4Circle(String title, int titleX, int titleY, String sides, int sidesX, int sidesY) {
      this.title = title;
      this.titleX = titleX;
      this.titleY = titleY;
      this.sides = sides;
      this.sidesX = sidesX;
      this.sidesY = sidesY;
   }
   
   public void drawShape(Graphics g) {
      g.fillOval(510, 410, 100, 100);
   }
   
   public void drawName(Graphics g) {
      g.drawString(title, titleX, titleY);
   }
   
   public void drawInfo(Graphics g) {
      g.drawString(("A circle has " + sides + " sides."), sidesX, sidesY);
   }
}