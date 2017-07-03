// Lab13

// Lab 13 is an open-ended lab with no specific answer key.

// Students create their owm programs which need to bew graded 
// using the criteria stated in the lab assignment.

import java.awt.Color;

interface Vehicle<E, T> {
   // 100
   abstract public E[] getMaker();
   abstract public void setMaker(E maker, E brand, T version);
   abstract public void printArray(E[] array);
   
   // 90
   abstract void setTopSpeed(int speed);
   abstract int getTopSpeed();
   
   // 70
   abstract public int numberOfWheels();
   abstract public Boolean isStreetLegal();
   abstract public Color vehicleColor();
   abstract public Boolean hasEngine();
   abstract public int engineSize();
   abstract public int horsePower();
   abstract public Boolean isElectric();
   abstract public int numberOfDoors();
}

abstract class CommonCar implements Vehicle<String, Double> {
   public String[] maker;
   
   public String[] getMaker() {
      return this.maker;
   }
   
   public void setMaker(String maker, String brand, Double version) {
      String[] array = {maker, brand, version.toString()};
      this.maker = array;
   }
   
   public void printArray(String[] array) {
      System.out.print("Car Details: ");
      
      for (String element : array)
         System.out.print(element + " ");
         
      System.out.println();
   }
   
   public int topSpeed = 0;
   public void setTopSpeed(int speed) { topSpeed = speed; }
   public int getTopSpeed() { return topSpeed; }
   
   public int numberOfWheels() { return 4; }
   public Boolean isStreetLegal() { return true; }
   abstract public Color vehicleColor();
   public Boolean hasEngine() { return true; }
   abstract public int engineSize();
   abstract public int horsePower();
   abstract public Boolean isElectric();
   public int numberOfDoors() { return 4; }
   public String description() { return ("Type of Vehicle: Car\n" +
                                         "Number of Wheels: " + numberOfWheels() + "\n" + 
                                         "Is Street Legal: " + isStreetLegal() + "\n" + 
                                         "Vehicle Color: " + vehicleColor().toString() + "\n" + 
                                         "Has Engine: " + hasEngine() + "\n" + 
                                         "Engine Size: " + engineSize() + "\n" + 
                                         "Horse Power: " + horsePower() + "\n" + 
                                         "Is Electric: " + isElectric() + "\n" + 
                                         "Top Speed: " + getTopSpeed() + "\n" + 
                                         "Number of Doors: " + numberOfDoors() + "\n"); }
}

abstract class CommonBike implements Vehicle<String, Integer> {
   public String[] maker;
   
   public String[] getMaker() {
      return this.maker;
   }
   
   public void setMaker(String maker, String brand, Integer version) {
      String[] array = {maker, brand, version.toString()};
      this.maker = array;
   }
   
   public void printArray(String[] array) {
      System.out.print("Bike Details: ");
      
      for (String element : array)
         System.out.print(element + " ");
         
      System.out.println();
   }
   
   public int topSpeed = 0;
   public void setTopSpeed(int speed) { topSpeed = speed; }
   public int getTopSpeed() { return topSpeed; }
   
   public int numberOfWheels() { return 2; }
   public Boolean isStreetLegal() { return false; }
   abstract public Color vehicleColor();
   abstract public Boolean hasEngine();
   abstract public int engineSize();
   abstract public int horsePower();
   abstract public Boolean isElectric();
   public int numberOfDoors() { return 0; }
   public String description() { return ("Type of Vehicle: Bike\n" +
                                         "Number of Wheels: " + numberOfWheels() + "\n" +
                                         "Is Street Legal: " + isStreetLegal() + "\n" + 
                                         "Vehicle Color: " + vehicleColor().toString() + "\n" + 
                                         "Has Engine: " + hasEngine() + "\n" + 
                                         "Engine Size: " + engineSize() + "\n" + 
                                         "Horse Power: " + horsePower() + "\n" + 
                                         "Is Electric: " + isElectric() + "\n" + 
                                         "Top Speed: " + getTopSpeed() + "\n" + 
                                         "Number of Doors: " + numberOfDoors() + "\n"); }
}

class Car extends CommonCar {
   public Car() {
      this.topSpeed = 140;
   }

   public Color vehicleColor() { return Color.green; }
   public int engineSize() { return 4; }
   public int horsePower() { return 300; }
   public Boolean isElectric() { return true; }
}

class Truck extends CommonCar {
   public Truck() {
      this.topSpeed = 100;
   }
   
   public Color vehicleColor() { return Color.red; }
   public int engineSize() { return 8; }
   public int horsePower() { return 500; }
   public Boolean isElectric() { return false; }

}

class Bike extends CommonBike {
   public Bike() {
      this.topSpeed = 10;
   }
   
   public Color vehicleColor() { return Color.blue; }
   public Boolean hasEngine() { return false; }
   public int engineSize() { return 0; }
   public int horsePower() { return 10; }
   public Boolean isElectric() { return false; }
}

class Motorcycle extends CommonBike {
   public Motorcycle() {
      this.topSpeed = 75;
   }
   
   public Color vehicleColor() { return Color.orange; }
   public Boolean hasEngine() { return true; }
   public int engineSize() { return 6; }
   public int horsePower() { return 400; }
   public Boolean isElectric() { return false; }
}

public class Lab13_OCONNELL_DADIREDDY {
   public static void main(String args[]) {
      Car car = new Car();
      car.setMaker("Nissan", "Altima", new Double(3.5));
      car.printArray(car.getMaker());
      System.out.println(car.description());
      
      Truck truck = new Truck();
      truck.setMaker("Ford", "F150", new Double(4.5));
      truck.printArray(truck.getMaker());
      System.out.println(truck.description());
      
      Bike bike = new Bike();
      bike.setMaker("Mongoose", "BMX", new Integer(5));
      car.printArray(bike.getMaker());
      System.out.println(bike.description());
      
      Motorcycle motorcycle = new Motorcycle();
      motorcycle.setMaker("Yamaha", "R1", new Integer(2));
      car.printArray(motorcycle.getMaker());
      System.out.println(motorcycle.description());
   } 
}