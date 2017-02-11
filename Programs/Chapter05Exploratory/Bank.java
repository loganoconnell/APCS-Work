// Bank.java
// This file contains the <Bank> class used to demonstrate using object methods.


public class Bank
{

	private double checking;
	private double savings;

	public Bank()
	{
		checking = 0.0;
		savings = 0.0;
	}

	public Bank(double c, double s)
	{
		checking = c;
		savings = s;
	}

	public double getChecking()
	{
		return checking;
	}

	public double getSavings()
	{
		return savings;
	}

	public double getCombined()
	{
		return checking + savings;
	}

	public void checkingDeposit(double amount)
	{
		checking += amount;
	}

	public void savingsDeposit(double amount)
	{
		savings += amount;
	}

	public void checkingWithdrawal(double amount)
	{
		checking -= amount;
	}

	public void savingsWithdrawal(double amount)
	{
		savings -= amount;
	}

	public void closeChecking()
	{
		checking = 0;
	}

	public void closeSavings()
	{
		savings = 0;
	}

}


