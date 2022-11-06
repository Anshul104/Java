
public class Test 
{

	public static void main(String[] args) 
	{
//		int[] valueArr = {2,3,4,5,6,7,8,9,10,11,12,13,14};
//		String[] rankArr =  {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
//		char[] suitArr = {'H','S','C','D'};
//		
//		Card[] deck = new Card[52];
//		for (int i = 0; i<suitArr.length; i++)
//		{
//			for (int j =0; j<rankArr.length;j++)
//			{
//				int e = 0;
//				if (i == 1)
//					e = 13;
//				else if (i==2)
//					e = 26;
//				else if (i==3)
//					e = 39;
//				deck[j+e]= new Card(suitArr[i],rankArr[j],valueArr[j]);
//			}
//		}
//		
//		System.out.print(deck[12]);
//		System.out.println("value is: "+deck[12].getValue());
//		System.out.println("suit is: "+deck[12].getSuit());
//		System.out.println("rank is: "+deck[12].getRank());
//		

////		
//		PokerHand name = new PokerHand(new Card('H',"3",3), new Card('H',"4",4),new Card('H',"4",4),new Card('H',"4",4),new Card('D',"5",5));

		PokerHand name = new PokerHand();
//		int[] one = {2,4};
//		System.out.println(name);
//		Card[] two = {new Card('S',"4",4),new Card('D',"A",14)};
//		name.discard(one,two);
		System.out.println(name);
		System.out.print(name.getBestHand());
//		Deck deck = new Deck();
//		System.out.println(deck);
//		deck.shuffle();
//		System.out.println(deck);
//		for( int i =0; i<53;i++)
//		{
//			System.out.print((deck.deal()).toString()+", ");
//		}
	}

}
