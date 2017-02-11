import java.awt.*;

public class Bike extends NonEnginePoweredVehicle {
   public Bike(Color frameColor) {
      super(2, frameColor, false);
      this.setHasPedals(true);
   }
   
   public void paintBike(Graphics g) {
      // Frame
      g.setColor(this.getFrame().getFrameColor());
      g.fillRect(590, 410, 80, 10);
      g.drawLine(630, 410, 670, 380);
      g.drawLine(670, 380, 710, 380);
      g.drawLine(670, 380, 600, 380);
      
      // Wheels
      g.setColor(Color.white);
      g.fillOval(550, 400, 50, 50);
      g.fillOval(650, 400, 50, 50);
   }
}