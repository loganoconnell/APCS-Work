/**
 * Write a description of class Animal here.
 * 
 * @author Logan O'Connell 
 * @version 12/8/16
 */
public class Animal {
    private boolean cellWall;
    private int legs;
    private int age;

    public Animal() {
       cellWall = false;
       legs = 0;
       age = 0;
       System.out.println("INSIDE DEFAULT ANIMAL CONSTRUCTOR");
    }
    
    public Animal(boolean cW, int l, int a) {
       cellWall = cW;
       legs = l;
       age = a;
       System.out.println("INSIDE 3-PARAMETER ANIMAL CONSTRUCTOR");
    }
    
    public void printer() {
        System.out.println("INSIDE ANIMAL PRINTER");
    }
    
    public String toString() {
        return ("Has a cell wall? " + cellWall);
    }
}