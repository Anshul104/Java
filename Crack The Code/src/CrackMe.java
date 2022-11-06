/**
 * 
 * @author Anshul
 * Assignment: Crack the Code
 *
 */
public class CrackMe
{
	private String pin; 
	
	public CrackMe()
	{
		pin = Integer.toString((int)(Math.random()*900 + 100));
	}
	
	public boolean checkFirstDigit(String str)
	{
		return (pin.charAt(0)==str.charAt(0));
	}
	
	public boolean checkSecondDigit(String str)
	{
		return (pin.charAt(1)==str.charAt(1));
	}
	
	public boolean checkThirdDigit(String str)
	{
		return (pin.charAt(2)==str.charAt(2));
	}
	public String toString()
	{
		return pin;
	}
}
