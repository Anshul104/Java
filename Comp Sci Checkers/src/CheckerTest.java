
public class CheckerTest 
{

	public static void main(String[] args)
	{
		CompSciCheckerBoard gameboard = new CompSciCheckerBoard();
		
		CompSciChecker[][] board = null;
		try
		{
			board = gameboard.getBoard();
		}
		catch(Exception e)
		{
			System.out.print("getBoard() ERROR");
			System.exit(1);
		}
		
		System.out.println(gameboard);
//		
//		boolean boardSetup = true;
//		for(int i = 0; i<3; i++)
//		{
//			for(int j = 0; j<8; j++)
//			{
//				if(i%2 == j%2 && board[i][j] == null)
//				{
//					boardSetup = false;	
//				}
//				else if(i%2 != j%2 && board[i][j] != null)
//				{
//					boardSetup = false;	
//				}
//				else if(i%2 == j%2 && i<3 && !board[i][j].getColor().equals("W"))
//				{
//					boardSetup = false;
//				}
//				else if(i%2 == j%2 && i>4 && !board[i][j].getColor().equals("B"))
//				{
//					boardSetup = false;
//				}
//				else if(i%2 == j%2)
//				{
//					if(board[i][j].getX() != j || board[i][j].getY() != i)
//						boardSetup = false;
//				}
//			}
//		}
//		
//		if(!boardSetup)
//		{
//			System.out.println("CONSTRUCTOR FAIL");
//			System.exit(1);
//		}
//		else
//			System.out.println("CONSTRUCTOR PASS");
//		
//		
//		CompSciChecker piece = gameboard.getPiece(2, 2);
//		
//		boolean validMove = true;
//		
//		if(!gameboard.isValidMove(piece, 2, 1))
//		{	
//			System.out.println("1");
//			validMove = false;
//		}
//		if(gameboard.isValidMove(piece, 2, 2))
//		{
//			System.out.println("2");
//			validMove = false;
//		}
//		if(gameboard.isValidMove(piece, 2, 0))
//		{	
//			System.out.println("3");
//			validMove = false;
//		}
//		if(gameboard.isValidMove(piece, 4, 1))
//		{	
//			System.out.println("4");
//			validMove = false;
//		}
//		if(gameboard.isValidMove(piece, 0, 1))
//		{
//			System.out.println("5");
//			validMove = false;
//		}
//		if(gameboard.isValidMove(piece, 1, 1))
//		{
//			System.out.println("6");
//			validMove = false;
//		}
//		if(gameboard.isValidMove(piece, 3, 1))
//		{
//			System.out.println("7");
//			validMove = false;
//		}
//		if(!gameboard.isValidMove(piece, 3, 2))
//		{
//			System.out.println("8");
//			validMove = false;
//		}
//		if(gameboard.isValidMove(piece, 4, 0))
//		{
//			System.out.println("9");
//			validMove = false;
//		}
//		CompSciChecker testPiece = new CompSciChecker("W",3,4);
//		
//		if(!gameboard.isValidMove(testPiece, 3, 6))
//		{
//			System.out.println("10");
//			validMove = false;
//		}
//		testPiece.setX(0);
//		if(gameboard.isValidMove(testPiece, -1, 6))
//		{
//			System.out.println("11");
//			validMove = false;
//		}
//		testPiece.setX(7);
//		if(gameboard.isValidMove(testPiece,8,6))
//		{
//			System.out.println("12");
//			validMove = false;
//		}
//		testPiece.setX(2);
//		testPiece.setY(7);
//		if(!gameboard.isValidMove(testPiece, 4, 7))
//		{
//			System.out.println("13");
//			validMove = false;
//		}
//		if(!gameboard.isValidMove(testPiece, 0, 7))
//		{
//			System.out.println("14");
//			validMove = false;
//		}
//		testPiece.setX(4);
//		testPiece.setY(1);
//		if(gameboard.isValidMove(testPiece, 2, 1))
//		{
//			System.out.println("15");
//			validMove = false;
//		}
//		if(gameboard.isValidMove(testPiece, 4, 3))
//		{
//			System.out.println("16");
//			validMove = false;
//		}
//		
//		if(!validMove)
//		{
//			System.out.println("VALIDMOVE FAIL");
//			System.exit(1);
//		}
//		else
//		{
//			System.out.println("VALIDMOVE PASS");
//		}
//		
//		
//		testPiece.setX(4);
//		testPiece.setY(7);
//
//		
//		boolean move = true;
//
//		
//		gameboard.makeMove(testPiece, 4, 5);
//		if(testPiece.getX()!=4 || testPiece.getY() != 5)
//		{
//			System.out.println("false20");
//			move = false;
//		}
//		if(board[7][4]!=null)
//		{	
//			System.out.println("false21");
//			move = false;
//		}
//		if(board[6][4] != null)
//		{
//			System.out.println("false22");
//			move = false;
//		}
	//	System.out.print(gameboard);
	//	gameboard.makeMove(testPiece, 5, 5);
//		if(testPiece.getX()==5)
//		{
//			System.out.println("false23");
//			move = false;
//		}
//		testPiece.setX(2);
//		testPiece.setY(5);
//		gameboard.makeMove(testPiece, 4, 7);
//		if(testPiece.getX()==4)
//		{
//			System.out.println("false24");
//			move = false;
//		}
//		if(testPiece.getY() == 7)
//		{		
//			System.out.println("false25");
//			move = false;
//		}
//		
//		if(!move)
//			System.out.println("MAKEMOVE FAIL");
//		else
//			System.out.println("MAKEMOVE PASS");
//		System.out.println(gameboard);
//		System.out.println(board[5][4]);
		
		
//		CompSciChecker piece = gameboard.getPiece(2, 2);
//		gameboard.makeMove(piece, 2, 3);
//		System.out.print(gameboard);
//		
//		CompSciChecker piece1 = gameboard.getPiece(3, 5);
//		gameboard.makeMove(piece1, 3, 4);
//		System.out.print(gameboard);
//		
//
//		gameboard.makeMove(piece, 4, 5);
//		System.out.print(gameboard);
//		
//		CompSciChecker piece2 = gameboard.getPiece(5, 5);
//		System.out.println(gameboard.isValidMove(piece2,3, 5));
//		gameboard.makeMove(piece2, 3, 5);
//		System.out.print(gameboard);
//		
//		CompSciChecker piece3 = gameboard.getPiece(2, 0);
//		gameboard.makeMove(piece3, -1, 2);
//		System.out.print(gameboard);
//		
//		gameboard.makeMove(piece3, 2, 1);
//		System.out.print(gameboard);
		
		CompSciChecker piece1 = gameboard.getPiece(4, 2);
		gameboard.makeMove(piece1, 4, 3);
		System.out.print(gameboard);
		
		CompSciChecker piece2 = gameboard.getPiece(1, 5);
		gameboard.makeMove(piece2, 1, 4);
		System.out.print(gameboard);
		
		CompSciChecker piece3 = gameboard.getPiece(1,1);
		gameboard.makeMove(piece3, 1, 2);
		System.out.print(gameboard);
		
		CompSciChecker piece4 = gameboard.getPiece(4,6);
		gameboard.makeMove(piece4, 4,5);
		System.out.print(gameboard);
		
		CompSciChecker piece5 = gameboard.getPiece(2,0);
		gameboard.makeMove(piece5, 2,1);
		System.out.print(gameboard);
		
		CompSciChecker piece6 = gameboard.getPiece(5,7);
		gameboard.makeMove(piece6, 4,6);
		System.out.print(gameboard);
		
		CompSciChecker piece7 = gameboard.getPiece(1,2);
		gameboard.makeMove(piece7, 1,3);
		System.out.print(gameboard);
		
		CompSciChecker piece8 = gameboard.getPiece(2,6);
		gameboard.makeMove(piece8, 2,5);
		System.out.print(gameboard);
		
		CompSciChecker piece9 = gameboard.getPiece(6,2);
		gameboard.makeMove(piece9, 5,2);
		System.out.print(gameboard);
		
		CompSciChecker piece10 = gameboard.getPiece(4,5);
		gameboard.makeMove(piece10, 4,4);
		System.out.print(gameboard);
		
		CompSciChecker piece11 = gameboard.getPiece(3,1);
		gameboard.makeMove(piece11,3 ,2);
		System.out.print(gameboard);
		
		CompSciChecker piece12 = gameboard.getPiece(3,5);
		gameboard.makeMove(piece12,3 ,4);
		System.out.print(gameboard);
		
		CompSciChecker piece13 = gameboard.getPiece(0,0);
		gameboard.makeMove(piece13,1,1);
		System.out.print(gameboard);
		
		CompSciChecker piece14 = gameboard.getPiece(4,4);
		gameboard.makeMove(piece14,4,2);
		System.out.print(gameboard);
		
		CompSciChecker piece15 = gameboard.getPiece(5,1);
		//System.out.print(gameboard.isValidMove(piece15, 3,3));
		gameboard.makeMove(piece15,3,3);
		System.out.print(gameboard);
		
		CompSciChecker piece16 = gameboard.getPiece(1,4);
		gameboard.makeMove(piece16,1,2);
		System.out.print(gameboard);
		
		CompSciChecker piece17 = gameboard.getPiece(1,1);
		gameboard.makeMove(piece17,1,3);
		System.out.print(gameboard);
		
		CompSciChecker piece18 = gameboard.getPiece(7,5);
		gameboard.makeMove(piece18,6,4);
		System.out.print(gameboard);
		
		CompSciChecker piece19 = gameboard.getPiece(6,0);
		gameboard.makeMove(piece19,6,1);
		System.out.print(gameboard);
		
		CompSciChecker piece20 = gameboard.getPiece(0,6);
		gameboard.makeMove(piece20,1,5);
		System.out.print(gameboard);
		
		CompSciChecker piece21 = gameboard.getPiece(2,2);
		gameboard.makeMove(piece21,2,3);
		System.out.print(gameboard);
		
		CompSciChecker piece22 = gameboard.getPiece(5,5);
		gameboard.makeMove(piece22,4,5);
		System.out.print(gameboard);
		
		CompSciChecker piece23 = gameboard.getPiece(3,3);
		gameboard.makeMove(piece23,3,5);
		System.out.print(gameboard);
		
		CompSciChecker piece24 = gameboard.getPiece(4,6);
		gameboard.makeMove(piece24,2,4);
		System.out.print(gameboard);
		
		CompSciChecker piece25 = gameboard.getPiece(1,3);
		gameboard.makeMove(piece25,3,5);
		System.out.print(gameboard);
		
		CompSciChecker piece26 = gameboard.getPiece(6,6);
		gameboard.makeMove(piece26,5,6);
		System.out.print(gameboard);
		
		CompSciChecker piece27 = gameboard.getPiece(6,1);
		gameboard.makeMove(piece27,6,2);
		System.out.print(gameboard);
		
		CompSciChecker piece28 = gameboard.getPiece(5,6);
		gameboard.makeMove(piece28,4,6);
		System.out.print(gameboard);
		
		CompSciChecker piece29 = gameboard.getPiece(3,5);
		gameboard.makeMove(piece29,5,7);
		System.out.print(gameboard);
		
		CompSciChecker piece30 = gameboard.getPiece(2,5);
		gameboard.makeMove(piece30,2,4);
		System.out.print(gameboard);
		
		CompSciChecker piece31 = gameboard.getPiece(6,2);
		gameboard.makeMove(piece31,6,3);
		System.out.print(gameboard);
		
		CompSciChecker piece32 = gameboard.getPiece(4,5);
		gameboard.makeMove(piece32,5,5);
		System.out.print(gameboard);
		
		CompSciChecker piece33 = gameboard.getPiece(4,0);
		gameboard.makeMove(piece33,4,1);
		System.out.print(gameboard);
		
		CompSciChecker piece34 = gameboard.getPiece(2,4);
		gameboard.makeMove(piece34,2,2);
		System.out.print(gameboard);
		
		CompSciChecker piece35 = gameboard.getPiece(3,2);
		gameboard.makeMove(piece35,1,2);
		System.out.print(gameboard);
		
		CompSciChecker piece36 = gameboard.getPiece(6,4);
		gameboard.makeMove(piece36,6,2);
		System.out.print(gameboard);
		
		CompSciChecker piece37 = gameboard.getPiece(7,1);
		gameboard.makeMove(piece37,5,3);
		System.out.print(gameboard);
		
		CompSciChecker piece38 = gameboard.getPiece(7,7);
		gameboard.makeMove(piece38,7,6);
		System.out.print(gameboard);
		
		CompSciChecker piece39 = gameboard.getPiece(4,1);
		gameboard.makeMove(piece39,4,2);
		System.out.print(gameboard);
		
		CompSciChecker piece40 = gameboard.getPiece(5,5);
		gameboard.makeMove(piece40,6,6);
		System.out.print(gameboard);
		
		CompSciChecker piece41 = gameboard.getPiece(5,7);
		gameboard.makeMove(piece41,7,5);
		System.out.print(gameboard);
		
		CompSciChecker piece42 = gameboard.getPiece(7,6);
		gameboard.makeMove(piece42,7,4);
		System.out.print(gameboard);
		
		CompSciChecker piece43 = gameboard.getPiece(5,2);
		gameboard.makeMove(piece43,6,3);
		System.out.print(gameboard);
		
		CompSciChecker piece44 = gameboard.getPiece(1,7);
		gameboard.makeMove(piece44,1,6);
		System.out.print(gameboard);
		
		CompSciChecker piece45 = gameboard.getPiece(4,2);
		gameboard.makeMove(piece45,5,2);
		System.out.print(gameboard);
		
		CompSciChecker piece46 = gameboard.getPiece(1,5);
		gameboard.makeMove(piece46,1,4);
		System.out.print(gameboard);
		
		CompSciChecker piece47 = gameboard.getPiece(2,1);
		gameboard.makeMove(piece47,1,1);
		System.out.print(gameboard);
		
		CompSciChecker piece48 = gameboard.getPiece(1,6);
		gameboard.makeMove(piece48,1,5);
		System.out.print(gameboard);
		
		CompSciChecker piece49 = gameboard.getPiece(5,2);
		gameboard.makeMove(piece49,6,2);
		System.out.print(gameboard);
		
		CompSciChecker piece50 = gameboard.getPiece(1,4);
		gameboard.makeMove(piece50,1,3);
		System.out.print(gameboard);
		
		CompSciChecker piece51 = gameboard.getPiece(5,3);
		gameboard.makeMove(piece51,5,4);
		System.out.print(gameboard);
		
		CompSciChecker piece52 = gameboard.getPiece(1,5);
		gameboard.makeMove(piece52,0,4);
		System.out.print(gameboard);
		
		CompSciChecker piece53 = gameboard.getPiece(0,2);
		gameboard.makeMove(piece53,2,4);
		System.out.print(gameboard);

		
		CompSciChecker piece54 = gameboard.getPiece(3,7);
		gameboard.makeMove(piece54,3,6);
		System.out.print(gameboard);
		
	}
	
}
		
	