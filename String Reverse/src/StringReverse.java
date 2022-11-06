import java.util.Scanner;

/**
 * 
 * @author Anshul
 * Assignment: String Reverse
 *
 */
public class StringReverse
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = in.nextLine();
		String newStr = "";
		
		for(int i = str.length()-1;i>=0;i--)
		{
			newStr += str.charAt(i);
		}
		System.out.println(newStr);

	}

}
