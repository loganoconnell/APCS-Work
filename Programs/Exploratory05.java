//Exploratory05.java
//Please refer to our text for help.
//You are going to mimick how accessing an ATM machine works.  
//The first stage will be a simple interaction.
 
import java.util.*;

public class Exploratory05 {
   public static void main(String[] args) {
   boolean access = false; 
   
   //Create a 5 digit PIN.  Declare it a final integer. Remember to capitalize the enter word.
   final int PIN = 12345;
   
   //Import the Scanner class prior to the 'public class Exploratory05' line
   
   //Instantiate a Scanner object as done in figure 5.1
   Scanner input = new Scanner(System.in);
   
   //Prompt the user appropriately for the PIN
   System.out.println("Please enter your PIN.");
   
   //Create another int called 'guess' that will be assigned whatever the user inputs.
   //Again, check out figure 5.1.
   int guess = input.nextInt();
   
   //Write an 'if' statement that will check if the user entered the correct PIN.
   //If the correct PIN is entered, change the value of 'access'.
   if (guess == PIN)
      access = true;
   
   System.out.println("\nThe user has gained access: " + access);
   
//////////////////////////  Part I ENDS HERE  5.01 - 5.04   /////////////////////////     
   int bankBalance = 18754435;
   
   //Use the boolean from above to write 'if-else' code that displays the user's bank balance
   // if access is granted or tells the user she does not have access yet. 
   if (access)
      System.out.println("Your bank balance is: " + bankBalance);
   else
      System.out.println("You do not have access yet.");
   
   //Create a fixed loop that asks the user 5 times what your favorite number is.
   final int favNumber = 13;
   
   for (int i = 0; i < 5; i++) {
      System.out.println("Please enter your favorite number.");
      int favNumberGuess = input.nextInt();
      
      if (favNumberGuess == favNumber) {
         i = 5;
      
         System.out.println("Hey, " + favNumber + " is my favorite number too!!");
      }
   }
   
   
   //Create a conditional loop that asks the user what your favorite number is until the favorite number is typed in.
   //Display a message like "Hey, 'favNumber' is my favorite number too!!"   (use favNumber here not 13.  WHY??   
   
   //Change favNumber above and re-execute; does that output still make sense??
   Scanner scan1 = new Scanner(System.in);
   System.out.println("Choose a number between 1 and 10:  ");
   int num1 = scan1.nextInt();
   
   //Create a conditional loop that prints all integers from num1 up to 20.  Uncomment and use the 3 previous lines. 
   for (int i = num1; i <= 20; i++)
      System.out.println(i);

////////////////////////   5.05 - 5.09 ENDS HERE    /////////////////////////
   //Write nested 'if-else' statements that tests if a number is divisible by 6 by first checking for
   //divisibility by 2 and then by 3.  Print something fun if the given number is divisible by 6.  
   //Print appropriate statements otherwise - like " (blank) is even but not divisible by 6."
   int number = 500;
   
   if (number % 2 == 0) {
      System.out.println("Number is divisible by 2.");
      
      if (number % 3 == 0)
         System.out.println("Number is divisible by 2, 3, and 6.");
      else
         System.out.println("Number is only divisible by 2.");
   }
   
   else
      System.out.println("Number is not divisible by 2.");
   
   //Uncomment and fill in the nested 'for' loops so that it outputs multiplication from 1 x 1 up to 
   //whatever the user enters.
   System.out.println("Please enter a number for multiplication information.");
   
   Scanner hello = new Scanner(System.in);
   int upperValue = hello.nextInt();
   
   for (int i = 1; i <= upperValue; i++) {
      System.out.println(i + " * " + i + " = " + i * i);
   }  
   
   // Create input 'protection' such that if the user enters an odd number,
   // it redirects them. Keep in mind that you will ask the user at least once, but possibly no more than once.
   // After an even number is appropriately entered, display that value.
   System.out.println("What is your favorite EVEN number?"); 
   
   Scanner scan2 = new Scanner(System.in);
   int passGuess = scan2.nextInt();
   
   boolean even = false;
   
   do {
      if (passGuess % 2 == 0) {
         even = true;
         
         System.out.println("You entered the even number: " + passGuess);
      }
      
      else {
         System.out.println("Please enter your favorite EVEN number.");
         passGuess = scan2.nextInt();
      }
   }
   while (even == false);
   
   }
   
//////////////////   END OF EXPLORATORY    ///////////////////////////////////////////////
}