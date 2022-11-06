
/*Thoughts: Maybe have an array of coords of the blocks??
 * and use that to move the blocks downwards
 * 
 * Right now lets try and see how to move stuff in an array and just print it out. then we can move on to JFrame.
 * 
 * To Do list:
 * Fix isFalling and the code related to it
 * try and make a distance to the lowestY value? and use that to make the piece stack on other pieces
 * make bounds so the pieces dont go off screen
 * stacking issue with multiple pieces
 * 
 * mellis said : repaint the component not the entire board
 * Seperate arraylist for stationary blocks
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class tetrisMain extends JFrame implements ActionListener
{
	
	private int currentStep = 1;

	private int lowestY = 19;
	private int currentLowest = 19;
	
	private Timer  t1;
	
	private boolean isFalling = true;
	
	private boolean[][] board = new boolean[20][10];
	
	private ArrayList<Block> blockArr = new ArrayList<Block>();
	
	private Block currentPiece; //= new Block(0,4,0,5,1,4,1,5, "yellow"); //This is just for now
	
	
	
	
	public tetrisMain()
	{
		blockArr.add(new Block(0,4,0,5,1,4,1,5, "yellow")); //square (Square piece is extremely buggy, doesnt stop when it hits the last row)
		blockArr.add(new Block(0,5,1,3,1,4,1,5, "orange")); //L-block
		blockArr.add(new Block(0,4,1,3,1,4,1,5, "purple")); // T-block
		currentPiece = blockArr.get((int)(Math.random()*blockArr.size()));
		
		//add more later
		for (int i = 0; i < board.length;i++)
		{
			for(int j = 0; j <board[0].length; j++)
			{
				board[i][j] = false;
			}
		}
		
		for(int i = 0; i < currentPiece.getCords().length;i++)
		{
			board[currentPiece.getCords()[i][0]][currentPiece.getCords()[i][1]] = true;
		}
		

			
		//setLayout(null);
		//setBounds(300,200,600,800);
		
		//add(currentPiece);
		
			this.addKeyListener(new KeyListener() {
			//@Override
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode() == e.VK_UP)
				{
					// a rudimentary rotating system
					//essentially you break each rotation into steps and you gotta change the location
					// case one is normal
					//case 2 is where the left block of the tetrimino is shifted down
					if(currentPiece.getColor().equals("purple"))
					{
						currentStep++;
						switch(currentStep)
						{
							case 2:
				//				currentPiece.setCords()
								
						}
						
					}
					
				}
				
				else if(e.getKeyCode() == e.VK_DOWN)
				{
					
				}
				
				if(e.getKeyCode() == e.VK_RIGHT)
				{
					currentPiece.setDy(1);

				}
				
				if(e.getKeyCode() == e.VK_LEFT)
				{
					currentPiece.setDy(-1);

				}
			}
			
			//@Override
			public void keyReleased(KeyEvent e) 
			{
				if(e.getKeyCode() == e.VK_RIGHT)
				{
					currentPiece.setDy(0);
				}
				
				else if(e.getKeyCode() == e.VK_LEFT)
				{
					currentPiece.setDy(0);
				}
			}
			//@Override
			public void keyTyped(KeyEvent arg0) 
			{
				// TODO Auto-generated method stub
				
			}
		});
		
			t1 = new Timer(500,this);
			t1.start();	
			
			
		setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setResizable(false);
		
		
		

	}

//	@Override
	public void actionPerformed(ActionEvent e)
	{
		for (int i = 0; i < board.length;i++)
		{
			for(int j = 0; j <board[0].length; j++)
			{
				
				if(board[i][j])
					System.out.print("o");
				else
					System.out.print("-");

			}
			System.out.println();
		}//printing out the board
		System.out.println("\n\n");
		

		

		
		if(isFalling)
		{
			
			for(int[] coords : currentPiece.getCords())
			{

				if(coords[0] < 20 && coords[1] <10)
					board[coords[0]][coords[1]]= false;
				
			}//removing the piece
			
			currentPiece.update(); //getting new coords

			
			
			for(int[] coords : currentPiece.getCords())
			{
				if (findLowestY(coords[1],coords[0]) < lowestY)
					lowestY = findLowestY(coords[1],coords[0]);
				//coords[0] is the y value max 19
				//coords[1] is the value, max 9
				
				System.out.print("LowestY = " + lowestY);


				
				if(coords[0] < 20 && coords[1] <10)
					board[coords[0]][coords[1]]= true;
				
				if(coords[0] > lowestY-1)
				{

						
					isFalling = false;
					

				}
			} // making it show up in the new location
		}
		
		else
		{
			currentPiece = blockArr.get((int)(Math.random())*blockArr.size());
//			for(int i = 0; i < currentPiece.getCords().length;i++)
//			{
//				board[currentPiece.getCords()[i][0]][currentPiece.getCords()[i][1]] = true;// this line is faulty
//				//It runs for 2 times and then gets an error for some reason - must troubleshoot
//			}
//			
			isFalling = true;
			
			
		}
		
		

		
	}
	
	
	public static void main(String[] args)
	{
		new tetrisMain();
	}
	
	public int findLowestY(int col, int currentRow)
	{
		int lowest = 19;
		for (int r = currentRow+1; r<board.length;r++)
		{
			if(board[r][col])
			{
				lowest = r;				
				break;
			}
		}
		
		return lowest;
		
	}
	
}
