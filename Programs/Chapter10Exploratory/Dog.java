/**
 * Write a description of class Dog here.
 * 
 * @author Logan O'Connell
 * @version 12/8/16
 */
public class Dog extends Animal {
    private int spots;
    
    public Dog() {
        System.out.println("INSIDE DOG CONSTRUCTOR");
    }
    
    public Dog(boolean cW, int l, int a, int s) {
        super(cW, l, a);
        System.out.println("INSIDE 3-PARAMETER DOG CONSTRUCTOR");
        spots = s;
    }
    
    public void printer() {
        System.out.println("INSIDE DOG PRINTER");
    }
}