import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class MainFrame extends JFrame implements ActionListener
{
	
	
	private ArrayList<Ball> ballArrayPlayer1;
	private ArrayList<Ball> ballArrayPlayer2;
	
	private StickFigure player1;
	private StickFigure player2;
	
	private Timer t1;
	
	public MainFrame()
	{
		ballArrayPlayer1 = new ArrayList<Ball>();
		ballArrayPlayer2 = new ArrayList<Ball>();
		setLayout(null);
		setBounds(300,200,800,600);
		
		
		player1 = new StickFigure (100,200, "BLUE");
		add(player1);
		
		
		player2 = new StickFigure (600,200, "RED");
		add(player2);
		
		
		JOptionPane.showMessageDialog(this, "Player 1: W, A, S, D \n Shoot: E \n Player 2: UP, LEFT, DOWN, RIGHT \n Shoot: Right Ctrl");
		
		

		this.addKeyListener(new KeyListener() 
		{

			@Override
			public void keyTyped(KeyEvent e) 
			{
					
				
			}

			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(e.getKeyCode() == e.VK_A)
					player1.setDx(-10);
				else if(e.getKeyCode() == e.VK_D)
					player1.setDx(10);			
				else if(e.getKeyCode() == e.VK_W)
					player1.setDy(-10);
				else if(e.getKeyCode() == e.VK_S)
					player1.setDy(10);
				
				if(e.getKeyCode() == e.VK_LEFT)
					player2.setDx(-10);
				else if(e.getKeyCode() == e.VK_RIGHT)
					player2.setDx(10);			
				else if(e.getKeyCode() == e.VK_UP)
					player2.setDy(-10);
				else if(e.getKeyCode() == e.VK_DOWN)
					player2.setDy(10);
				
			}

			@Override
			public void keyReleased(KeyEvent e) 
			{
				if(e.getKeyCode() == e.VK_A)
					player1.setDx(0);
				if(e.getKeyCode() == e.VK_D)
					player1.setDx(0);			
				if(e.getKeyCode() == e.VK_W)
					player1.setDy(0);
				if(e.getKeyCode() == e.VK_S)
					player1.setDy(0);
				
				if(e.getKeyCode() == e.VK_E)
				{
					if(ballArrayPlayer1.size()< 3)
					{
						ballArrayPlayer1.add(new Ball(player1.getX() + player1.getWidth(), player1.getY() + 20, "BLUE"));
						add(ballArrayPlayer1.get(ballArrayPlayer1.size()-1));
					}
					
				}
				
				if(e.getKeyCode() == e.VK_LEFT)
					player2.setDx(0);
				if(e.getKeyCode() == e.VK_RIGHT)
					player2.setDx(0);			
				if(e.getKeyCode() == e.VK_UP)
					player2.setDy(0);
				if(e.getKeyCode() == e.VK_DOWN)
					player2.setDy(0);
				
				if(e.getKeyCode() == e.VK_CONTROL)
				{
					
					if(ballArrayPlayer2.size()< 3)
					{
						ballArrayPlayer2.add(new Ball(player2.getX(), player2.getY() + 20, "RED"));
						add(ballArrayPlayer2.get(ballArrayPlayer2.size()-1));
						ballArrayPlayer2.get(ballArrayPlayer2.size()-1).setDx(-10);
					}
				}
				
			}
	
		});
		
		
		t1 = new Timer(20,this);
		t1.start();
	
		
		setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	
	
	
	
	public static void main(String[] args) 
	{
		new MainFrame();

	}




	@Override
	public void actionPerformed(ActionEvent e) 
	{
		player1.update();
		player2.update();
		
		
		if(player1.getY() < 0)
		{
			player1.setLocation(player1.getX(),player1.getY() + Math.abs(player1.getY()));
		}
		
		if(player1.getY() + player1.getHeight() > getHeight()-getInsets().top - getInsets().bottom)
		{
			player1.setLocation(player1.getX(),player1.getY() - ((player1.getY() + player1.getHeight()) - (getHeight()-getInsets().top - getInsets().bottom )));
		}
		
		
		if(player1.getX() < 0)
		{
			player1.setLocation(player1.getX()+ Math.abs(player1.getX()),player1.getY() );
		}
		
		if(player1.getX()+player1.getWidth() > getWidth() - getInsets().left - getInsets().right)
			player1.setLocation(player1.getX() - ( (player1.getX()+player1.getWidth())- (getWidth() - getInsets().left - getInsets().right)),  player1.getY());
		
		
		
		
		
		if(player2.getY() < 0)
		{
			player2.setLocation(player2.getX(),player2.getY() + Math.abs(player2.getY()));
		}
		
		if(player2.getY() + player2.getHeight() > getHeight()-getInsets().top - getInsets().bottom)
		{
			player2.setLocation(player2.getX(),player2.getY() - ((player2.getY() + player2.getHeight()) - (getHeight()-getInsets().top - getInsets().bottom )));
		}
		
		if(player2.getX()+player2.getWidth() > getWidth() - getInsets().left - getInsets().right)
			player2.setLocation(player2.getX() - ( (player2.getX()+player2.getWidth())- (getWidth() - getInsets().left - getInsets().right)),  player2.getY());
				
		if(player2.getX() < 0)
		{
			player2.setLocation(player2.getX()+ Math.abs(player2.getX()),player2.getY() );
		}
		
		
		for(int i = 0; i<ballArrayPlayer1.size(); i ++)
		{
			(ballArrayPlayer1.get(i)).update();
			
			if(ballArrayPlayer1.get(i).getX() +  ballArrayPlayer1.get(i).getWidth() > player2.getX())
			{
				if(!(ballArrayPlayer1.get(i).getX() > player2.getX()+player2.getWidth()))
				{
					if((ballArrayPlayer1.get(i).getY()+ ballArrayPlayer1.get(i).getHeight()> player2.getY()))
					{
						if( (ballArrayPlayer1.get(i).getY()< player2.getY() +player2.getHeight()))
						{
							
							
							
							JOptionPane.showMessageDialog(this, "Player 1 wins!");
							t1.stop();
							
						}
					}
				}
				

			}
			
			if(ballArrayPlayer1.get(i).getX() > getWidth())
			{
				ballArrayPlayer1.get(i).setVisible(false);
				ballArrayPlayer1.remove(i);
				
			}
			
			
			
			
			
		}
		
		for(int i = 0; i<ballArrayPlayer2.size(); i ++)
		{
			(ballArrayPlayer2.get(i)).update();
			
			if(ballArrayPlayer2.get(i).getX() < player1.getX()+player1.getWidth())
			{
				
				if(!(ballArrayPlayer2.get(i).getX() +ballArrayPlayer2.get(i).getWidth()  < player1.getX()))
				{
					if((ballArrayPlayer2.get(i).getY()+ ballArrayPlayer2.get(i).getHeight()> player1.getY()))
					{
						if( (ballArrayPlayer2.get(i).getY()< player1.getY() +player1.getHeight()))
						{
							
							JOptionPane.showMessageDialog(this, "Player 2 wins!");
							
							t1.stop();
							
						}
					}
				}

				
				
				
			}
			
			if(ballArrayPlayer2.get(i).getX() + ballArrayPlayer2.get(i).getWidth() < 0)
			{
				ballArrayPlayer2.get(i).setVisible(false);
				ballArrayPlayer2.remove(i);
			}
			
		}


		
	
		
		
		repaint();
		
	}

}
