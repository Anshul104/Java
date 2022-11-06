/**
 * 
 * @author Anshul
 * Assignment: Phone Number
 *
 */
import java.util.Scanner;
public class PhoneNumber
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = in.nextLine();
		
		System.out.print("Enter your phone number in the format xxxxxxxxxx: ");
		String number = in.nextLine();
		number =("("+ number.substring(0,3)+") "+number.substring(3,6)+"-"+number.substring(7)); 
		
				
		System.out.printf("%-20s %s", name,number);

	}

}
