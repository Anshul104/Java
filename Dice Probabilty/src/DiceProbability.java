import java.util.Scanner;

/**
 * 
 * @author Anshul
 * Assignment: Dice Probability
 *
 */
public class DiceProbability 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int[] counterArr = new int[11];
		System.out.print("How many times would you like to roll: ");
		double finale = in.nextDouble();
		in.nextLine();
		
		for (int i =0; i< finale; i++)
		{
			int dice1Roll = dice1.roll();
			int dice2Roll = dice2.roll();
			
			for (int j =2; j<=12;j++)
			{
				if ((dice1Roll + dice2Roll)==j)
					counterArr[j-2]++;
			}
		}
		for (int i=0; i<counterArr.length;i++)
		{
			double exp= counterArr[i]/finale;
			System.out.printf(i+2+":\t"+counterArr[i]+"\tExperimental probability: %10.4f\n", exp);
		}

	}

}
