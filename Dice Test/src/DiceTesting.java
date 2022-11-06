/**
 * 
 * @author Anshul
 * Assignment: Dice Test
 *
 */
public class DiceTesting 
{

	public static void main(String[] args)
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		int roll1 = dice1.roll();
		System.out.println("Dice 1 rolled " + roll1);
		int roll2 = dice2.roll();
		System.out.println("Dice 2 rolled " +roll2);
		
		roll1 = dice1.roll();
		System.out.println("\nDice 1 rolled " + roll1);
		roll2 = dice2.roll();
		System.out.println("Dice 2 rolled " +roll2);
		
		roll1 = dice1.roll();
		System.out.println("\nDice 1 rolled " + roll1);
		roll2 = dice2.roll();
		System.out.println("Dice 2 rolled " +roll2);
		
		roll1 = dice1.roll();
		System.out.println("\nDice 1 rolled " + roll1);
		
		System.out.println("\n\nDice 1 was rolled "+dice1.getNumRolls()+" times");
		System.out.println("Dice 2 was rolled "+dice2.getNumRolls()+" times");
		
		dice1.reset();
		System.out.println("\n!!!Dice 1 was reset!!!");
		
		System.out.println("\nDice 1 was rolled "+dice1.getNumRolls()+" times");
		System.out.println("Dice 2 was rolled "+dice2.getNumRolls()+" times");



	}

}
