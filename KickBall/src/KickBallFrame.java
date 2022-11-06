/**
 *  Author: Anshul104
 *  Assignment: KickBall
 */
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class KickBallFrame extends JFrame
{
	public KickBallFrame()
	{
		
		setBounds(100,100,800,500);
		setLayout(null);
		
		StickFigure man = new StickFigure (15,15);
		add(man);
		
		Ball ball1 = new Ball(250,250);
		add(ball1);
		
		
		this.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode() == e.VK_W)
				{
					if (!( man.getY() <= 0))
					{	
						man.setLocation(man.getX(),man.getY()-10);
						if(man.getY() < 0)
						{
							man.setLocation(man.getX(),man.getY() + Math.abs(man.getY()));
						}
						
						
						
						if(isTouchingTop(man,ball1))
						{
							ball1.setLocation(ball1.getX(),ball1.getY()-10);
							man.setLocation(man.getX(),man.getY()-(man.getY() - ball1.getY() - ball1.getHeight()));
						}
					}
					
					
				}
				else if(e.getKeyCode() == e.VK_S)
				{

					if (!( man.getY()+man.getHeight() >= getHeight()-getInsets().top - getInsets().bottom))
					{
						man.setLocation(man.getX(),man.getY()+10);
						
						if(man.getY() + man.getHeight() > getHeight()-getInsets().top - getInsets().bottom)
						{
							man.setLocation(man.getX(),man.getY() - ((man.getY() + man.getHeight()) - (getHeight()-getInsets().top - getInsets().bottom )));
						}
						
						
						if(isTouchingBottom(man,ball1))
						{
							ball1.setLocation(ball1.getX(),ball1.getY() +  (man.getY() + man.getHeight()) - ball1.getY());
						}
					}
				}
				else if(e.getKeyCode() == e.VK_A)
				{
					
					if (!( man.getX() <= 0))
					{	
						man.setLocation(man.getX()-10,man.getY());


						if(isTouchingLeft(man,ball1))
						{
							ball1.setLocation(ball1.getX()    - ((ball1.getX() + ball1.getWidth()) - man.getX() ) ,ball1.getY());
	
						}
					}
				}
				
				
				
				else if(e.getKeyCode() == e.VK_D)
				{
		
					if (!( man.getX()+man.getWidth() >= getWidth() - getInsets().left - getInsets().right ))
					{	
						man.setLocation(man.getX()+10,man.getY());
						
						
						if(man.getX()+man.getWidth() > getWidth() - getInsets().left - getInsets().right)
							man.setLocation(man.getX() - ( (man.getX()+man.getWidth())- (getWidth() - getInsets().left - getInsets().right)),  man.getY());
						
						
						
						
						if(isTouchingRight(man,ball1))
						{
							ball1.setLocation(ball1.getX() + (man.getX()+man.getWidth())  -(ball1.getX()+ball1.getWidth()) + ball1.getWidth(),ball1.getY());					
						}					
					}					
				}				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) 
			{
				// TODO Auto-generated method stub}
			}
			@Override
			public void keyTyped(KeyEvent arg0) 
			{
				// TODO Auto-generated method stub
				
			}
		});
		
		
	
		
		
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		
	}

	public static void main(String[] args)
	{
		new KickBallFrame();
	}
	
	public boolean isTouchingTop(StickFigure man, Ball ball)
	{
		//top side of man
		if(man.getY() < ball.getY())
			return false;
		
		if(ball.getY()+ ball.getHeight() >= man.getY() &&  ball.getY() < man.getY())
		{
			if((ball.getX()+ ball.getWidth()> man.getX()))
			{
				if( (ball.getX()< man.getX() +man.getWidth()))
				{
					if(man.getY()- ball.getY()- ball.getHeight() != 0)
						return true;
				}
			}
		}
		
		return false;
	}
		
	public boolean isTouchingBottom(StickFigure man, Ball ball)
	{
		//Bottom side of man
		if(man.getY() > ball.getY())
			return false;
		
		if(ball.getY() <= man.getY()+man.getHeight() &&  ball.getY() > man.getY())
		{
			
			if((ball.getX()+ ball.getWidth()> man.getX()))
			{
				if( (ball.getX()< man.getX() +man.getWidth()))
				{
					if(ball.getY()- man.getY()- man.getHeight() != 0)
					{
						return true;
					}
				}
			}
		}
		return false;
	
	}
	
	public boolean isTouchingLeft(StickFigure man, Ball ball)
	{
		//left side of man
		if(man.getX() < ball.getX())
			return false;

		
		if(ball.getX() + ball.getWidth() >= man.getX() && ball.getX() < man.getX())
		{
			
			if((ball.getY()+ ball.getHeight()> man.getY()))
			{
				if( (ball.getY()< man.getY() +man.getHeight()))
				{
					
						return true;
					
				}
			}
		}
		return false;
	}
	
	
	public boolean isTouchingRight(StickFigure man, Ball ball)
	{
		//Right side of man
		if(man.getX() > ball.getX())
			return false;
	


		if(ball.getX() <= man.getX()+man.getWidth() && ball.getX() > man.getX())
		{
			
			if((ball.getY()+ ball.getHeight()> man.getY()))
			{
				if( (ball.getY()< man.getY() +man.getHeight()))
				{
					
						return true;
					
				}
			}
		}
		return false;
	}
	
	
	
	
	
	
}

