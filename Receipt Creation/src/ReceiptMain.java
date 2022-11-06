/**
 * 
 * @author Anshul
 * Assignment: Receipt Creation
 *
 */
import java.util.Scanner;
public class ReceiptMain
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Appetizer: ");
		String appName = in.nextLine();
		System.out.print("App Price: $ ");
		double appCost = in.nextDouble();
		in.nextLine();
		
		System.out.print("Entree: ");
		String entreeName = in.nextLine();
		System.out.print("Entree Price: $ ");
		double entreeCost = in.nextDouble();
		in.nextLine();
		
		System.out.print("Drink: ");
		String drinkName = in.nextLine();
		System.out.print("Drink Price: $ ");
		double drinkCost = in.nextDouble();
		in.nextLine();
		
		System.out.print("Dessert: ");
		String dessertName = in.nextLine();
		System.out.print("Dessert Price: $ ");
		double dessertCost = in.nextDouble();
		in.nextLine();
		System.out.println();

		System.out.printf( "%-15s %20.2f\n",appName, appCost);
		System.out.printf( "%-15s %20.2f\n",entreeName, entreeCost);
		System.out.printf( "%-15s %20.2f\n",drinkName, drinkCost);
		System.out.printf( "%-15s %20.2f\n",dessertName, dessertCost);
		System.out.printf( "%-15s %20.2f\n","Subtotal", ReceiptCalculator.calcSubtotal(appCost, entreeCost, drinkCost, dessertCost));
		System.out.printf( "%-15s %20.2f\n","Tax(6%)", ReceiptCalculator.calcTax(ReceiptCalculator.calcSubtotal(appCost, entreeCost, drinkCost, dessertCost),0.06));
		System.out.println("************************************");
		System.out.printf( "%-15s %20.2f\n","Total", (ReceiptCalculator.calcSubtotal(appCost, entreeCost, drinkCost, dessertCost)+ReceiptCalculator.calcTax(ReceiptCalculator.calcSubtotal(appCost, entreeCost, drinkCost, dessertCost),0.06) ));
	}

}

