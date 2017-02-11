public class Chapter03Exploratory
{

   public static void main(String[] args)
   {
      //instantiate an integer called 'a' and set it equal to 32. Do this as 2 statements.
      int a;
      a = 32;

      //instantiate an double called 'b' and set it equal to 8.0. Do this as 1 statement.
      double b = 8.0;
      
      //instantiate a double called 'c' that is 'a' divided by 'b'.
      double c = a / b;

      //print 'c'.
      System.out.println(c);
      
      //increment 'a' by 1 using the '++' shortcut.
      a++;
      
      //decrement 'a' by 3 using a different shortcut.
      a -= 3;
      
      //multiply 'a' by 10.
      a *= 10;
      
      //print 'a'.
      System.out.println(a);
      
      //What will the following line print?  
      //Uncomment and execute after you've thought about this.
         // 301
         ++a;
         System.out.println(a);
   
      //What will the followng line print?  
      //Uncomment and execute after you've thought about this.   
         // 301
         System.out.println(a++); 
      
      
      //What's the difference between '++a' and 'a++' ?  
         // ++a is a pre-increment operation and the value is computated before setting the value, and a++ is a post-increment operation, a is assigned first then incremented
      
      //print the remainder of 'a' divided by 5
      System.out.println(a % 5);

          
      // What is 2,147,483,647 + 2 ??
      // What will java do when adding these integers??  Uncomment to check.
         // It will overflow
         System.out.println(2147483647 + 2);
      
////////////////Day 1 to here,3.7-3.12 below/////////////////////////////////////////

      //Instantiate a String called 'firstName' that is your first name.
      String firstName = "Logan";

      //Instantiate a String called 'lastName' that is your last name.
      String lastName = "O'Connell";
      
      
      //Print your full name in the form 'lastName, firstName'. Do this in ONE print statement.
      //Note the comma and the space after it.
            
         System.out.println(lastName + ", " + firstName);
      
      
      //What will the following line print?
         // 500
         System.out.println(200 + 300);
      
      
      //How about this next line?
         // 200300
         System.out.println("200" + "300");
         
      //declare a final boolean called 'LOCKED' and set it equal to 'false'.
      final boolean LOCKED = false;
      
         System.out.println(LOCKED);
         
      //reassign 'locked' to 'true'.
      // LOCKED = true;
      
          //System.out.println(LOCKED);
          
          
      //instantiate a double for an employee's gross pay. Do not set it = to anything.  
      //Use an appropriate, self-documenting modifier (name for the variable). 
      
      //The following code will create an error; uncomment and read the error message.
 
          double num1 = 52.0;
          int num2 = (int) num1 % 5;
          System.out.println(num2);  
   
      //Use typecasting to fix the error above so that it prints '2'.
      
          double num3 = 52.0;
          int num4 = (int) num3 % 5;
          System.out.println((double)num4);  
   
      //Use typecasting to fix the error above so that it prints '2.0'
      
               
      
      //Oh no!!  Mr. Chetlen wrote 'C' for your last assignment grade but you really earned an 'A'.
      //reassign the 'C' to an 'A' by typecasting, using a little arithmetic, and then typecasting again.
      
      char grade = 'C'; //Do NOT change this line.  
      grade = (char)(grade - 2);
         
      
      
      System.out.println("My grade in Aspen is now: " + grade);
}




}