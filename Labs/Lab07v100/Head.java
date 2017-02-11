import java.awt.*;

public class Head {
   // Method to combine the methods that draw individual pieces of the head
   public static void drawHead(Graphics g, boolean withTrunk) {
      drawEars(g);
      drawFace(g);
      drawEyes(g);
      if (withTrunk)
         drawTrunk(g);
   }
      
   // Draws ears, two dark gray ovals
   public static void drawEars(Graphics g) {
      g.setColor(Color.darkGray);
      g.fillOval(450, 185, 100, 180);
      g.fillOval(600, 185, 100, 180);
   }
      
   // Draws face, a gray circle
   public static void drawFace(Graphics g) {
      g.setColor(Color.gray);
      g.fillOval(500, 200, 150, 150);
   }
   
   // Draws eyes, a smaller blue circle inside a larger white circle
   public static void drawEyes(Graphics g) {
      g.setColor(Color.white);
      g.fillOval(540, 250, 15, 15);
      g.fillOval(600, 250, 15, 15);
      g.setColor(Color.blue);
      g.fillOval(545, 255, 10, 10);
      g.fillOval(605, 255, 10, 10);
   }
      
   // Draws trunk (optional), a dark gray rectangle
   public static void drawTrunk(Graphics g) {
      g.setColor(Color.darkGray);
      g.fillRect(570, 275, 20, 175);
   }  
}