/*Exploratory08 - String Manipulation
**Exploratory08 will help you become familiar with the many String class methods.
**Of particular note will be combining these methods creatively with loops 
**to create some interesting effects.
**
**Remember to create methods outside the main()
**
** Logan O'Connell
*/

import java.util.*;

// LIST ALL THE STRING METHODS THAT ARE MENTIONED OR USED IN 8.01-8.08
// equals, compareTo, toLower/UpperCase, indexOf, substring

public class Exploratory08StringManipulation_OCONNELL {
   public static String phrase = "EavXeFrhYy toeTyHIeorp wlQEbthtoeMrk!";
   
   public static void main(String[] args) {  
      //Use an appropriate method to print the length of the String 'phrase' above.
      System.out.println("Length of 'phrase': " + phrase.length());
      //Use an appropriate method to print the second "word" in 'phrase'.
      System.out.println("Second 'word': " + phrase.substring(phrase.indexOf(" ") + 1, phrase.indexOf(" ", 11)));
      //Use charAt() to print the 3rd vowel.
      System.out.println("3rd vowel: " + phrase.charAt(4));
      //Use substring() to print the 3rd vowel.
      System.out.println("3rd vowel: " + phrase.substring(4, 5));
      //Use an appropriate method to state the first index where a space exists.
      System.out.println("Index of first space: " + phrase.indexOf(" "));
      //Use a method to find the first occurence of 'toe'.
      System.out.println("Index of first occurence of 'toe': " + phrase.indexOf("toe"));
      //Use a method to find the 2nd occurence of 'toe'.  Can you do this creatively - by NOT hardcoding a value??
      System.out.println("Index of second occurence of 'toe': " + phrase.indexOf("toe", phrase.indexOf("toe") + 1));
      //Write a method below that will accept a String and print every other letter starting with the first.
      //Pass it the variable 'phrase' (look above). Call it here.
      printEveryOther(phrase);
      //Write a method that will print the middle character of any String that it is passed.  Call it here.
      printMiddleCharacter(phrase);
      //Write a method that accepts a String an prints the second half of that String.
      printSecondHalf(phrase);
      //trim 'phrase'.  Assign it to a different String and print it.
      String trimmedPhrase = phrase.trim();
      System.out.println(trimmedPhrase);
      //Write a method below that changes every third letter to uppercase. Call it here.
      toUpperOrLower(phrase, true);
      //Write a method that changes every 3rd letter to lowercase. Call it here.
      toUpperOrLower(phrase, false);
   /* String str1 = "Hello";
      String str2 = new String("Hello");
      System.out.println(str1==str2); //Execute, then change this line so that it reads 'true'. 
   */ 
   
   /*String str3 = "klsddhf834";
     String str4 = "osafh78f";
     Check String inequality between str3 and str4.  Check again, this time switch the order.
   */
     int here = 42; 
     String there = "666";
      //Convert 'here' to a String and concatenate it with 'there'. Print.
      System.out.println((String.valueOf(here) + there));
      //Convert both to integers and add them.  Print.
      System.out.println(here + Integer.parseInt(there));
   }
   
   public static void printEveryOther(String s) {
      for (int i = 0; i < s.length(); i += 2)
         System.out.print(s.substring(i, i + 1));
      System.out.println();
   }
   
   public static void printMiddleCharacter(String s) {
      System.out.println(s.substring(s.length() / 2, (s.length() / 2) + 1));
   }
   
   public static void printSecondHalf(String s) {
      System.out.println(s.substring(s.length() / 2));
   }
   
   public static void toUpperOrLower(String s, Boolean toUpper) {
      for (int i = 0; i < s.length(); i+=3) {
         String x = s.substring(i, i + 1);
         if (toUpper)
            x.toUpperCase();
         else
            x.toLowerCase();
      }  
   }
}