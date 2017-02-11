import java.awt.*;

public class Clouds {
   // Draws clouds randomly with specific color and number of clouds
   public static void drawClouds(Graphics g, Color cloudColor, int numberOfClouds) {
      for (int a = 0; a < numberOfClouds; a++) {
         int x = (int)(Math.random() * 51) + 150;
         int y = (int)(Math.random() * 61) + 40;
         int x1 = (int)((Math.random() * ((800 - x) - 10 + 1) + 10));
         int y1 = (int)((Math.random() * ((150 - y) + 1) + 10));
         g.setColor(cloudColor);
         g.fillOval(x1, y1, x, y);
      }
   }
}