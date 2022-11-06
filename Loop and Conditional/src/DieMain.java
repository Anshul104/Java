import java.util.Scanner;

/**
 * 
 * @author 	Anshul
 * 
 * MULTI SIDED DIE MAIN
 *
 */
public class DieMain 
{

	public static void main(String[] args) 
	{
		/*
		 * TASK ONE
		 * 
		 * create two twelve sided dice and
		 * roll the dice until you roll doubles
		 * (print each roll to the screen).
		 * Once you have rolled doubles, print
		 * to the screen the number of times
		 * you had to roll the dice to get doubles
		 * 
		 */

		MultiSidedDie dice1 = new MultiSidedDie(12);
		MultiSidedDie dice2 = new MultiSidedDie(12);
		int dice1_roll = 1;
		int dice2_roll = 0;
		while(dice1_roll != dice2_roll)
		{
			dice1_roll = dice1.roll();
			dice2_roll = dice2.roll();
			System.out.print(dice1_roll+" ");
			System.out.println(dice2_roll);
		}
		System.out.println("\nNumber of times you have rolled: "+dice1.getNumRolls());

		/*
		 * TASK TWO
		 * 
		 * ask the user to enter the number of sides
		 * they would like to have on their dice and
		 * construct the appropriate Die object (only one).
		 * 
		 * ask the user to identify a target roll 
		 * value(ensure that it is between 1 and numSides).
		 * Roll the Die 20 times, printing
		 * each roll.  Print the number of times the
		 * target was rolled
		 *
		 */


		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the number of side: ");
		int numberofSides = in.nextInt();
		in.nextLine();
		MultiSidedDie dice3 = new MultiSidedDie(numberofSides);
		int counter = 0;
		int dice3_roll = 0;
		
		System.out.print("Please enter your target: ");
		int target = in.nextInt();
		in.nextLine();
		while(target<1 || target>dice3.getNumSides())
		{
			System.out.print("Please. enter. your. target: ");
			target = in.nextInt();
			in.nextLine();
		}

		for(int i = 0; i <20; i++)
		{
			dice3_roll = dice3.roll();
			if (target == dice3_roll)
			{
				counter++;
			}
			System.out.println(dice3_roll);
		}
		System.out.println("\nYou rolled your target: "+counter+" times.");


		/*
		 * TASK THREE
		 * 
		 * As in task two, ask the user to identify the number
		 * of sides for the Die object and construct the 
		 * appropriate Die.  Ask the user to identify a target
		 * roll value(ensure that it is a valid entry).  
		 * Roll the die until you the target is rolled.  Print
		 * each roll.   Print the number of rolls required to 
		 * roll the target value.
		 */


		System.out.print("Please enter the number of side: ");
		int numberofSides1 = in.nextInt();
		in.nextLine();
		MultiSidedDie dice4 = new MultiSidedDie(numberofSides1);
		int counter1 = 0;
		int dice4_roll = 0;
		
		System.out.print("Please enter your target: ");
		int target2 = in.nextInt();
		in.nextLine();
		while(target2<1 || target2>dice4.getNumSides())
		{
			System.out.print("Please. enter. your. target: ");
			target2 = in.nextInt();
			in.nextLine();
		}
		
		while(target != dice4_roll)
		{
			dice4_roll = dice4.roll();
			System.out.println(dice4_roll);
			counter1++;
		}
		System.out.println("\nThe number of rolls required to roll the tareget value is: "+counter1+" times.");

	}

}
