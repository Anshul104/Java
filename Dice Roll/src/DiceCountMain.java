
public class DiceCountMain
{

	public static void main(String[] args) 
	{
		Dice dice1 = new Dice();
		
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		
		String numberLine = "";
		int num = dice1.roll();
		numberLine =numberLine+ num;
		if (num==6)
			six++;
		else if (num == 5)
			five++;
		else if (num == 4)
			four++;
		else if (num == 3)
			three++;
		else if (num == 2)
			two++;
		else if (num == 1)
			one++;
		
		num = dice1.roll();
		numberLine =numberLine+" "+ num;
		if (num==6)
			six++;
		else if (num == 5)
			five++;
		else if (num == 4)
			four++;
		else if (num == 3)
			three++;
		else if (num == 2)
			two++;
		else if (num == 1)
			one++;
		
		num = dice1.roll();
		numberLine =numberLine+" "+ num;
		if (num==6)
			six++;
		else if (num == 5)
			five++;
		else if (num == 4)
			four++;
		else if (num == 3)
			three++;
		else if (num == 2)
			two++;
		else if (num == 1)
			one++;
		
		num = dice1.roll();
		numberLine =numberLine+" "+ num;
		if (num==6)
			six++;
		else if (num == 5)
			five++;
		else if (num == 4)
			four++;
		else if (num == 3)
			three++;
		else if (num == 2)
			two++;
		else if (num == 1)
			one++;
		
		num = dice1.roll();
		numberLine =numberLine+" "+ num;
		if (num==6)
			six++;
		else if (num == 5)
			five++;
		else if (num == 4)
			four++;
		else if (num == 3)
			three++;
		else if (num == 2)
			two++;
		else if (num == 1)
			one++;
		
		num = dice1.roll();
		numberLine =numberLine+" "+ num;
		if (num==6)
			six++;
		else if (num == 5)
			five++;
		else if (num == 4)
			four++;
		else if (num == 3)
			three++;
		else if (num == 2)
			two++;
		else if (num == 1)
			one++;
		
		num = dice1.roll();
		numberLine =numberLine+" "+ num;
		if (num==6)
			six++;
		else if (num == 5)
			five++;
		else if (num == 4)
			four++;
		else if (num == 3)
			three++;
		else if (num == 2)
			two++;
		else if (num == 1)
			one++;
		
		num = dice1.roll();
		numberLine =numberLine+" "+ num;
		if (num==6)
			six++;
		else if (num == 5)
			five++;
		else if (num == 4)
			four++;
		else if (num == 3)
			three++;
		else if (num == 2)
			two++;
		else if (num == 1)
			one++;
		
		num = dice1.roll();
		numberLine =numberLine+" "+ num;
		if (num==6)
			six++;
		else if (num == 5)
			five++;
		else if (num == 4)
			four++;
		else if (num == 3)
			three++;
		else if (num == 2)
			two++;
		else if (num == 1)
			one++;
		
		num = dice1.roll();
		numberLine =numberLine+" "+ num;
		if (num==6)
			six++;
		else if (num == 5)
			five++;
		else if (num == 4)
			four++;
		else if (num == 3)
			three++;
		else if (num == 2)
			two++;
		else if (num == 1)
			one++;
		
		System.out.println(numberLine);
		System.out.println("Ones: "+one);
		System.out.println("Twos: "+two);
		System.out.println("Threes: "+three);
		System.out.println("Fours: "+four);
		System.out.println("Fives: "+five);
		System.out.println("Sixs: "+six);
		
		

	}

}
