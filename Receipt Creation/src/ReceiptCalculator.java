/**
 * 
 * @author Anshul
 * Assignment: Receipt Calculator
 *
 */
public class ReceiptCalculator
{

	public static double calcSubtotal(double app,double entree,double drink,double dessert )
	{
		return app+entree+drink+dessert;
	}
	public static double calcTax (double sub, double taxRate)
	{
		return taxRate*sub;
	}
	
}
