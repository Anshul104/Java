/**
 * 	
 * @author Anshul104
 * Assignment CompSciCheckerBoard !
 */
/*
	 * A CompSciCheckerBoard represents a playing board for a 
	 * CompSciChecker game.  In this game a board is 8x8 and starts 
	 * with black and white CompSciChecker pieces.  The fields
	 * numWhitePieces and numBlackPieces track the appropriate 
	 * number of pieces for either side.  There are 12 white 
	 * pieces starting at the top left square and fill every other space
	 * on the board for the first three rows.  No two white pieces 
	 * should be directly adjacent to start.  The same is true of the
	 * 12 black pieces but they start at the bottom right and fill the
	 * bottom three rows.  the pieces may move one place in any
	 * direction, forwards, backwards, left, right or diagonal.  The
	 * pieces may "jump" an opposing player in any direction as well.
	 * 
	 */
public class CompSciCheckerBoard 
{
	
	private CompSciChecker[][] board;
	private int numWhitePieces;
	private int numBlackPieces;
	
	/*
	 * Create a Constructor for the CompSciCheckerBoard
	 * Once created the board should look like this:
	 * 
	 *  _ _ _ _ _ _ _ _
	 * |W   W   W   W  |
	 * |  W   W   W   W|
	 * |W   W   W   W  |
	 * |               |
	 * |               |
	 * |  B   B   B   B|
	 * |B   B   B   B  |
	 * |_ B _ B _ B _ B|
	 * 
	 * Empty Spaces have a value of null
	 * 
	 * 
	 */
	
	public CompSciCheckerBoard()
	{
		numWhitePieces = 12;
		numBlackPieces = 12;
		board = new CompSciChecker[8][8];
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j <board[0].length; j++)
			{
				if(i%2 == 0 && i <= 2)
				{
					if (j%2 == 0)
						board[i][j] = new CompSciChecker("W",j,i);
					else
						board[i][j] = null;
				}
				else if (i%2 != 0 && i <= 2)
				{
					if (j%2 != 0)
						board[i][j] = new CompSciChecker("W",j,i);
					else
						board[i][j] = null;
				}

				else if (i%2 != 0 && i >= 5)
				{
					if (j%2 != 0)
						board[i][j] = new CompSciChecker("B",j,i);
					else
						board[i][j] = null;
				}
				else if(i%2 == 0 && i >= 5)
				{
					if (j%2 == 0)
						board[i][j] = new CompSciChecker("B",j,i);
					else
						board[i][j] = null;
				}
				else
					board[i][j] = null;
			}
		}
	}
	
	
	
	/*
	 * Next you will write the method isValidMove which will
	 * take a CompSciChecker piece and a new x and y value
	 * and determine if the move to the new space is legal.
	 * 
	 * A CompSciChecker piece can move one space in any direction
	 * including diagonally, so long as the space is not occupied.
	 * 
	 * A CompSciChecker piece can move two spaces in any direction
	 * ONLY IF there is an opposing piece being "jumped" and the new
	 * space is not occupied.
	 * 
	 * write the method isValidMove.  return true if the desired move
	 * is valid and false if it is not.
	 */
	
	public boolean isValidMove(CompSciChecker piece, int newX, int newY)
	{	

		if(((newX>=0)&&(newX<=7))&&(newY>=0)&&(newY<=7))
		{
			if(board[newY][newX] != null)
				return false;
			//returns false if it is already occupied
			if (board[newY][newX] == null)
			{	
				if(!(((newY>piece.getY()+2) || (newY<piece.getY()-2))  &&  ((newX>piece.getX()+2) || (newX<piece.getX()-2))))
				{	
					if(piece.getY() <= 5)
					{
						if (piece.getX() == newX && piece.getY()+2 == newY)
						{
							if (board[piece.getY()+1][piece.getX()] != null)
							{
								if (piece.getColor().equals("W"))
								{
									if(board[piece.getY()+1][piece.getX()].getColor().equals("B"))
										
										return true;
								}
								else if (piece.getColor().equals("B"))
								{
									if(board[piece.getY()+1][piece.getX()].getColor().equals("W"))
										return true;
								}
								else
									return false;
							}
							else
								return false;
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
										return true;
								}

								else if (piece.getColor().equals("B"))
								{
									if(board[piece.getY()][piece.getX()+1].getColor().equals("W"))
										return true;
								}
								else
									return false;
							}
						}
					}
					
					if(piece.getY() >= 2)
					{
						if (piece.getX() == newX && piece.getY()-2 == newY)
						{
							if (board[piece.getY()-1][piece.getX()] != null)
							{
								if (piece.getColor().equals("W"))
								{
									if(((board[piece.getY()-1][piece.getX()]).getColor()).equals("B"))
										return true;
								}

								else if (piece.getColor().equals("B"))
								{
									if(((board[piece.getY()-1][piece.getX()]).getColor()).equals("W"))
										return true;
								}
								else
									return false;
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
										return true;
								}
								else if (piece.getColor().equals("B"))
								{
									if(board[piece.getY()][piece.getX()-1].getColor().equals("W"))
										return true;
								}
								else
									return false;
							}
						}
					}
					
					
					// Bottom right
					if(piece.getX() <=5 && piece.getY() <=5)
					{
						if (piece.getX()+2 == newX && piece.getY()+2 == newY)
						{
							if (board[piece.getY()+1][piece.getX()+1] != null)
							{
								if (piece.getColor().equals("W"))
								{
									if(board[piece.getY()+1][piece.getX()+1].getColor().equals("B"))
										return true;
								}

								else if (piece.getColor().equals("B"))
								{
									if(board[piece.getY()+1][piece.getX()+1].getColor().equals("W"))
										return true;
								}
								else
									return false;
							}
						}
					}
					
					//Bottom left
					if(piece.getX() >= 2 && piece.getY() <= 5)
					{
						if (piece.getX()-2 == newX && piece.getY()+2 == newY)
						{
							if (board[piece.getY()+1][piece.getX()-1] != null)
							{
								if (piece.getColor().equals("W"))
								{
									if(board[piece.getY()+1][piece.getX()-1].getColor().equals("B"))
										return true;
								}

								else if (piece.getColor().equals("B"))
								{
									if(board[piece.getY()+1][piece.getX()-1].getColor().equals("W"))
										return true;
								}
								else
									return false;
							}
						}
					}
					
					//Top left
					if(piece.getX() >=2 && piece.getY() >= 2)
					{
						if (piece.getX()-2 == newX && piece.getY()-2 == newY)
						{
							if (board[piece.getY()-1][piece.getX()-1] != null)
							{
								if (piece.getColor().equals("W"))
								{
									if(board[piece.getY()-1][piece.getX()-1].getColor().equals("B"))
										return true;
								}

								else if (piece.getColor().equals("B"))
								{
									if(board[piece.getY()-1][piece.getX()-1].getColor().equals("W"))
										return true;
								}
								else
									return false;
							}
						}
					}
					
					//Top right
					if(piece.getX() <=5 && piece.getY() >=2)
					{
						if (piece.getX()+2 == newX && piece.getY()-2 == newY)
						{
							if (board[piece.getY()-1][piece.getX()+1] != null)
							{
								if (piece.getColor().equals("W"))
								{
									if(board[piece.getY()-1][piece.getX()+1].getColor().equals("B"))
										return true;
								}

								else if (piece.getColor().equals("B"))
								{
									if(board[piece.getY()-1][piece.getX()+1].getColor().equals("W"))
										return true;
								}
								else
									return false;
							}
						}
					}
					
					//bordering space
					if(newX == piece.getX()+1)
					{
						if(newY == piece.getY()-1)
							return true;
						if(newY == piece.getY())
							return true;
						if(newY == piece.getY()+1)
							return true;
					}
					
					if(newY == piece.getY()-1)
					{
						if(newX == piece.getX()-1)
							return true;
						if(newX == piece.getX())
							return true;
					}
					
					if(newX == piece.getX()-1)
					{
						if(newY == piece.getY()+1)
							return true;
						if(newY == piece.getY())
							return true;
					}
					if(newY == piece.getY()+1)
					{
						if(newX == piece.getX())
							return true;
					}
				}
				return false;
				//returns if it not within a 3 by 3 space 
			}
		}
		return false;
		//returns false if it not not on the board
				
	}
	
	
	/*
	 * Finally you will write the method makeMove.  This method will
	 * take a CompSciChecker piece and a new x and y as arguments.  
	 * move the desired piece ONLY IF the move is valid.  If an opposing
	 * piece is "jumped" remove it from the board and update the
	 * appropriate field.
	 * 
	 */
	
	public void makeMove(CompSciChecker piece, int x, int y)
	{
		if(isValidMove(piece,x, y))
		{
			if (x== piece.getX()+2 && y == piece.getY())
			{
				if (piece.getColor().equals("W"))
				{
						numBlackPieces -= 1;
						board[piece.getY()+1][piece.getX()] = null;
						CompSciChecker tempPiece;
						tempPiece = piece;
						board[tempPiece.getY()][tempPiece.getX()] = null;
						piece.setX(x);
						piece.setY(y);
						board[y][x] = piece;
				}
				if (piece.getColor().equals("B"))
				{
						numWhitePieces -= 1;
						board[piece.getY()+1][piece.getX()] = null;
						CompSciChecker tempPiece;
						tempPiece = piece;
						board[tempPiece.getY()][tempPiece.getX()] = null;
						piece.setX(x);
						piece.setY(y);
						board[y][x] = piece;
				}
			}
			
			else if (x== piece.getX()+2 && y == piece.getY()+2)
			{
				if (piece.getColor().equals("W"))
				{
						numBlackPieces -= 1;
						board[piece.getY()+1][piece.getX()+1] = null;
						CompSciChecker tempPiece;
						tempPiece = piece;
						board[tempPiece.getY()][tempPiece.getX()] = null;
						piece.setX(x);
						piece.setY(y);
						board[y][x] = piece;
				}
				if (piece.getColor().equals("B"))
				{
						numWhitePieces -= 1;
						board[piece.getY()+1][piece.getX()+1] = null;
						CompSciChecker tempPiece;
						tempPiece = piece;
						board[tempPiece.getY()][tempPiece.getX()] = null;
						piece.setX(x);
						piece.setY(y);
						board[y][x] = piece;
				}
			}
			
			else if (x== piece.getX() && y == piece.getY()+2)
			{
				if (piece.getColor().equals("W"))
				{
						numBlackPieces -= 1;
						board[piece.getY()+1][piece.getX()] = null;
						CompSciChecker tempPiece;
						tempPiece = piece;
						board[tempPiece.getY()][tempPiece.getX()] = null;
						piece.setX(x);
						piece.setY(y);
						board[y][x] = piece;
				}
				if (piece.getColor().equals("B"))
				{
						numWhitePieces -= 1;
						board[piece.getY()+1][piece.getX()] = null;
						CompSciChecker tempPiece;
						tempPiece = piece;
						board[tempPiece.getY()][tempPiece.getX()] = null;
						piece.setX(x);
						piece.setY(y);
						board[y][x] = piece;
				}
			}
			
			else if (x== piece.getX()-2 && y == piece.getY()+2)
			{
				if (piece.getColor().equals("W"))
				{
						numBlackPieces -= 1;
						board[piece.getY()+1][piece.getX()-1] = null;
						CompSciChecker tempPiece;
						tempPiece = piece;
						board[tempPiece.getY()][tempPiece.getX()] = null;
						piece.setX(x);
						piece.setY(y);
						board[y][x] = piece;
				}
				if (piece.getColor().equals("B"))
				{
						numWhitePieces -= 1;
						board[piece.getY()+1][piece.getX()-1] = null;
						CompSciChecker tempPiece;
						tempPiece = piece;
						board[tempPiece.getY()][tempPiece.getX()] = null;
						piece.setX(x);
						piece.setY(y);
						board[y][x] = piece;
				}
			}
			
			else if (x== piece.getX()-2 && y == piece.getY())
			{
				if (piece.getColor().equals("W"))
				{
						numBlackPieces -= 1;
						board[piece.getY()][piece.getX()-1] = null;
						CompSciChecker tempPiece;
						tempPiece = piece;
						board[tempPiece.getY()][tempPiece.getX()] = null;
						piece.setX(x);
						piece.setY(y);
						board[y][x] = piece;
				}
				if (piece.getColor().equals("B"))
				{
						numWhitePieces -= 1;
						board[piece.getY()][piece.getX()-1] = null;
						CompSciChecker tempPiece;
						tempPiece = piece;
						board[tempPiece.getY()][tempPiece.getX()] = null;
						piece.setX(x);
						piece.setY(y);
						board[y][x] = piece;
				}
			}
			
			else if (x== piece.getX()-2 && y == piece.getY()-2)
			{
				if (piece.getColor().equals("W"))
				{
						numBlackPieces -= 1;
						board[piece.getY()-1][piece.getX()-1] = null;
						CompSciChecker tempPiece;
						tempPiece = piece;
						board[tempPiece.getY()][tempPiece.getX()] = null;
						piece.setX(x);
						piece.setY(y);
						board[y][x] = piece;
				}
				if (piece.getColor().equals("B"))
				{
						numWhitePieces -= 1;
						board[piece.getY()-1][piece.getX()-1] = null;
						CompSciChecker tempPiece;
						tempPiece = piece;
						board[tempPiece.getY()][tempPiece.getX()] = null;
						piece.setX(x);
						piece.setY(y);
						board[y][x] = piece;
				}
			}
			
			
			else if (x== piece.getX() && y == piece.getY()-2)
			{
				if (piece.getColor().equals("W"))
				{
						numBlackPieces -= 1;
						board[piece.getY()-1][piece.getX()] = null;
						CompSciChecker tempPiece;
						tempPiece = piece;
						board[tempPiece.getY()][tempPiece.getX()] = null;
						piece.setX(x);
						piece.setY(y);
						board[y][x] = piece;
				}
				if (piece.getColor().equals("B"))
				{
						numWhitePieces -= 1;
						board[piece.getY()-1][piece.getX()] = null;
						CompSciChecker tempPiece;
						tempPiece = piece;
						board[tempPiece.getY()][tempPiece.getX()] = null;
						piece.setX(x);
						piece.setY(y);
						board[y][x] = piece;
				}
			}
			
			
			else if (x== piece.getX()+2 && y == piece.getY()-2)
			{
				if (piece.getColor().equals("W"))
				{
						numBlackPieces -= 1;
						board[piece.getY()-1][piece.getX()+1] = null;
						CompSciChecker tempPiece;
						tempPiece = piece;
						board[tempPiece.getY()][tempPiece.getX()] = null;
						piece.setX(x);
						piece.setY(y);
						board[y][x] = piece;
				}
				if (piece.getColor().equals("B"))
				{
						numWhitePieces -= 1;
						board[piece.getY()-1][piece.getX()+1] = null;
						CompSciChecker tempPiece;
						tempPiece = piece;
						board[tempPiece.getY()][tempPiece.getX()] = null;
						piece.setX(x);
						piece.setY(y);
						board[y][x] = piece;
				}
			}
			
			else
			{
				CompSciChecker tempPiece;
				tempPiece = piece;
				board[tempPiece.getY()][tempPiece.getX()] = null;
				piece.setX(x);
				piece.setY(y);
				board[y][x] = piece;

			}
		}
		
	}
	
	
	


	
	/**
	 * 
	 * @param x x coordinate of board
	 * @param y y coordinate of board
	 * @return the piece at (x,y) or null if no piece
	 *         is located at (x,y)
	 */
	public CompSciChecker getPiece(int x, int y)
	{
		return board[y][x];
	}
	
	/**
	 * 
	 * @return the field board
	 */
	public CompSciChecker[][] getBoard()
	{
		return board;
	}
	
	
	/**
	 * returns a string representation of the board
	 */
	public String toString()
	{
		String str = "  _ _ _ _ _ _ _ _\n";
		for(int i = 0; i<board.length; i++)
		{
			str+= i + "|";
			for(int j = 0; j<board[i].length; j++)
			{
				if(board[i][j] != null)
					str+=board[i][j].getColor();
				else
				{
					if(i<board.length-1) str+=" ";
					else str+= "_";
				}
				if(j<board[i].length-1) str+= " ";
			}
			str+="|\n";
		}
		str+= "  0 1 2 3 4 5 6 7\n";
		return str;
	}
}
