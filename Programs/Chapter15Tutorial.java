// 2-D Array Tutorial
// This program creates a 3 X 3 2D array and uses a method
// to display the array elements.
// 


public class Chapter15Tutorial
{
	public static void main(String[] args)
	{
		int[][] mat = {{1,2,3},
					      {4,5,6},
					      {7,8,9}};
		rowMajor(mat);
      columnMajor(mat);
      displayMatrix(mat);
	}

//Complete method rowMajor to display the matrix above in row-major form.
	public static void rowMajor(int[][] m) {
      for (int col = 0; col < m.length; col++) {
         for (int row = 0; row < m[col].length; row++) {
            System.out.print(m[col][row] + " ");
         }
         
         System.out.println();
      }
      
      System.out.println();
	}
   
//Complete method columnMajor to display the matrix above in column-major form.
	public static void columnMajor(int[][] m) {
      for (int row = 0; row < m[0].length; row++) {
         for (int col = 0; col < m.length; col++) {
            System.out.print(m[col][row] + " ");
         }
         
         System.out.println();
      }
      
      System.out.println();
	}
   
//Complete method displayMatrix so that it displays the matrix in row-major
//and uses the length field properly.   
	public static void displayMatrix(int[][] m) {
      for (int col = 0; col < m.length; col++) {
         for (int row = 0; row < m[col].length; row++) {
            System.out.print(m[col][row] + " ");
         }
         
         System.out.println();
      }
      
      System.out.println();
	}
   
//Add a single int element to any of the arrays.  Does your displayMatrix method still work?
//if not, make the appropriate edit(s).
}


