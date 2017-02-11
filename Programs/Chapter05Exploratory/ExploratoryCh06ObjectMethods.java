/*ExploratoryCh06ObjectMethods.java
 * Logan
 * O'Connell
*/

import java.util.Random;

public class ExploratoryCh06ObjectMethods {
   public static void main(String[] args) {
//Declare, but do not construct a Bank object, call it whatever your first name is.
 Bank logan;

//Now that we have the Bank class, finish the instantiation.
logan = new Bank();

//Use appropriate 'get' methods to see what the current balance for checking and savings are
System.out.println("Checking balance: $" + logan.getChecking());
System.out.println("Savings balance: $" + logan.getSavings()); 
 
//Instantiate another bank object called dummy.  It should start with $1000 in checking and $2000 in savings.
Bank dummy = new Bank(1000, 2000);

//Use appropriate methods to add $4000 to your checking balance and subtract $10000 from your savings.
logan.checkingDeposit(4000);
logan.savingsWithdrawal(10000);

//Withdraw $500 from dummy's savings.
dummy.savingsWithdrawal(500);

//Print your combined balance and the combined of dummy's.
System.out.println("My Combined Balance: $" + logan.getCombined());
System.out.println("Dummy's Combined Balance: $" + dummy.getCombined());
 
//Import the random class

//Instantiate a random object called 'rand1'
Random rand1 = new Random();

//Write a print statement in a loop that will print 5 random integers on a single line with spaces
//in the [0, 49] range.
System.out.print("5 from [0, 49]: ");
for (int i = 0; i < 5; i ++)
   System.out.print(rand1.nextInt(50) + " ");

//Copy and paste: Write a new loop that prints 10 random integers on a single line
//in the [1, 50] range.
System.out.print("\n10 from [1, 50]: ");
for (int i = 0; i < 10; i ++)
   System.out.print((rand1.nextInt(50) + 1) + " ");

//Paste again:  Write another loop that prints a random letter in the [D, K] range.
System.out.print("\nLetter from [D, K]: ");
for (int i = 0; i < 1; i ++)
   System.out.print((char)(rand1.nextInt(8) + 68) + " ");

/////////////////    END EXPLORATORY 6.01-6.04    ////////////


//Use the Math.random() method to print 7 random integers in the [400, 500] range.  
//Make sure 500 is a possibility. Verification may be dificult.
System.out.print("\n7 from [400, 500]: ");
for (int i = 0; i < 7; i++)
   System.out.print((int)(Math.random() * 101 + 400) + " ");

//What range of values does the following produce?
//int whoknows = (int)(Math.random() * 300 - 50);
//System.out.print(whoknows);
// [-50, 249]

//Print the largest and the smallest integer values using the Integer class.
System.out.println("\nMAX: " + Integer.MAX_VALUE + " MIN: " + Integer.MIN_VALUE);

//Add the MAX and the MIN values.  Why is this result not 0?
System.out.println("Combined MAX and MIN: " + (Integer.MAX_VALUE + Integer.MIN_VALUE));
// The zero accounts for one position and that's why the MIN is one more.

//Create an Integer object using auto-boxing
Integer x = new Integer(5); // or just = 5.
 }
}