// Mirror01st.java
// 03-22-15 by Leon Schram
// A program to test an algorithm
// for creating a mirror image of a matrix.
// This is the student starting file.


public class Mirror01st
{
   
   public static void main(String[] args)
   {
      int[][] matrix = {{1,2,3,4},
                        {1,2,3,4},
                        {1,2,3,4},
                        {1,2,3,4}};
      display(matrix);
      mirror(matrix);
      display(matrix);
   } 
   
   public static void display(int[][] m)
   {
      int height = m.length;
      int width = m[0].length;
      for (int r = 0; r < height; r++)
      {
         for (int c = 0; c < width; c++)
         {
            System.out.print(m[r][c] + "  ");
         }
         System.out.println();
      }
      System.out.println();
   }
   
   public static void mirror(int[][] m)
   {  
   
   } 
      
}
