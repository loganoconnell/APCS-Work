/* The exploratory for Chapter 07 involves no-parameter void methods, single- and 
** multi-parameter void methods and then return methods as well. 
** class (aka static) variables  vs. local variables are a topic.  
** We conclude with embedding methods inside other methods.
** - Logan O'Connell
*/   

public class Ch07Exploratory {

   static String name = "Logan";

   public static void main(String[] args) {
      //Write a brief 'outline' of your average day. Use void methods. 
      //Some methods might include: wakeup(), morningRoutine(), attendClasses(), practiceTuba(), etc.
      //Several methods will need to take at least 1 parameter.  For example, how long is your morning routine? 
      //This is just an outline and the specifics should NOT be worked out yet.   
      wakeUp();
      System.out.println(mourningRoutine());
      school();
      playBasketball();
      doHomework();
      goToSleep();
      System.out.println("My name is " + name);
   }
   
   //Compile. You should get error messages.
   //(a)For each method above, write the appropriate stub below. Notice you are OUTSIDE the main().
   //   Compile - error messages should be gone, though there is no output.
   //(b)Only after (a) is done - Write a print statement for your first method and check that it works.
   public static void wakeUp() {
      System.out.println("Wake Up");
      
      int testVar = 10;
      System.out.println(testVar);
   }
   
   public static String mourningRoutine() {
      System.out.println(name + " Accomplished Mourning Routine");
      
      return "Finished At 7:00";
   }
   
   public static void goToSchool() {
      System.out.println("Go To School");
   }
   
   public static void sitThroughClasses() {
      System.out.println("Sit Through Classes");
   }
   
   public static void goHome() {
      System.out.println("Go Home");
   }
   
   public static void playBasketball() {
      System.out.println("Play Basketball");
   }
   
   public static void doHomework() {
      System.out.println("Do Homework");
   }
   
   public static void goToSleep() {
      System.out.println("Go To Sleep");
   }
   
   public static void school() {
      goToSchool();
      sitThroughClasses();
      goHome();
   }

//Write the remaining methods - use print statements only.  Test each as you go along. 

//Change one of your methods to a 'return' method.  Alter the main() appropriately.

//Instantiate a variable inside a method and 
//print it from (1) the main().  What happened?? . . . and then 
//              (2) the method it is in (call it from the main()).

//Instantiate a 'class' variable then (1) print it from the main() and (2) access it from a method.
//Hint: Where should you declare a class variable??

/* Can several of your methods fall under an 'umbrella' method?  For example, brushTeeth() and walkDog()
** might fall under morningRoutine().  Write a method that calls at least two of your other methods.
** then call this 'umbrella' method in the main().
*/
}