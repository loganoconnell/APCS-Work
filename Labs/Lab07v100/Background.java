import java.awt.*;

public class Background {
   // Method to combine the sky and grass methods
   public static void drawBackground(Graphics g) {
      drawSky(g);
      drawGrass(g);
   }
   
   // Method to draw the blue sky in the top portion of the background
   public static void drawSky(Graphics g) {
      g.setColor(Color.blue);
      g.fillRect(0, 0, 800, 500);
   }
   
   // Method to draw the green grass in the bottom portion of the background
   public static void drawGrass(Graphics g) {
      g.setColor(Color.green);
      g.fillRect(0, 500, 800, 100);
   }
}