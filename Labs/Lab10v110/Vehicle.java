import java.awt.*;

public class Vehicle {
   private Tires tires;
   private Frame frame;
   private boolean hasEngine;
   
   public Vehicle(int numberOfTires, Color frameColor, boolean hasEngine) {
      tires = new Tires(numberOfTires);
      frame = new Frame(frameColor);
      this.hasEngine = hasEngine;
   }
   
   public Frame getFrame() {
      return frame;
   }
}