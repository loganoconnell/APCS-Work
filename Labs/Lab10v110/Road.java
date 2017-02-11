import java.awt.*;

public class Road {
   private Color c;
   private Color lines;
   private int numLines;
   
   public Road(Graphics g, Color c, Color l, int numLines) {
      this.c = c;
      this.lines = l;
      this.numLines = numLines;
   }
   
   public void paintRoad(Graphics g) {
      g.setColor(c);
      g.fillRect(0, 300, 800, 200);
      
      paintLines(g);
   }
   
   private void paintLines(Graphics g) {
      g.setColor(lines);
      
      int spacing = 800 / numLines;

      for (int i = 0; i < numLines; i++) {
         g.fillRect(20 + (i * spacing), 390, 80, 20);
      }
   }
}