import java.awt.*;

public class Body {
   // Method to combine the methods that draw individual pieces of the body
   public static void drawBody(Graphics g, boolean withTail, int numberOfHairsForTail) {
      drawChest(g);
      drawLegs(g);
      drawFeet(g);
      if (withTail)
         drawTail(g, numberOfHairsForTail);
   }
   
   // Draw chest, a large gray oval
   public static void drawChest(Graphics g) {
      g.setColor(Color.gray);
      g.fillOval(200, 250, 400, 200);
   }
   
   // Draw legs, four rectangles (also gray because of order of method calls)
   public static void drawLegs(Graphics g) {
      g.fillRect(225, 375, 50, 125);
      g.fillRect(300, 375, 50, 125);
      g.fillRect(450, 375, 50, 125);
      g.fillRect(525, 375, 50, 125);
   }
   
   // Draw feet, four dark gray small rectangles
   public static void drawFeet(Graphics g) {
      g.setColor(Color.darkGray);
      g.fillRect(225, 475, 50, 25);
      g.fillRect(300, 475, 50, 25);
      g.fillRect(450, 475, 50, 25);
      g.fillRect(525, 475, 50, 25);
   }
   
   // Draw tail, randomly generate where to draw the tail to and how many "hairs" to draw
   public static void drawTail(Graphics g, int numberOfHairs) {
      for (int i = 0; i < numberOfHairs; i++) {
         g.drawLine(200, 350, (int)(Math.random() * 51) + 150, (int)(Math.random() * 100) + 350);
      }
   }
}