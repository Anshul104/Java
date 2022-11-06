import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ticTacMain extends JFrame
{

	//O FOR 2 AND 1 FOR X
	private int[] state = new int[9];

	private int[][] quad = {{1,2,3},{4,5,6},{7,8,9}};
	final private int AI = 2;
	final private int human = 1;
	private int current_player = human;
	
	boolean didnotWin = true;
	
	private JLabel label, win;
	
	private int[][] coords = {{17,-8},{113,-8},{215,-8},
								{17,84},{113,84},{212,84},
							  {17,180},{113,180},{215,180}};
	private int[][] stateGrid = {{0,0,0},{0,0,0},{0,0,0}};
	
	
	private int position;
	public ticTacMain() 
	{
		
		for(int i = 0; i<9; i ++)
		{
			state[i]=0;
		}
		
		int count = 0;
		for(int i = 0; i<3;i++)
		{
			for(int j = 0; j<3;j++)
			{
				state[count] = stateGrid[i][j];
				count++;
			}
		}
		
		
		
		setBounds(500,300,300,300);
		setLayout(null);

		
		borders hor1 = new borders();
		add(hor1);
		
		for(int i = 0; i<3;i++)
		{
			for(int j = 0; j<3;j++)
			{
				if(stateGrid[i][j] == 1 || stateGrid[i][j] == 2)
				{
					String letter = "";
					if(stateGrid[i][j] == 1)
						letter = "X";
					else
						letter = "O";
					label = new JLabel(letter);
					add(label);

					label.setBounds(coords[quad[i][j]-1][0],coords[quad[i][j]-1][1], 80,80); 
					label.setFont(new Font("Helvetica", Font.PLAIN, 80));
				}
			}
		}
		
		

		
		this.addMouseListener(new MouseListener() 
		{

			@Override
			public void mouseClicked(MouseEvent e) 
			{	
				position = quad[e.getY()/100][e.getX()/100];

				if (state[position-1] == 0 && didnotWin)
				{
					String letter = "X";

					state[position-1] = current_player;
					updateGrid();
					label = new JLabel(letter);
					add(label);

					label.setBounds(coords[position-1][0],coords[position-1][1], 80,80); 
					label.setFont(new Font("Helvetica", Font.PLAIN, 80));

					
					if(numberOfOpen(stateGrid) != 0)
					{
						
						int Ai_position = bestMove(stateGrid);
						state[Ai_position-1] = 2;
						updateGrid();
						label = new JLabel("O");
						add(label);
						label.setBounds(coords[Ai_position-1][0],coords[Ai_position-1][1], 80,80); 
						label.setFont(new Font("Helvetica", Font.PLAIN, 80));
					}

					if(checkRow(stateGrid) == 1 || checkRow(stateGrid) == 2)
					{
						int number =checkRow(stateGrid) ;
						String winner = "";
						if(number == 1)
							winner = "User";
						else if( number == 2)
							winner = "Ai";
						
						didnotWin = false;
						JOptionPane.showMessageDialog(null, winner+ " has won!");
					}
					
					if(checkCol(stateGrid) == 1 || checkCol(stateGrid) == 2)
					{
						int number =checkCol(stateGrid) ;
						String winner = "";
						if(number == 1)
							winner = "User";
						else if( number == 2)
							winner = "Ai";
						
						didnotWin = false;
						JOptionPane.showMessageDialog(null, winner+ " has won!");
					}
					
					if(checkDiag(stateGrid) == 1 || checkDiag(stateGrid) == 2)
					{
						
						int number =checkDiag(stateGrid) ;
						String winner = "";
						if(number == 1)
							winner = "User";
						else if( number == 2)
							winner = "Ai";
						
						didnotWin = false;
						JOptionPane.showMessageDialog(null, winner+ " has won!");
					}
					
				}
				
				

			
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}


		});
		
		setVisible(true);
		setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		new ticTacMain();
	}
	public void updateGrid()
	{
		for(int i = 0; i<state.length;i++)
		{
			stateGrid[i/3][i%3] = state[i];
		}
	}
	public int checkRow(int[][] state)
	{
 //   >////< blushies
			for(int i = 0; i<3;i++)
			{
				if(state[i][0] != 0)
				{
					if( (state[i][0] == state[i][1]) && (state[i][0] == state[i][2]))
						return state[i][0];
				}
			}
			return 0;
	}
	
	public int checkCol(int[][] state)
	{
 //   >////< blushies


			for(int i = 0; i<3;i++)
			{
				if(state[0][i] != 0)
				{
					if( (state[0][i] == state[1][i]) && (state[0][i] == state[2][i]))
						return state[0][i];
				}
			}
			return 0;
	}
	
	public int checkDiag(int [][] state)
	{
		if(state[0][0] != 0)
		{
			if((state[0][0] == state[1][1]) && (state[0][0] == state[2][2]))
				return state[0][0];	
		}
		
		if(state[0][2] != 0)
		{
			if((state[0][2] == state[1][1]) && (state[0][2] == state[2][0]))
				return state[0][2];
		}
	
		return 0;

	}
	

	public int numberOfOpen(int[][] array2D)
	{
		int count = 0;
		for(int i = 0; i<array2D.length;i++)
		{
			for(int j = 0; j<array2D[0].length;j++)
			{
				if(array2D[i][j] == 0)
					count++;
			}
		}
		return count;
	}

	private int miniMax(int[][]board, int depth, boolean max)
	{
		
		int score = winnerCheck(board);
		
		if(score == 10 || score == -10)
		{
			return score;
		}
		
		if(numberOfOpen(board)==0)
			return 0;
		
		if (depth == 5)
		{
			return 0;
		}
				
		if(max)
		{
			int bestValue = -1000;
			
			for(int k = 0; k<3;k++)
			{
				for(int q=0; q<3;q++)
				{
					boolean changing = false;
					if(board[k][q] == 0)
					{
						board[k][q] = 2;
						changing = true;
						bestValue = Math.max(bestValue, miniMax(board, depth+1, !max));
					}
					
					if(changing)
						board[k][q] = 0;

				}

			}
			
			return bestValue;
				
		}
		
		else
		{
			int bestValue = 1000;
			
			for(int k = 0; k<3;k++)
			{
				for(int q=0; q<3;q++)
				{
					boolean changing = false;
					if(board[k][q] == 0)
					{
						board[k][q] = 1;
						changing = true;
						bestValue = Math.min(bestValue, miniMax(board, depth+1, !max));
					}
					
			
					if(changing)
						board[k][q] = 0;

				}

			}
			
			return bestValue;
				
		}
		

	}

	private int bestMove(int[][] board)
	{
		int bestMove = -100;
		int bestMovePosition = -100;
		
		for(int k = 0; k<3;k++)
		{
			for(int q=0; q<3;q++)
			{
				
				boolean changing = false;
				if(board[k][q] == 0)
				{
					board[k][q] = 2;
					changing = true;
				}

				int value = miniMax(board,0,false);
				
				if(changing)
					board[k][q] = 0;
				
				if(value>bestMove)
				{
					bestMove= value;
					bestMovePosition = quad[k][q];
				}
			}

		}
		
		return bestMovePosition;
		
	}

	
	private int winnerCheck(int[][] tempState)
	{
		// checks the entire board for all the possible values and returns +10 if Ai wins and -10 is they lose
		// returns 0 if it is none
		
		if(checkRow(tempState) == 1)
		{
			return -10;
		}
		else if(checkRow(tempState) == 2)
		{
			return 10;
		}

		
		if(checkCol(tempState) == 1)
		{
			return -10;
		}
		else if(checkCol(tempState) == 2)
		{
			return 10;
		}
		
		if(checkDiag(tempState) == 1)
		{
			return -10;
		}
		else if(checkDiag(tempState) == 2)
		{
			return 10;
		}
		
		
		return 0;
	}	
}

