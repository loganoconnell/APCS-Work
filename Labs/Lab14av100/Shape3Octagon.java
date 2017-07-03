// Shape3Octagon.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape3Octagon implements Shape{
   private String title;
   private int titleX;
   private int titleY;
   private String sides;
   private int sidesX;
   private int sidesY;
   
   public Shape3Octagon(String title, int titleX, int titleY, String sides, int sidesX, int sidesY) {
      this.title = title;
      this.titleX = titleX;
      this.titleY = titleY;
      this.sides = sides;
      this.sidesX = sidesX;
      this.sidesY = sidesY;
   }
   
   public void drawShape(Graphics g) {
      g.fillPolygon(new int[] {119, 181, 225, 225, 181, 119, 75, 75}, new int[] {375, 375, 419, 481, 525, 525, 483, 419}, 8);
   }
   
   public void drawName(Graphics g) {
      g.drawString(title, titleX, titleY);
   }
   
   public void drawInfo(Graphics g) {
      g.drawString(("A octagon has " + sides + " sides."), sidesX, sidesY);
   }
}