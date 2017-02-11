// Lab03v100OCONNELL.java
// Student starting version of the Lab03 assignment.
// Resave this program as Lab03v80 for the 80 point version.
// Resave this program as Lab03v100 for the 100 point version.


public class Lab03v100OCONNELL
{
	public static void main(String[] args)
	{
      if (args.length == 1) {
         System.out.println("Lab03, 100 Point Version\n");
         
         long milliSeconds = Long.parseLong(args[0]);
         System.out.println("Starting milli-seconds:  " + milliSeconds);
         
         long roundedHours = milliSeconds / 3600000;
         System.out.println("Hours:                   " + roundedHours);
         
         milliSeconds %= 3600000;
         
         long roundedMinutes = milliSeconds / 60000;
         System.out.println("Minutes:                 " + roundedMinutes);
         
         milliSeconds %= 60000;
         
         long roundedSeconds = milliSeconds / 1000;
         System.out.println("Seconds:                 " + roundedSeconds);
         
         milliSeconds %= 1000;
         
         System.out.println("Milli Seconds:           " + milliSeconds);
      }
	}
}

