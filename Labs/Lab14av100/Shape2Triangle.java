// Shape2Triangle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape2Triangle implements Shape {
   private String title;
   private int titleX;
   private int titleY;
   private String sides;
   private int sidesX;
   private int sidesY;
   
   public Shape2Triangle(String title, int titleX, int titleY, String sides, int sidesX, int sidesY) {
      this.title = title;
      this.titleX = titleX;
      this.titleY = titleY;
      this.sides = sides;
      this.sidesX = sidesX;
      this.sidesY = sidesY;
   }
   
   public void drawShape(Graphics g) {
      g.fillPolygon(new int[] {510, 560, 610}, new int[] {200, 120, 200}, 3);
   }
   
   public void drawName(Graphics g) {
      g.drawString(title, titleX, titleY);
   }
   
   public void drawInfo(Graphics g) {
      g.drawString(("A triangle has " + sides + " sides."), sidesX, sidesY);
   }
}