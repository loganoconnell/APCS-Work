import java.awt.*;

public class NonEnginePoweredVehicle extends Vehicle {
   private boolean hasPedals;
   
   public NonEnginePoweredVehicle(int numberOfTires, Color frameColor, boolean hasPedals) {
      super(numberOfTires, frameColor, false);
      this.hasPedals = hasPedals;
   }
   
   public void setHasPedals(boolean hasPedals) {
      this.hasPedals = hasPedals;
   }
}