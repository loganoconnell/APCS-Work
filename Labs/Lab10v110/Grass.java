import java.awt.*;

public class Grass {
   private Color c;
   
   public Grass(Graphics g, Color c) {
      this.c = c;
   }
   
   public void paintGrass(Graphics g) {
      g.setColor(c);
      g.fillRect(0, 500, 800, 100);
   }
}