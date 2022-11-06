/**
 * 
 * @author Anshul
 * Assignment: 2D array classwork
 *
 */
import java.util.Scanner;
public class twoDeeClasswork
{
	public static void main(String[] args) 
	{
		int randomNum = (int)(Math.random()*51 +50);
		int[] oneDArray = new int[randomNum];
		for (int i =0;i<oneDArray.length;i++)
		{
				oneDArray[i]= (int)(Math.random()*100 + 1);
		}
	
		System.out.println("1D Array:");
		for (int i =0;i<oneDArray.length;i++)
		{
			System.out.print(oneDArray[i] + " ");
		}
		int numberOfRow = randomNum/7;
		double round = Math.round(randomNum/7.0);
		if(round<randomNum/7.0)
			numberOfRow= randomNum/7 +1;
		int counter =0;
	
		System.out.println("\n");
		System.out.println("2D Array:");
		int[][] twoDeeArray = new int[numberOfRow][7];
		for (int i=0;i<twoDeeArray.length;i++)
		{
			for (int j=0;j<twoDeeArray[0].length;j++)
			{
				if (counter < oneDArray.length)
					twoDeeArray[i][j] = oneDArray[counter];
				else
					twoDeeArray[i][j] = 0;
				counter++;
			}
		}
		
		for (int i=0;i<twoDeeArray.length;i++)
		{
			for (int j=0;j<twoDeeArray[0].length;j++)
			{
				System.out.print(twoDeeArray[i][j] +" ");
			}
			System.out.println();
		}
		
		
		Scanner in = new Scanner (System.in);
		System.out.print("\nWhat number do you want to find in the twodee array: ");
		int target = in.nextInt();
		in.nextLine();
		
		
		boolean trueOrFalse = false;
		for (int i=0;i<twoDeeArray.length;i++)
		{
			for (int j=0;j<twoDeeArray[0].length;j++)
			{
				if (twoDeeArray[i][j]==target)
				{
					System.out.println("Row index:" + i +"\nColumn index: " + j+"\n");
					trueOrFalse = true;
				}
			}
		}
		if(trueOrFalse == false)
			System.out.print("Value not found");
		
				
 
	}

}