// Lab15av100_OCONNELL.java
// 02-28-15 by Leon Schram
// The "Odd Magic Square" Program
// This is the student, starting version of the Lab15 assignment.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab15av100_OCONNELL {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

      System.out.print("Enter the odd # size of the Magic Square -->  ");
      int size = input.nextInt();
      MagicSquare magic = new MagicSquare(size);

      magic.computeMagicSquare();
      magic.displayMagicSquare();
    	magic.checkRows();          // for 100 & 110 Point Version Only
   	magic.checkColumns();		 // for 100 & 110 Point Version Only
   	magic.checkDiagonals();	 	 // for 100 & 110 Point Version Only
	}
}

class MagicSquare {
	private int size;
	private int magic[][];
	private DecimalFormat output;

	public MagicSquare(int s) {
		size = s;
		magic = new int[size][size];
		output = new DecimalFormat("000");
	}

	public void computeMagicSquare() {
      int row = 0;
      int col = size / 2;
      
      for (int i = 1; i <= size * size; i++) {
         magic[row][col] = i;
         
         row--;
         col++;
         
         if (i % size == 0) {
            row += 2;
            col -= 1;
         }
         
         else {
            if (row == -1)
               row = size - 1;
            if (col == size)
               col = 0;     
         }
      }
	}

	public void displayMagicSquare() {
		System.out.println("\n" + size + "x" + size + " Magic Square");
		System.out.println("==================\n");
      
      for (int col = 0; col < magic.length; col++) {
         for (int row = 0; row < magic[col].length; row++)
            System.out.print(output.format(magic[col][row]) + " ");
         
         System.out.println();
      }
	}

	public void checkRows() {
		System.out.println("\nChecking Rows");
		System.out.println("=============\n");
      
      int check = size * magic[size / 2][size / 2];
      String row = "";
      
      for (int i = 0; i < size; i++) {
         for (int k = 0; k < size; k++)
            row += (output.format(magic[i][k]) + (k == size - 1 ? "" : " + "));
         
         row += (" = " + check + "\n"); 
      }
      
      System.out.print(row);
	}

	public void checkColumns() {
		System.out.println("\nChecking Columns");
		System.out.println("================\n");
      
      int check = size * magic[size / 2][size / 2];
      String col = "";
      
      for (int i = 0; i < size; i++) {
         for (int k = 0; k < size; k++)
            col += (output.format(magic[k][i]) + (k == size - 1 ? "" : " + "));
         
         col += (" = " + check + "\n"); 
      }
      
      System.out.print(col);
   }

	public void checkDiagonals() {
		System.out.println("\nChecking Diagonals");
		System.out.println("==================\n");
      
      int check = size * magic[size / 2][size / 2];
      String leftDiag = "";
      String rightDiag = "";
      
      //Left up check
      int row = size - 1;
      int col = 0;
      
      for (int i = 0; i < size; i++) {
         leftDiag += (output.format(magic[row][col]) + (col == size - 1 ? "" : " + "));
         
         row--;
         col++;
      }
      
      leftDiag += (" = " + check + "\n"); 
      System.out.print(leftDiag);
      
      //Right down check
      row = 0;
      col = 0;
      
      for (int i = 0; i < size; i++) {
         rightDiag += (output.format(magic[row][col]) + (col == size - 1 ? "" : " + "));
         
         row++;
         col++;
      }
      
      rightDiag += (" = " + check + "\n"); 
      System.out.print(rightDiag);
	}  
}