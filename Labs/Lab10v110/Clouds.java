import java.awt.*;

public class Clouds {
   private Color c;
   
   public Clouds(Graphics g, Color c) {
      this.c = c;
   }
   
   public void paintClouds(Graphics g, int numberOfClouds) {
      for (int a = 0; a < numberOfClouds; a++) {
         int x = (int)(Math.random() * 51) + 150;
         int y = (int)(Math.random() * 61) + 40;
         int x1 = (int)((Math.random() * ((800 - x) - 10 + 1) + 10));
         int y1 = (int)((Math.random() * ((150 - y) + 1) + 10));
         g.setColor(c);
         g.fillOval(x1, y1, x, y);
      }
   }
}