import java.awt.*;
import java.util.ArrayList;

public class Train {
   private ArrayList<RailCar> railCars;
   private int x;
   private int y;
   
   public Train(int x, int y) {
      this.x = x;
      this.y = y;
      
      railCars = new ArrayList<RailCar>();
   }
   
   public void addCar(String name, Color color) {
      RailCar car;
      
      int carX = railCars.size() == 0 ? 100 : (100 + railCars.size() * 175);
      
      switch (name){
          case "Locomotive":
              car = new Locomotive(color, carX, y);
              break;
              
          case "PassengerCar": 
              car = new PassengerCar(color, carX, y);
              break;
              
          case "FreightCar": 
              car = new FreightCar(color, carX, y);
              break;
              
          case "Caboose":
          default:
              car = new Caboose(color, carX, y);
              break;
      }
      
      railCars.add(car);
   }
   
   public void addCar(int pos, String name, Color color) {
      RailCar car;
      
      int carX = railCars.size() == 0 ? 100 : (100 + railCars.size() * 175);
      
      switch (name){
          case "Locomotive":
              car = new Locomotive(color, carX, y);
              break;
              
          case "PassengerCar": 
              car = new PassengerCar(color, carX, y);
              break;
              
          case "FreightCar": 
              car = new FreightCar(color, carX, y);
              break;
              
          case "Caboose":
          default:
              car = new Caboose(color, carX, y);
              break;
      }
      
      railCars.add(pos, car);
   }
   
   public void showCars(Graphics g) {
      for (RailCar car : railCars) {
         int carX = railCars.indexOf(car) == 0 ? 100 : (100 + railCars.indexOf(car) * 175);
         car.setCarX(carX);
      }
      
      for  (RailCar car2 : railCars) {
         car2.drawCar(g);
      }
   }
}