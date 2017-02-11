// CarSceneRunner.java

// The Lab10 graded assignment is open ended.
// There is no provided student version for starting, nor are there
// any files with solutions for the different point versions.

// Check the Lab assignment document for additional details.

import java.awt.*;
import java.applet.*;
import java.util.*;							

public class Lab10v110_OCONNELL_HOSDURG extends Applet {
	public void paint(Graphics g) {
      this.setSize(800, 600);
      
      Background background = new Background(g);
      background.paintBackground(g);
      
      // Frame color, engine cylinders
      Car car = new Car(Color.gray, 6);
      car.paintCar(g);
      
      // Wheels, frame color, engine cylinders, height
      Truck truck = new Truck(6, Color.magenta, 8, 15);
      truck.paintTruck(g);
      
      // Frame color
      Bike bike = new Bike(Color.red);
      bike.paintBike(g);
   }
}