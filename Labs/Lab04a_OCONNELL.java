// Lab04a_OCONNELL.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04a_OCONNELL
{
	public static void main(String[] args)
	{
		System.out.println("Lab04a, 100 Point Version\n");

		double principal = 250000;
		double annualRate = 4.85;
		double numYears = 30;
      double monthlyRate = annualRate / 1200;
      double monthsToPay = numYears * 12;
      
      System.out.println("Principal:         $" + principal);
      System.out.println("Annual Rate:       " + annualRate + "%");
      System.out.println("Number of Years:   " + numYears);
      
      double monthlyPayment = ((monthlyRate * Math.pow(1 + monthlyRate, monthsToPay)) / (Math.pow(1 + monthlyRate, monthsToPay) - 1)) * principal;
      monthlyPayment = (double)Math.round(monthlyPayment * 100) / 100;
      System.out.println("Monthly Payment:   $" + monthlyPayment);
      
      double totalPayments = monthlyPayment * monthsToPay;
      System.out.println("Total Payments:    $" + totalPayments);
      
      double totalInterest = totalPayments - principal;
      System.out.println("Total Interest:    $" + totalInterest);

		System.out.println();
	}
}

