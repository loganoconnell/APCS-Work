import java.awt.*;

public class Car extends EnginePoweredVehicle {
   public Car(Color frameColor, int numberOfCylinders) {
      super(4, frameColor, numberOfCylinders);
   }
   
   public void paintCar(Graphics g) {
      // Frame
      g.setColor(this.getFrame().getFrameColor());
      g.fillRect(100, 375, 150, 60);
      g.fillRect(125, 360, 100, 15);
      
      // Wheels
      g.setColor(Color.white);
      g.fillOval(110, 410, 50, 50);
      g.fillOval(190, 410, 50, 50);
   }
}