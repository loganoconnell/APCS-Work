// Lab08v100_OCONNELL.java
// The "Palindrome" Program
// This is the student starting file for Lab08.
// Logan O'Connell

import java.util.Scanner;

public class Lab08v100_OCONNELL {
	public static void main (String[] args) {
      Scanner input = new Scanner(System.in);
		boolean notFinished = false;
      
		do {
			System.out.print("Enter a string  ===>>  ");
			String str = input.nextLine();
			System.out.println("\nEntered String:     " + str);
			System.out.println("Palindrome:         " + Palindrome.isPal(str));
			System.out.println("Almost Palindrome:  " + Palindrome.almostPal(str));
			System.out.print("Do you wish to repeat this program [Y/N]?  ===>>  ");
			notFinished = input.nextLine().toLowerCase().equals("y");
			System.out.println();
		}
		while (notFinished);
	}
}

class Palindrome {
	public static boolean isPal(String s) {
      String backwards = "";
      
      for (int i = s.length(); i > 0; i--)
         backwards += s.substring(i - 1, i);
         
      return (backwards.equals(s));
	}
   
   private static boolean isLetter(String letter) {
      int ascii = (int)letter.charAt(0);
      
      return ((ascii > 64 && ascii < 91) || (ascii > 96 && ascii < 123)) ? true : false;
   }
   
	private static String purge(String s) {
      String newString = "";
      
      for (int i = 0; i < s.length(); i++)
         newString += (isLetter(s.substring(i, i + 1))) ? s.substring(i, i + 1) : "";
      
      return newString;
	}
   
	public static boolean almostPal(String s) {
      return isPal(s) ? false : isPal(purge(s).toLowerCase());
	}
}