//Exploratory Chapter 12 - Dynamic Arrays using the ArrayList Class.
import java.util.ArrayList;
import java.lang.Integer;


public class ExploratoryCh12{

   public static void main(String[] args){
   
//Create an arraylist of integers called 'numlist'.  Compile.
   ArrayList<Integer> numList = new ArrayList<Integer>();

//What happened??  Make the appropriate import.


//Add 5 integers to it.
   for (int i = 1; i <= 5; i++)
      numList.add(new Integer(i));
   
   System.out.println(numList);
//Print the size of the array
   System.out.println("Size of array: " + numList.size());

//PRINT THE ARRAY EACH TIME YOU ALTER IT AND CHECK YOUR WORK . . . 



//add the integer 500 to the end of the array.
   numList.add(new Integer(500));
   
   System.out.println(numList);
//set the second element to 37.
   numList.set(1, new Integer(37));
   
   System.out.println(numList);
//insert 50 into the 3rd index.
   numList.add(3, new Integer(50));
   
   System.out.println(numList);
//use a loop to add one to each element if it is odd.
   for (Integer num: numList) {
      if (num % 2 != 0)
         numList.set(numList.indexOf(num), new Integer(num + 1));
   }
   
   System.out.println(numList);
//use a loop to remove each element that is even.  
   for (int i = 0; i < numList.size(); i++) {
      if (numList.get(i) % 2 == 0) {  
         numList.remove(i);
         i--;
      }
   }
   
   System.out.println(numList);
   
}











}