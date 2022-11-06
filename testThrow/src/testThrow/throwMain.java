package testThrow;

public class throwMain
{

	public static void main(String[] args)
	{
		BankAccount b1 = new BankAccount();
		
		
		b1.deposit(5);
		System.out.println(b1.getBalance());
		
		try
		{
		b1.deposit(10);
		System.out.println(b1.getBalance());
		
		b1.deposit(-1);
		System.out.println(b1.getBalance());
		}
		catch ( IllegalArgumentException e)
		{
			System.out.println("boooooooooooooobies");
		}
		b1.deposit(56);
		System.out.println(b1.getBalance());
		

	}
	

}
