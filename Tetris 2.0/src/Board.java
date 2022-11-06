
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;


public class Board extends JPanel implements KeyListener {
	private BufferedImage blocks;
	private int blockSize = 30;
	private int boardWidth = 10;
	private int boardHeight = 20;
	private int[][] board = new int[boardHeight][boardWidth];
	private Shape[] shapes = new Shape[7];
	private Shape currentShape;
	private Timer t1;
	private boolean gameOver = false;
	private int score;
	private int totalLinesCleared;
	
	private int highscore;
	


	public Board() {

		try 
		{
			blocks = ImageIO.read(Board.class.getResource("/tiles.png"));
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try 
		{

		 File myObj = new File("Highscore.txt");
	      Scanner myReader = new Scanner(myObj);
	      ArrayList<String> fileInfo = new ArrayList<String>(); 

	      ArrayList<String> fileTagName = new ArrayList<String>();
	      if (myReader.hasNextLine())
	      {
	        String high = myReader.nextLine();
	        
	        highscore= Integer.parseInt(high);
	        myReader.close();
	      }
		}
		catch (FileNotFoundException e)
		{
		}
		

		
		shapes[0] = new Shape(blocks.getSubimage(0, 0, blockSize, blockSize),
				new int[][] { { 1, 1, 1, 1 } }, this,1); // I shape

		shapes[1] = new Shape(blocks.getSubimage(blockSize, 0, blockSize,
				blockSize), new int[][] { { 1, 1, 0 }, { 0, 1, 1 } }, this,2); // Z
																				// shape

		shapes[2] = new Shape(blocks.getSubimage(blockSize * 2, 0, blockSize,
				blockSize), new int[][] { { 0, 1, 1 }, { 1, 1, 0 } }, this,3); // S-
																				// shape

		shapes[3] = new Shape(blocks.getSubimage(blockSize * 3, 0, blockSize,
				blockSize), new int[][] { { 1, 1, 1 }, { 0, 0, 1 } }, this,4); // J-
																				// shape

		shapes[4] = new Shape(blocks.getSubimage(blockSize * 4, 0, blockSize,
				blockSize), new int[][] { { 1, 1, 1 }, { 1, 0, 0 } }, this,5); // L-
																				// shape

		shapes[5] = new Shape(blocks.getSubimage(blockSize * 5, 0, blockSize,
				blockSize), new int[][] { { 1, 1, 1 }, { 0, 1, 0 } }, this,6); // T-
																				// shape

		shapes[6] = new Shape(blocks.getSubimage(blockSize * 6, 0, blockSize,
				blockSize), new int[][] { { 1, 1 }, { 1, 1 } }, this,7); // 0-
																		// shape

		setNextShape();
		score = getCurrentShape().getScore();
		totalLinesCleared = getCurrentShape().getLinesCleared();
		
		t1 = new Timer((1000 / 60), new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
				
				update();
				repaint();
				
			}

		});
		t1.start();

	}

	public void update() 
	{
		currentShape.update();
		if(gameOver)
		{
			repaint();
			t1.stop();
		
			
			
			
			score = getCurrentShape().getScore();
			
			if(score > highscore)
				highscore = score;
			PrintWriter writer = null;
			
			try
			{
				writer = new PrintWriter("Highscore.txt");
			}
			catch (FileNotFoundException e)
			{
				try
				{
					File file1 = new File("Highscore.txt");

					file1.createNewFile();
					writer = new PrintWriter("Highscore.txt");
				}
				catch (IOException d)
				{

				}
			
			}

			writer.println(highscore);
				
			
			writer.close();
			
			totalLinesCleared = getCurrentShape().getLinesCleared();
			JOptionPane.showMessageDialog(this, "GAME OVER!\n" + "FINAL SCORE " + score + "\n"
					+ "TOTAL LINES CLEARED: " + totalLinesCleared + "\n" + "HIGHSCORE: "+ highscore);
			
			System.exit(0);
	  
			
			
		}

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		currentShape.draw(g);
		
		g.setColor(Color.MAGENTA);
		g.setFont(new Font("SansSerif", Font.ITALIC, 22));
		score = getCurrentShape().getScore();
		totalLinesCleared = getCurrentShape().getLinesCleared();
		g.drawString("SCORE", GameWindow.getWidth()-300, GameWindow.getHeight()-600);
		g.drawString(score +"", GameWindow.getWidth() -300, GameWindow.getHeight() - 570);
		g.drawString("Lines Cleared", GameWindow.getWidth() - 150, GameWindow.getHeight() -600);
		g.drawString(totalLinesCleared +"", GameWindow.getWidth() - 150, GameWindow.getHeight() - 570);
		
		
		g.setColor(Color.BLACK);
		
		for(int i = 0; i <board.length; i++)
		{
			for(int j = 0 ; j < board[i].length; j++)
			{
				if(board[i][j] != 0)
				{
					g.drawImage(blocks.getSubimage(((board[i][j]-1) *blockSize),0,blockSize,blockSize), j*blockSize,
						i* blockSize, null);
				}
			}
				
		}
		
		
		for (int i = 0; i < boardHeight; i++) {
			g.drawLine(0, i * blockSize, boardWidth * blockSize, i * blockSize);
		} //draws horizontal lines

		for (int j = 0; j < boardWidth; j++) {
			g.drawLine(j * blockSize, 0, j * blockSize, boardHeight * blockSize);
		} //draws vertical lines
		
		
	}
	
	public void setNextShape()
	{
		int index = (int)(Math.random()*shapes.length);
		
		Shape newShape = new Shape(shapes[index].getBlock(),shapes[index].getCoords(),this,
				shapes[index].getColor());
		currentShape = newShape;
		
		for(int i = 0; i <currentShape.getCoords().length; i++)
		{
			for(int j = 0 ; j < currentShape.getCoords()[i].length; j++)
			{
				if(currentShape.getCoords()[i][j] != 0)
				{
					if (board[i][j + 3] != 0)
					{
						gameOver = true;
					}
				}
			}
		}
	}

	public int getBlockSize() {
		return blockSize;
	}
	
	
	public int[][] getBoard() {
		return board;
	}

	public Shape getCurrentShape() {
		return currentShape;
	}
	
	@Override
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			currentShape.setDx(-1);
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			currentShape.setDx(1);
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			currentShape.speedD();
		}
		if(e.getKeyCode() == KeyEvent.VK_UP)
		{
			currentShape.rotate();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			currentShape.normalSpeed();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}