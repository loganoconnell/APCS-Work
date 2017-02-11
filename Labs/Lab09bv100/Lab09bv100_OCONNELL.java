// Lab09bv100_OCONNELL.java
// The Rational Class Program II
// This is the student, starting version of the Lab09b assignment.

import java.util.Scanner;

public class Lab09bv100_OCONNELL {
	private static int num1, den1, num2, den2;

	public static void main (String args[]) {
		enterData();

		Rational r1 = new Rational(num1, den1);
		Rational r2 = new Rational(num2, den2);
		Rational r3 = new Rational();

		r3.multiply(r1, r2);
		System.out.println("\n\n" + r1.getOriginal() + " * " + r2.getOriginal() + "  =  " + r3.getReduced());
		r3.divide(r1, r2);
		System.out.println("\n" + r1.getOriginal() + " / " + r2.getOriginal() + "  =  " + r3.getReduced());

		r3.add(r1, r2);
		System.out.println("\n" + r1.getOriginal() + " + " + r2.getOriginal() + "  =  " + r3.getReduced());
		r3.subtract(r1, r2);
		System.out.println("\n" + r1.getOriginal() + " - " + r2.getOriginal() + "  =  " + r3.getReduced() + "\n");
	}

	public static void enterData() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the 1st numerator ----> ");
		num1 = input.nextInt();
		System.out.print("\nEnter the 1st denominator --> ");
		den1 = input.nextInt();
		System.out.print("\nEnter the 2nd numerator ----> ");
		num2 = input.nextInt();
		System.out.print("\nEnter the 2nd denominator --> ");
		den2 = input.nextInt();
	}
}

class Rational {
	private int firstNum, firstDen, reducedNum, reducedDen, gcf;
   
   public Rational() {}
   
   public Rational(int num, int den) {
      firstNum = num;
      firstDen = den;
   }
   
   public int getNum() {
      return firstNum;
   }
   
   public int getDen() {
      return firstDen;
   }
   
   public String getOriginal() {
      return (getNum() + "/" + getDen());
   }
   
   public void reduce() {
      getGCF(getNum(), getDen());
      reducedNum = getNum() / gcf;
      reducedDen = getDen() / gcf;
   }
   
   public String getReduced() {
      reduce();
      return (reducedNum + "/" + reducedDen);
   }
   
   public void multiply(Rational n1, Rational n2) {
      this.firstNum = n1.firstNum * n2.firstNum;
      this.firstDen = n1.firstDen * n2.firstDen;
   }
   
   public void divide(Rational n1, Rational n2) {
      this.firstNum = n1.firstNum * n2.firstDen;
      this.firstDen = n1.firstDen * n2.firstNum;
   }
   
   public void add(Rational n1, Rational n2) {
      this.firstNum = (n1.firstNum * n2.firstDen) + (n2.firstNum * n1.firstDen);
      this.firstDen = n1.firstDen * n2.firstDen;
   }
   
   public void subtract(Rational n1, Rational n2) {
      this.firstNum = (n1.firstNum * n2.firstDen) - (n2.firstNum * n1.firstDen);
      this.firstDen = n1.firstDen * n2.firstDen;
   }
	
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