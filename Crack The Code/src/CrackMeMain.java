import java.util.Scanner;

/**
 * 
 * @author Anshul
 * Assignment: Crack the Code
 *
 */
public class CrackMeMain
{

	public static void main(String[] args)
	{
		CrackMe crack = new CrackMe();
		Scanner in = new Scanner(System.in);
		
		int counter = 10;
		int guess = 000;
		String underscore= "";
		boolean trueFalse = false;

		if(trueFalse==false && counter > 0)
		{
			System.out.print("Number of Guesses left: "+counter+"\nGuess the pin: ");
			boolean nextInt = in.hasNextInt();

			if(nextInt)
			{
				guess = in.nextInt();
				in.nextLine();
				System.out.print("\tYou have entered an integer");
				if (guess > 999 || guess <100)
				{
					System.out.print(" that is beyond our scope. \n\tPlease type an integer between 100 and 999. You have wasted your turn!\n");
					counter --;
				}
				else
				{
					System.out.println(" that is valid!");
					if (crack.checkFirstDigit(Integer.toString(guess))&&(crack.checkSecondDigit(Integer.toString(guess))&&(crack.checkThirdDigit(Integer.toString(guess)))))
					{
						counter--;
						System.out.println("You won!!!");
						trueFalse = true;
					}
					else
					{
						if (crack.checkFirstDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(0);
						else
							underscore += "_";
						if (crack.checkSecondDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(1);
						else
							underscore += "_";
						if (crack.checkThirdDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(2);
						else
							underscore += "_";
						System.out.println("How close your guess is: "+underscore);
						underscore = "";
						counter --;
					}
					
				}
			}
				
			else
			{
				in.nextLine();
				System.out.println("\tPlease enter an integer! You have wasted your guess!");
				counter --;
			}		
		}
		if (trueFalse==false && counter == 0)
		{
			System.out.println("You lost!!");
			System.out.print("The pin was hi!: "+crack.toString());
		}
			
			
//one
			System.out.println("");
			
		if(trueFalse==false && counter > 0)
		{
			System.out.print("\nNumber of Guesses left: "+counter+"\nGuess the pin: ");
			boolean nextInt = in.hasNextInt();

			if(nextInt)
			{
				guess = in.nextInt();
				in.nextLine();
				System.out.print("\tYou have entered an integer");
				if (guess > 999 || guess <100)
				{
					System.out.print(" that is beyond our scope. \n\tPlease type an integer between 100 and 999. You have wasted your turn!\n");
					counter --;
				}
				else
				{
					System.out.println(" that is valid!");
					if (crack.checkFirstDigit(Integer.toString(guess))&&(crack.checkSecondDigit(Integer.toString(guess))&&(crack.checkThirdDigit(Integer.toString(guess)))))
					{
						counter--;
						System.out.println("You won!!!");
						trueFalse = true;
					}
					else
					{
						if (crack.checkFirstDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(0);
						else
							underscore += "_";
						if (crack.checkSecondDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(1);
						else
							underscore += "_";
						if (crack.checkThirdDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(2);
						else
							underscore += "_";
						System.out.println("How close your guess is: "+underscore);
						underscore = "";
						counter --;
					}
					
				}
			}
				
			else
			{
				in.nextLine();
				System.out.println("\tPlease enter an integer! You have wasted your guess!");
				counter --;
			}		
		}
		if (trueFalse==false && counter == 0)
		{
			System.out.println("You lost!!");
			System.out.print("The pin was: "+crack.toString());
		}
		
			
//two
			System.out.println("");
			
		if(trueFalse==false && counter > 0)
		{
			System.out.print("\nNumber of Guesses left: "+counter+"\nGuess the pin: ");
			boolean nextInt = in.hasNextInt();

			if(nextInt)
			{
				guess = in.nextInt();
				in.nextLine();
				System.out.print("\tYou have entered an integer");
				if (guess > 999 || guess <100)
				{
					System.out.print(" that is beyond our scope. \n\tPlease type an integer between 100 and 999. You have wasted your turn!\n");
					counter --;
				}
				else
				{
					System.out.println(" that is valid!");
					if (crack.checkFirstDigit(Integer.toString(guess))&&(crack.checkSecondDigit(Integer.toString(guess))&&(crack.checkThirdDigit(Integer.toString(guess)))))
					{
						counter--;
						System.out.println("You won!!!");
						trueFalse = true;
					}
					else
					{
						if (crack.checkFirstDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(0);
						else
							underscore += "_";
						if (crack.checkSecondDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(1);
						else
							underscore += "_";
						if (crack.checkThirdDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(2);
						else
							underscore += "_";
						System.out.println("How close your guess is: "+underscore);
						underscore = "";
						counter --;
					}
					
				}
			}
				
			else
			{
				in.nextLine();
				System.out.println("\tPlease enter an integer! You have wasted your guess!");
				counter --;
			}		
		}
		if (trueFalse==false && counter == 0)
		{
			System.out.println("You lost!!");
			System.out.print("The pin was: "+crack.toString());
		}
	
//three
		
			System.out.println("");
			
		if(trueFalse==false && counter > 0)
		{
			System.out.print("\nNumber of Guesses left: "+counter+"\nGuess the pin: ");
			boolean nextInt = in.hasNextInt();

			if(nextInt)
			{
				guess = in.nextInt();
				in.nextLine();
				System.out.print("\tYou have entered an integer");
				if (guess > 999 || guess <100)
				{
					System.out.print(" that is beyond our scope. \n\tPlease type an integer between 100 and 999. You have wasted your turn!\n");
					counter --;
				}
				else
				{
					System.out.println(" that is valid!");
					if (crack.checkFirstDigit(Integer.toString(guess))&&(crack.checkSecondDigit(Integer.toString(guess))&&(crack.checkThirdDigit(Integer.toString(guess)))))
					{
						counter--;
						System.out.println("You won!!!");
						trueFalse = true;
					}
					else
					{
						if (crack.checkFirstDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(0);
						else
							underscore += "_";
						if (crack.checkSecondDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(1);
						else
							underscore += "_";
						if (crack.checkThirdDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(2);
						else
							underscore += "_";
						System.out.println("How close your guess is: "+underscore);
						underscore = "";
						counter --;
					}
					
				}
			}
				
			else
			{
				in.nextLine();
				System.out.println("\tPlease enter an integer! You have wasted your guess!");
				counter --;
			}		
		}
		if (trueFalse==false && counter == 0)
		{
			System.out.println("You lost!!");
			System.out.print("The pin was: "+crack.toString());
		}
			
//four
			System.out.println("");
			
		if(trueFalse==false && counter > 0)
		{
			System.out.print("\nNumber of Guesses left: "+counter+"\nGuess the pin: ");
			boolean nextInt = in.hasNextInt();

			if(nextInt)
			{
				guess = in.nextInt();
				in.nextLine();
				System.out.print("\tYou have entered an integer");
				if (guess > 999 || guess <100)
				{
					System.out.print(" that is beyond our scope. \n\tPlease type an integer between 100 and 999. You have wasted your turn!\n");
					counter --;
				}
				else
				{
					System.out.println(" that is valid!");
					if (crack.checkFirstDigit(Integer.toString(guess))&&(crack.checkSecondDigit(Integer.toString(guess))&&(crack.checkThirdDigit(Integer.toString(guess)))))
					{
						counter--;
						System.out.println("You won!!!");
						trueFalse = true;
					}
					else
					{
						if (crack.checkFirstDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(0);
						else
							underscore += "_";
						if (crack.checkSecondDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(1);
						else
							underscore += "_";
						if (crack.checkThirdDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(2);
						else
							underscore += "_";
						System.out.println("How close your guess is: "+underscore);
						underscore = "";
						counter --;
					}
					
				}
			}
				
			else
			{
				in.nextLine();
				System.out.println("\tPlease enter an integer! You have wasted your guess!");
				counter --;
			}		
		}
		if (trueFalse==false && counter == 0)
		{
			System.out.println("You lost!!");
			System.out.print("The pin was: "+crack.toString());
		}
	
//five
			System.out.println("");
			
		if(trueFalse==false && counter > 0)
		{
			System.out.print("\nNumber of Guesses left: "+counter+"\nGuess the pin: ");
			boolean nextInt = in.hasNextInt();

			if(nextInt)
			{
				guess = in.nextInt();
				in.nextLine();
				System.out.print("\tYou have entered an integer");
				if (guess > 999 || guess <100)
				{
					System.out.print(" that is beyond our scope. \n\tPlease type an integer between 100 and 999. You have wasted your turn!\n");
					counter --;
				}
				else
				{
					System.out.println(" that is valid!");
					if (crack.checkFirstDigit(Integer.toString(guess))&&(crack.checkSecondDigit(Integer.toString(guess))&&(crack.checkThirdDigit(Integer.toString(guess)))))
					{
						counter--;
						System.out.println("You won!!!");
						trueFalse = true;
					}
					else
					{
						if (crack.checkFirstDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(0);
						else
							underscore += "_";
						if (crack.checkSecondDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(1);
						else
							underscore += "_";
						if (crack.checkThirdDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(2);
						else
							underscore += "_";
						System.out.println("How close your guess is: "+underscore);
						underscore = "";
						counter --;
					}
					
				}
			}
				
			else
			{
				in.nextLine();
				System.out.println("\tPlease enter an integer! You have wasted your guess!");
				counter --;
			}		
		}
		if (trueFalse==false && counter == 0)
		{
			System.out.println("You lost!!");
			System.out.print("The pin was: "+crack.toString());
		}
		
//six
		System.out.println("");
		
		if(trueFalse==false && counter > 0)
		{
			System.out.print("\nNumber of Guesses left: "+counter+"\nGuess the pin: ");
			boolean nextInt = in.hasNextInt();

			if(nextInt)
			{
				guess = in.nextInt();
				in.nextLine();
				System.out.print("\tYou have entered an integer");
				if (guess > 999 || guess <100)
				{
					System.out.print(" that is beyond our scope. \n\tPlease type an integer between 100 and 999. You have wasted your turn!\n");
					counter --;
				}
				else
				{
					System.out.println(" that is valid!");
					if (crack.checkFirstDigit(Integer.toString(guess))&&(crack.checkSecondDigit(Integer.toString(guess))&&(crack.checkThirdDigit(Integer.toString(guess)))))
					{
						counter--;
						System.out.println("You won!!!");
						trueFalse = true;
					}
					else
					{
						if (crack.checkFirstDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(0);
						else
							underscore += "_";
						if (crack.checkSecondDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(1);
						else
							underscore += "_";
						if (crack.checkThirdDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(2);
						else
							underscore += "_";
						System.out.println("How close your guess is: "+underscore);
						underscore = "";
						counter --;
					}
					
				}
			}
				
			else
			{
				in.nextLine();
				System.out.println("\tPlease enter an integer! You have wasted your guess!");
				counter --;
			}		
		}
		if (trueFalse==false && counter == 0)
		{
			System.out.println("You lost!!");
			System.out.print("The pin was: "+crack.toString());
		}
			
//seven
			System.out.println("");
			
		if(trueFalse==false && counter > 0)
		{
			System.out.print("\nNumber of Guesses left: "+counter+"\nGuess the pin: ");
			boolean nextInt = in.hasNextInt();

			if(nextInt)
			{
				guess = in.nextInt();
				in.nextLine();
				System.out.print("\tYou have entered an integer");
				if (guess > 999 || guess <100)
				{
					System.out.print(" that is beyond our scope. \n\tPlease type an integer between 100 and 999. You have wasted your turn!\n");
					counter --;
				}
				else
				{
					System.out.println(" that is valid!");
					if (crack.checkFirstDigit(Integer.toString(guess))&&(crack.checkSecondDigit(Integer.toString(guess))&&(crack.checkThirdDigit(Integer.toString(guess)))))
					{
						counter--;
						System.out.println("You won!!!");
						trueFalse = true;
					}
					else
					{
						if (crack.checkFirstDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(0);
						else
							underscore += "_";
						if (crack.checkSecondDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(1);
						else
							underscore += "_";
						if (crack.checkThirdDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(2);
						else
							underscore += "_";
						System.out.println("How close your guess is: "+underscore);
						underscore = "";
						counter --;
					}
					
				}
			}
				
			else
			{
				in.nextLine();
				System.out.println("\tPlease enter an integer! You have wasted your guess!");
				counter --;
			}		
		}
		if (trueFalse==false && counter == 0)
		{
			System.out.println("You lost!!");
			System.out.print("The pin was: "+crack.toString());
		}
			
//eight
			System.out.println("");
			
		if(trueFalse==false && counter > 0)
		{
			System.out.print("\nNumber of Guesses left: "+counter+"\nGuess the pin: ");
			boolean nextInt = in.hasNextInt();

			if(nextInt)
			{
				guess = in.nextInt();
				in.nextLine();
				System.out.print("\tYou have entered an integer");
				if (guess > 999 || guess <100)
				{
					System.out.print(" that is beyond our scope. \n\tPlease type an integer between 100 and 999. You have wasted your turn!\n");
					counter --;
				}
				else
				{
					System.out.println(" that is valid!");
					if (crack.checkFirstDigit(Integer.toString(guess))&&(crack.checkSecondDigit(Integer.toString(guess))&&(crack.checkThirdDigit(Integer.toString(guess)))))
					{
						counter--;
						System.out.println("You won!!!");
						trueFalse = true;
					}
					else
					{
						if (crack.checkFirstDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(0);
						else
							underscore += "_";
						if (crack.checkSecondDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(1);
						else
							underscore += "_";
						if (crack.checkThirdDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(2);
						else
							underscore += "_";
						System.out.println("How close your guess is: "+underscore);
						underscore = "";
						counter --;
					}
					
				}
			}
				
			else
			{
				in.nextLine();
				System.out.println("\tPlease enter an integer! You have wasted your guess!");
				counter --;
			}		
		}
		if (trueFalse==false && counter == 0)
		{
			System.out.println("You lost!!");
			System.out.print("The pin was: "+crack.toString());
		}
			
//nine
			System.out.println("");
			
		if(trueFalse==false && counter > 0)
		{
			System.out.print("\nNumber of Guesses left: "+counter+"\nGuess the pin: ");
			boolean nextInt = in.hasNextInt();

			if(nextInt)
			{
				guess = in.nextInt();
				in.nextLine();
				System.out.print("\tYou have entered an integer");
				if (guess > 999 || guess <100)
				{
					System.out.print(" that is beyond our scope. \n\tPlease type an integer between 100 and 999. You have wasted your turn!\n");
					counter --;
				}
				else
				{
					System.out.println(" that is valid!");
					if (crack.checkFirstDigit(Integer.toString(guess))&&(crack.checkSecondDigit(Integer.toString(guess))&&(crack.checkThirdDigit(Integer.toString(guess)))))
					{
						counter--;
						System.out.println("You won!!!");
						trueFalse = true;
					}
					else
					{
						if (crack.checkFirstDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(0);
						else
							underscore += "_";
						if (crack.checkSecondDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(1);
						else
							underscore += "_";
						if (crack.checkThirdDigit(Integer.toString(guess)))
							underscore += (Integer.toString(guess)).charAt(2);
						else
							underscore += "_";
						System.out.println("How close your guess is: "+underscore);
						underscore = "";
						counter --;
					}
					
				}
			}
				
			else
			{
				in.nextLine();
				System.out.println("\tPlease enter an integer! You have wasted your guess!");
				counter --;
			}		
		}
		if (trueFalse==false && counter == 0)
		{
			System.out.println("You lost!!");
			System.out.print("The pin was: "+crack.toString());
		}
	
//ten
			
	}
}