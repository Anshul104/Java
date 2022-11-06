
public class testest 
{

	public static void main(String[] args)
	{
		CompSciCheckerBoard gameboard = new CompSciCheckerBoard();
		
		CompSciChecker[][] board = null;
	
			board = gameboard.getBoard();
		System.out.println(gameboard);
			CompSciChecker piece = new CompSciChecker("W",4,7);
			int newX=4;
			int newY=5;
			
			if(((newX>=0)&&(newX<=7))&&(newY>=0)&&(newY<=7))
			{
				if(board[newY][newX] != null)
					System.out.println("False1");
				//returns false if it is already occupied
				if (board[newY][newX] == null)
				{	
					if(!(((newY>piece.getY()+2) || (newY<piece.getY()-2))  &&  ((newX>piece.getX()+2) || (newX<piece.getX()-2))))
					{	
						System.out.println("hellobo");
						if(piece.getY() >=2)
						{
							if (piece.getX() == newX && piece.getY()+2 == newY)
							{
								System.out.println("helloboooo");
								if (board[piece.getY()+1][piece.getX()] != null)
								{
									if (piece.getColor().equals("W"))
									{
										if(board[piece.getY()+1][piece.getX()].getColor().equals("B"))
											
											System.out.println("True");
									}
									else
										System.out.println("False2");
									if (piece.getColor().equals("B"))
									{
										if(board[piece.getY()+1][piece.getX()].getColor().equals("W"))
											System.out.println("True");
									}
									else
										System.out.println("False3");
								}
								else
									System.out.println("False4");
							}
						}
						
						if(piece.getX() <=5)
						{
							if (piece.getX()+2 == newX && piece.getY() == newY)
							{
								if (board[piece.getY()][piece.getX()+1] != null)
								{
									if (piece.getColor().equals("W"))
									{
										if(board[piece.getY()][piece.getX()+1].getColor().equals("B"))
											System.out.println("True1");
									}
									else
										System.out.println("False5");
									if (piece.getColor().equals("B"))
									{
										if(board[piece.getY()][piece.getX()+1].getColor().equals("W"))
											System.out.println("True");
									}
									else
										System.out.println("False6");
								}
							}
						}
						
						if(piece.getY() <=5)
						{
							if (piece.getX() == newX && piece.getY()-2 == newY)
							{
								System.out.println("helloooobo");
								if (board[piece.getY()-1][piece.getX()] != null)
								{
									if (piece.getColor().equals("W"))
									{
										if(((board[piece.getY()-1][piece.getX()]).getColor()).equals("B"))
											System.out.println("True");
									}
									else
										System.out.println("False7");
									if (piece.getColor().equals("B"))
									{
										if(((board[piece.getY()-1][piece.getX()]).getColor()).equals("W"))
											System.out.println("True");
									}
									else
										System.out.println("False8");
								}
							}
						}
						
						if(piece.getX()>=2)
						{
							if (piece.getX()-2 == newX && piece.getY() == newY)
							{
								if (board[piece.getY()][piece.getX()-1] != null)
								{
									if (piece.getColor().equals("W"))
									{
										if(board[piece.getY()][piece.getX()-1].getColor().equals("B"))
											System.out.println("True");
									}
									else
										System.out.println("False9");
									if (piece.getColor().equals("B"))
									{
										if(board[piece.getY()][piece.getX()-1].getColor().equals("W"))
											System.out.println("True");
									}
									else
										System.out.println("False10");
								}
							}
						}
						
						
						// top right
						if(piece.getX() <=5 && piece.getY() >=2)
						{
							if (piece.getX()+2 == newX && piece.getY()+2 == newY)
							{
								if (board[piece.getY()+1][piece.getX()+1] != null)
								{
									if (piece.getColor().equals("W"))
									{
										if(board[piece.getY()+1][piece.getX()+1].getColor().equals("B"))
											System.out.println("True");
									}
									else
										System.out.println("False11");
									if (piece.getColor().equals("B"))
									{
										if(board[piece.getY()+1][piece.getX()+1].getColor().equals("W"))
											System.out.println("True");
									}
									else
										System.out.println("False");
								}
							}
						}
						
						//top left
						if(piece.getX() >= 2 && piece.getY() >=2)
						{
							if (piece.getX()-2 == newX && piece.getY()+2 == newY)
							{
								if (board[piece.getY()+1][piece.getX()-1] != null)
								{
									if (piece.getColor().equals("W"))
									{
										if(board[piece.getY()+1][piece.getX()-1].getColor().equals("B"))
											System.out.println("True");
									}
									else
										System.out.println("False12");
									if (piece.getColor().equals("B"))
									{
										if(board[piece.getY()+1][piece.getX()-1].getColor().equals("W"))
											System.out.println("True");
									}
									else
										System.out.println("False13");
								}
							}
						}
						
						//bottom left
						if(piece.getX() >=2 && piece.getY() <= 5)
						{
							if (piece.getX()-2 == newX && piece.getY()-2 == newY)
							{
								if (board[piece.getY()-1][piece.getX()-1] != null)
								{
									if (piece.getColor().equals("W"))
									{
										if(board[piece.getY()-1][piece.getX()-1].getColor().equals("B"))
											System.out.println("True");
									}
									else
										System.out.println("False14");
									if (piece.getColor().equals("B"))
									{
										if(board[piece.getY()-1][piece.getX()-1].getColor().equals("W"))
											System.out.println("True");
									}
									else
										System.out.println("False15");
								}
							}
						}
						
						//bottom right
						if(piece.getX() <=5 && piece.getY() <=5)
						{
							if (piece.getX()+2 == newX && piece.getY()-2 == newY)
							{
								if (board[piece.getY()-1][piece.getX()+1] != null)
								{
									if (piece.getColor().equals("W"))
									{
										if(board[piece.getY()-1][piece.getX()+1].getColor().equals("B"))
											System.out.println("True");
									}
									else
										System.out.println("False16");
									if (piece.getColor().equals("B"))
									{
										if(board[piece.getY()-1][piece.getX()+1].getColor().equals("W"))
											System.out.println("True");
									}
									else
										System.out.println("False17");
								}
							}
						}
						
						//bordering space
						if(newX == piece.getX()+1)
						{
							if(newY == piece.getY()-1)
								System.out.println("True");
							if(newY == piece.getY())
								System.out.println("True");
							if(newY == piece.getY()+1)
								System.out.println("True");
						}
						
						if(newY == piece.getY()-1)
						{
							if(newX == piece.getX()-1)
								System.out.println("True");
							if(newX == piece.getX())
								System.out.println("True");
						}
						
						if(newX == piece.getX()-1)
						{
							if(newY == piece.getY()+1)
								System.out.println("True");
							if(newY == piece.getY())
								System.out.println("True");
						}
						if(newY == piece.getY()+1)
						{
							if(newX == piece.getX())
								System.out.println("True");
						}
					}
					System.out.println("False18");
					//returns if it not within a 3 by 3 space 
				}
			}
			System.out.println("False19");
			//returns false if it not not on the board
			
	}

}
