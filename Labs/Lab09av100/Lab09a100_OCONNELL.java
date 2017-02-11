// Lab09a100_OCONNELL.java
// The Rational Class Program I
// This is the student, starting version of the Lab09a assignment.

import java.util.Scanner;

public class Lab09a100_OCONNELL {
	private static int num, den;

	public static void main (String[] args) {
		enterData();
		Rational r = new Rational(num,den);
		r.displayData();
	}

	public static void enterData() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the numerator ----> ");
		num = input.nextInt();
		System.out.print("\nEnter the denominator --> ");
		den = input.nextInt();
	}
}

class Rational {
   private int firstNum, firstDen, reducedNum, reducedDen, gcf;
   
   public Rational(int n, int d) {
      firstNum = n;
      firstDen = d;
   }
   
   public int getNum() { return firstNum; }
   
   public int getDen() { return firstDen; }
   
   public double getDecimal() { return (double)getNum() / getDen(); }
   
   public String getOriginal() { return (getNum() + "/" + getDen()); }
   
   public void reduce() {
      getGCF(getNum(), getDen());
      reducedNum = firstNum / gcf;
      reducedDen = firstDen / gcf;
   }
   
   public String getReduced() { 
      reduce();
      return (reducedNum + "/" + reducedDen);
   }

   public void displayData() { System.out.println("\n" + getOriginal() + " equals " + getDecimal() + "\n\nand reduces to " + getReduced() + "\n"); }

	private void getGCF(int n1, int n2) {
		int rem = 0;
      
		do {
			rem = n1 % n2;
         
			if (rem == 0)
				gcf = n2;
			else {
				n1 = n2;
				n2 = rem;
			}
		}
		while (rem != 0);
	}
}