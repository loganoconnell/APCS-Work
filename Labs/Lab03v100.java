// Lab03v100.java
// Student starting version of the Lab03 assignment.
// Resave this program as Lab03v80 for the 80 point version.
// Resave this program as Lab03v100 for the 100 point version.

public class Lab03v100 {
   public static void main(String[] args) { 
      // Make sure we have an input for the program     
      if (args.length == 1) {
         System.out.println("Lab03, 100 Point Version\n");
         
         // Get milli-seconds from input
         long startingMilliSeconds = Long.parseLong(args[0]);
         System.out.println("Starting milli-seconds:  " + startingMilliSeconds);
         
         // Calculate hours from milli-seconds
         long roundedHours = startingMilliSeconds / 3600000;
         System.out.println("Hours:                   " + roundedHours);
         
         // Left over milli-seconds after hours computation
         long leftOverMilliSeconds = startingMilliSeconds % 3600000;
         
         // Calculate hours from left over milli-seconds
         long roundedMinutes = leftOverMilliSeconds / 60000;
         System.out.println("Minutes:                 " + roundedMinutes);
         
         // Left over milli-seconds after minutes computation
         leftOverMilliSeconds = leftOverMilliSeconds % 60000;
         
         // Calculate seconds from left over milli-seconds
         long roundedSeconds = leftOverMilliSeconds / 1000;
         System.out.println("Seconds:                 " + roundedSeconds);
         
         // Left over milli-seconds after seconds computation
         leftOverMilliSeconds = leftOverMilliSeconds % 1000;
         System.out.println("Milli Seconds:           " + leftOverMilliSeconds);
      }
      
      else {
         // Throw exception if there is no input
         System.out.println("Please enter an input to use this program.");
      }
   }
}