import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class GameWindow 
{
	private Board board;
	
	private JFrame window;
	
	public GameWindow()
	{
		window = new JFrame ("Tetris");
		window.setSize(306,629);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		
	
		board = new Board();
		window.add(board);
		

		
		window.addKeyListener(board);
		
		window.setVisible(true);
	}
	
	public static int getWidth()
	{
		return 306;
	}
	
	public static int getHeight()
	{
		return 629;
	}
	public static void main(String[] args)
	{
		new GameWindow();
	}
}
