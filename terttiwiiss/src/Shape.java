import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.TimerTask;
import java.util.Timer;

import javax.swing.JLabel;


public class Shape 
{
	private BufferedImage block;
	private int[][] coords;
	private Board board;
	private int dx = 0;
	private int x;
	private int y;
	private int normalSpeed = 600;
	private int speedD = 60;
	private int currentSpeed;
	private double time;
	private double lastTime;
	private boolean collision = false;
	private boolean moveX = false;
	private int color;
	private static int score = 0;
	private static int totalLinesCleared = 0;
	
	
	
	public Shape(BufferedImage block, int[][] coords, Board board, int color)
	{
		this.block = block;
		this.coords = coords;
		this.board = board;
		this.color = color;
		
		time = 0;
		lastTime  = System.currentTimeMillis();
		
		x = 3;
		y = 0;
		currentSpeed = normalSpeed;
		
		
	}
	
	public void update()
	{
		time += System.currentTimeMillis() - lastTime;
		lastTime  = System.currentTimeMillis();
		
		if(collision)
		{
			
			for(int i = 0; i <coords.length; i++)
			{
				for(int j = 0 ; j < coords[i].length; j++)
				{
					if(coords[i][j] != 0)
					{
						board.getBoard()[y+ i][x +j] = color;
					}
				}
			}
			checkLine();
			board.setNextShape();
		}
		
		if(!(x+dx +coords[0].length >10) && !(x +dx < 0))	
		{
			for(int i = 0; i <coords.length; i++)
			{
				for(int j = 0 ; j < coords[i].length; j++)
				{
					if(coords[i][j] != 0)
					{
						if(board.getBoard()[y+i][j +x +dx] != 0)
						{
							moveX = false;
						}
					}
				}
			}
			
			if(moveX)
			{	
				x+= dx;
			}
		}
		
		if(!(y+1 + coords.length > 20))
		{
			for(int i = 0; i <coords.length; i++)
			{
				for(int j = 0 ; j < coords[i].length; j++)
				{
					if(coords[i][j] != 0)
					{
						if(board.getBoard()[y+i +1][j +x] != 0)
						{
							collision = true;
						}
					}
				}
			}
			
			
			if(time > currentSpeed)
			{
				y++;
				time  = 0;
			}
		}
		else
		{
			collision = true;
		}
		dx = 0;
		moveX = true;
	}
	
	public void draw(Graphics g) //draws the shape
	{
		for(int i =0; i < coords.length; i++)
		{
			for(int j = 0; j < coords[i].length; j++)
			{
				if(coords[i][j] != 0)
				{
					g.drawImage(block, j*board.getBlockSize() +x*board.getBlockSize(), 
							i*board.getBlockSize() + y*board.getBlockSize(), null);
				}
			}
		}
	}
	
	private void checkLine()
	{
		int height = board.getBoard().length -1;
		int linesCleared = 0;
		for(int i = height; i> 0; i--)
		{	
			int count = 0;
			for(int j = 0; j < board.getBoard()[0].length; j++)
			{
				if(board.getBoard()[i][j] != 0)
				{
					count++;
				}
				
				board.getBoard()[height][j] = board.getBoard()[i][j];
			}
			if(count < board.getBoard()[0].length)
			{
				height--;
			}
			else
			{
				linesCleared++;
				totalLinesCleared++;
			}
		}
		if (linesCleared == 1)
		{
			score +=100;
		}
		else if (linesCleared == 2)
		{
			score +=300;
		}
		else if (linesCleared == 3)
		{
			score +=500;
		}
		else if (linesCleared == 4)
		{
			score +=800;
		}
		
	}
	
	public void rotate()
	{
		if (collision)
		{
			return;
		}
		int[][] rotatedArray = null;
		rotatedArray = getSwitchArr(coords);
		rotatedArray = getReverseArray(rotatedArray);
		if(x + rotatedArray[0].length > 10 || (y +rotatedArray.length > 20))
			return;
	
		coords = rotatedArray;
	}
	
	private int[][] getSwitchArr(int[][] arr) //switches the coords of the index
	{
		int[][] newArr = new int[arr[0].length][arr.length];
		
		for(int i = 0; i< arr.length; i++)
		{
			for(int j = 0; j< arr[0].length; j++)
			{
				newArr[j][i] = arr[i][j];
			}
		}
		
		
		return newArr;
	}
	
	private int[][] getReverseArray(int[][] arr)
	{
		int middle = arr.length/2;
		for(int i = 0;  i< middle; i++)
		{
			int[] m = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length - i - 1] = m;
		}
		
		
		return arr;
		
		
	}
	
	public void speedD()
	{
		currentSpeed = speedD;
	}
	public void normalSpeed()
	{
		currentSpeed = normalSpeed;
	}
	
	public void setDx(int dx)
	{
		this.dx = dx;
	}

	public BufferedImage getBlock() {
		return block;
	}

	public int[][] getCoords() {
		return coords;
	}
	
	public int getColor()
	{
		return color;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public int getLinesCleared()
	{
		return totalLinesCleared;
	}
	
	
}