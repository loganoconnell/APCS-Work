import java.awt.*;

public class Truck extends EnginePoweredVehicle {
   private double truckHeight;
   
   public Truck(int numberOfWheels, Color frameColor, int numberOfCylinders, double truckHeight) {
      super(numberOfWheels, frameColor, numberOfCylinders);
      this.truckHeight = truckHeight;
   }
   
   public void paintTruck(Graphics g) {
      // Frame
      g.setColor(this.getFrame().getFrameColor());
      g.fillRect(325, 360, 200, (int)truckHeight * 5);
      g.fillRect(325, 290, 75, 70);
      
      // Wheels
      g.setColor(Color.white);
      g.fillOval(335, 395, 70, 70);
      g.fillOval(445, 395, 70, 70);
      return;
   }
}