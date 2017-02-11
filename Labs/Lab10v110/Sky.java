import java.awt.*;

public class Sky {
   private Color c;
   
   public Sky(Graphics g, Color c) {
      this.c = c;
   }
   
   public void paintSky(Graphics g) {
      g.setColor(c);
      g.fillRect(0, 0, 800, 300);
   }
}