/**
 * 
 * @author Anshul
 * Assignment: PokerHand
 *
 */
public class Deck 
{
	
	/*
	 * TODO create a Card array field which represents the cards
	 * in the deck.   Also create an int field called nextToDeal
	 * which will identify the next index to deal. This field will
	 * start at 0 and will be incremented each time a card is "dealt".
	 * when nextToDeal = the length of cards, there are no cards left
	 * to deal
	 * 
	 */
	private Card[] deck;
	private int nextToDeal;
	
	
	/*
	 * TODO create a deck constructor which requires no arguments.
	 * The constructor will generate a standard deck of playing
	 * cards. The values of the playing cards will be from 2-14 where
	 * a rank of "2" has a value of 2 and a rank of "A" has a value 
	 * of 14.
	 * 
	 * I suggest creating arrays for all possible values, ranks, and
	 * suits.   You can then use two nested for loops to create the deck
	 * 
	 */
	public Deck()
	{
		int[] valueArr = {2,3,4,5,6,7,8,9,10,11,12,13,14};
		String[] rankArr =  {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		char[] suitArr = {'H','S','C','D'};
		
		deck = new Card[52];
		for (int i = 0; i<suitArr.length; i++)
		{
			for (int j =0; j<rankArr.length;j++)
			{
				int e = 0;
				if (i == 1)
					e = 13;
				else if (i==2)
					e = 26;
				else if (i==3)
					e = 39;
				deck[j+e]= new Card(suitArr[i],rankArr[j],valueArr[j]);
			}
		}
	}
	
	
	/*
	 * TODO create a method called shuffle which will arrange all cards
	 * in the array cards in a random order and reset nextToDeal to zero.
	 * 
	 */
	public void shuffle()
	{
		nextToDeal = 0;
		for(int i = 0;i<deck.length;i++)
		{
			int index = (int)(Math.random()*52);
			
			Card temp = deck[i];
			deck[i] = deck[index];
			deck[index]= temp;
		}
	}
	
	/*
	 * TODO create a method called deal which takes no arguments. 
	 * it should return the card at nextToDeal and increment the field
	 * nextToDeal.  If there are no cards left to deal, return null.
	 */
	public Card deal()
	{
		if(nextToDeal<52)
		{
			nextToDeal++;
			return deck[nextToDeal-1];
		}
		return null;
	}
/**
	public String toString()
	{
		String str="";
		for(int i=0; i<deck.length;i++)
		{
			str += deck[i].toString() + ", ";
		}
		return str;
	}
**/
}
