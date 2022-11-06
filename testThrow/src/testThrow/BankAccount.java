package testThrow;

public class BankAccount 
{

	private double balance = 0;
	
	public void deposit(double amt) throws IllegalArgumentException
	{
		if (amt<=0)
			throw new IllegalArgumentException();
		balance += amt;
				
	}
	
	public double getBalance()
	{
		return balance;
	}
}
