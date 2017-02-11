import java.awt.*;

public class EnginePoweredVehicle extends Vehicle {
   private Engine engine;
   
   public EnginePoweredVehicle(int numberOfTires, Color frameColor, int numberOfCylinders) {
      super(numberOfTires, frameColor, true);
      engine = new Engine(numberOfCylinders);
   }
   
   public int getEngineNumCylinders() {
      return engine.getNumberOfCylinders();
   }
}