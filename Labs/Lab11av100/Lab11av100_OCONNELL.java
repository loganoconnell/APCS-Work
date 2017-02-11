// Lab11av100_OCONNELL.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab11av100_OCONNELL {
   public static int MAX;
   public static Scanner input;
   
	public static void main(String[] args) {
		input = new Scanner(System.in);
      
      promptForMax();
	}
   
   public static void promptForMax() {
      System.out.print("Enter the primes upper bound  ===>>  ");
		MAX = input.nextInt();
		boolean primes[] = new boolean[MAX];
		computePrimes(primes);
		displayPrimes(primes);
   }

	public static void computePrimes(boolean primes[]) {
		System.out.println("\nCOMPUTING PRIME NUMBERS");

      for (int i = 2; i < MAX; i++) {
         if (primes[i] == false && isPrime(i)) {
            primes[i] = true;
            
            for (int j = i * 2; j < MAX; j+=i)
               primes[j] = false;
         }  
      }  
	}

	public static void displayPrimes(boolean primes[]) {
		System.out.println("\nPRIMES BETWEEN 1 AND "+ primes.length);
      
      DecimalFormat df = new DecimalFormat("0000");
      int counter = 0;
      
      for (int i = 1; i < MAX; i++) {
         if (primes[i] == true) {
            System.out.print(df.format(i) + " ");
            
            counter++;
            
            if (counter % 15 == 0) {
               System.out.println();
               counter = 0;
            }
         }
      }
      
      System.out.println("\n\nPress any key and enter to continue...");
      
      while (input.next() == "") {}
      
      promptForMax();
         
	}
   
   public static boolean isPrime(int n) {
      if (n % 2 == 0) return false;
      
      for (int i = 3; i * i <= n; i+=2)
         if (n % i == 0) return false;
         
      return true;
   }
}