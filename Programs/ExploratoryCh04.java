public class ExploratoryCh04
{
   public static void main(String[] args)
   {
      
      // Fill in the blank below so that it CALCULATES the value using the MATH class.  
      // Your answer needs to read '8' not '8.0' (perhaps typecast??)
          
         System.out.println("The square root of 64 is: " + (int)Math.sqrt(64));
         
         
   
      // Fill in the blank below so that it CALCULATES the value using the MATH class. 
   
         System.out.println("3 to the 4th power is: " + (int)Math.pow(3, 4));
         
         
         
      // Fill in the blank below so that it CALCULATES the area of a circle with radius 10.
        
         System.out.println("The area of a circle with radius 10 is: " + (Math.PI * Math.pow(10, 2)));
         
              // Why is PI capitalized??
                  // It is an attriubute, and thus must stand out from the methods. Also, it is a final variable.
      
      
      //Round 4.3.  Make a nice print statement like I did above.
      System.out.println("The rounded value of 4.3 is: " + Math.round(4.3));
      
      
      //Round down 4.7.  Make a nice print statement like I did above.
      System.out.println("The rounded value of 4.7 is : " + Math.round(4.7));
      
      
      //Round up the absolute value of -4.2. (Use the Math class twice here.
      //Make a nice print statement like I did above.  
      System.out.println("The absolute and rounded-up value of -4.2 is : " + (int)Math.ceil(Math.abs(-4.2)));
      
       
         
             int hello = -20;
         
      //Write code that will use the MATH class twice to print the minimum of 'hello' and the number e.
         System.out.println("The minimum of 'hello' and the number e is: " + (int)Math.min(hello, Math.E));
         

         
///////////////////  Exploratory for the second half will strictly use Lab04b  ///////////////////////////////////////////////////////


         
         
   }




}