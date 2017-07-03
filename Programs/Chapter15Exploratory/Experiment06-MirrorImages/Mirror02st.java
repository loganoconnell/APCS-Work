// Mirror02st.java
// 03-22-15 by Leon Schram
// A program to test an algorithm
// for creating an upside-down image of a matrix.
// This is the student starting file.


public class Mirror02st
{
   
   public static void main(String[] args)
   {
      int[][] matrix = {{1,2,3,4,5},
                        {2,3,4,5,6},
                        {3,4,5,6,7},
                        {4,5,6,7,8},
                        {5,6,7,8,9}};
      display(matrix);
      upsideDown(matrix);
      display(matrix);
   } 
   
   public static void display(int[][] m)
   {
      for (int r = 0; r < m.length; r++)
      {
         for (int c = 0; c < m[0].length; c++)
         {
            System.out.print(m[r][c] + "  ");
         }
         System.out.println();
      }
      System.out.println();
   }
   
   public static void upsideDown(int[][] m)
   {  
  
   }    
}
