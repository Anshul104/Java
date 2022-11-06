import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PongMain extends JFrame implements ActionListener
{
	private Paddle p1;
	private Paddle p2;
	private Ball ball;
	private Timer t1;
	private JLabel score1;
	private JLabel score2;
	
	
	private int p1Score;
	private int p2Score;
	public PongMain()
	{

		

		int p1Score = 0;
		int p2Score = 0;
		setLayout(null);
		setBounds(300,200,800,600);
		
		p1 = new Paddle (5,250);
		add(p1);
		
		p2 = new Paddle (765,250);
		add(p2);
		
		ball = new Ball(getWidth()/2,(int)(Math.random()*600));
		ball.setDx((int)(Math.random()*6 )+5);
		if( (int)(Math.random()*2)+1  == 1)
			ball.setDx(ball.getDx() * -1);
		
		
		ball.setDy((int)(Math.random()*6 )+5); 
		add(ball);
		
		if( (int)(Math.random()*2)+1  == 1)
			ball.setDy(ball.getDy() * -1);
		
		
		
		score1 = new JLabel(p1Score +"");
		add(score1);
		score1.setBounds(200,30, 100,100); 
		score1.setFont(new Font("Serif", Font.PLAIN, 100));
		
		score2 = new JLabel(p2Score +"");
		add(score2);
		score2.setBounds(500,30, 100,100); 
		score2.setFont(new Font("Serif", Font.PLAIN, 100));
		
		score1.setForeground(Color.WHITE);
		score2.setForeground(Color.WHITE);
		this.addKeyListener(new KeyListener() 
		{

			@Override
			public void keyTyped(KeyEvent e) 
			{
					
				
			}

			@Override
			public void keyPressed(KeyEvent e) 
			{
		
				if(e.getKeyCode() == e.VK_W)
					p1.setDy(-10);
				else if(e.getKeyCode() == e.VK_S)
					p1.setDy(10);
				
	
				if(e.getKeyCode() == e.VK_UP)
					p2.setDy(-10);
				else if(e.getKeyCode() == e.VK_DOWN)
					p2.setDy(10);
				
			}

			@Override
			public void keyReleased(KeyEvent e) 
			{
			
				if(e.getKeyCode() == e.VK_W)
					p1.setDy(0);
				if(e.getKeyCode() == e.VK_S)
					p1.setDy(0);
				

				
		
				if(e.getKeyCode() == e.VK_UP)
					p2.setDy(0);
				if(e.getKeyCode() == e.VK_DOWN)
					p2.setDy(0);

				
			}
	
		});
		t1 = new Timer(20,this);
		t1.start();
		

		setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setBackground( Color.BLACK );
		repaint();


	}
	
	
	public static void main(String[] args)
	{
		new PongMain();

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		p1.update();
		p2.update();
		

		
		if(p1.getY() < 0)
		{
			p1.setLocation(p1.getX(),p1.getY() + Math.abs(p1.getY()));
		}
		
		if(p1.getY() + p1.getHeight() > getHeight()-getInsets().top - getInsets().bottom)
		{
			p1.setLocation(p1.getX(),p1.getY() - ((p1.getY() + p1.getHeight()) - (getHeight()-getInsets().top - getInsets().bottom )));
		}


		
		
		
		
		if(p2.getY() < 0)
		{
			p2.setLocation(p2.getX(),p2.getY() + Math.abs(p2.getY()));
		}
		
		if(p2.getY() + p2.getHeight() > getHeight()-getInsets().top - getInsets().bottom)
		{
			p2.setLocation(p2.getX(),p2.getY() - ((p2.getY() + p2.getHeight()) - (getHeight()-getInsets().top - getInsets().bottom )));
		}
		
		
		
		ball.update();
		
		
		if(p1.getX() +  p1.getWidth() > ball.getX())
		{
			if(!(p1.getX() > ball.getX()+ball.getWidth()))
			{
				if((p1.getY()+ p1.getHeight()> ball.getY()))
				{
					if( (p1.getY()< ball.getY() +ball.getHeight()))
					{
						ball.setDx(ball.getDx() * -1);
						ball.setLocation(ball.getX() + ((p1.getX()+p1.getWidth())-ball.getX()),ball.getY() );
					}
				}
			}
		}

		
		if(p2.getX() < ball.getX()+ball.getWidth())
		{
			
			if(!(p2.getX() +p2.getWidth()  < ball.getX()))
			{
				if((p2.getY()+ p2.getHeight()> ball.getY()))
				{
					if( (p2.getY()< ball.getY() +ball.getHeight()))
					{
						ball.setDx(ball.getDx() * -1);
						ball.setLocation(ball.getX() -( (ball.getX()+ball.getWidth())- p2.getX()),ball.getY() );
		
					}
				}
			}

			
			
			
		}
		
		
		
		
		
		if(ball.getY() < 0)
		{
			ball.setLocation(ball.getX(),ball.getY() + Math.abs(ball.getY()));
			
			ball.setDy(ball.getDy() * -1);
		}
		
		if(ball.getY() + ball.getHeight() > getHeight()-getInsets().top - getInsets().bottom)
		{
			ball.setLocation(ball.getX(),ball.getY() - ((ball.getY() + ball.getHeight()) - (getHeight()-getInsets().top - getInsets().bottom )));
			ball.setDy(ball.getDy() * -1);
		}
		
		
		
		
		
		if(ball.getX()+ball.getWidth() > getWidth() - getInsets().left - getInsets().right)
		{
			p1Score++;
			ball.setLocation(getWidth()/2,(int)(Math.random()*600));
			ball.setDx((int)(Math.random()*10 )+5);
			if( (int)(Math.random()*2)+1  == 1)
				ball.setDx(ball.getDx() * -1);
			
			
			ball.setDy((int)(Math.random()*10 )+5);
			
			if( (int)(Math.random()*2)+1  == 1)
				ball.setDy(ball.getDy() * -1);
			
			p1.setLocation(10,250);
			p2.setLocation(760,250);
			
			score1.setText(p1Score +"");
			
			if(p1Score == 10)
				t1.stop();
		}
				
		if(ball.getX() < 0)
		{
			p2Score++;
			ball.setLocation(getWidth()/2,(int)(Math.random()*600));
			ball.setDx((int)(Math.random()*6 )+5);
			if( (int)(Math.random()*2)+1  == 1)
				ball.setDx(ball.getDx() * -1);
			
			
			ball.setDy((int)(Math.random()*6 )+5); 
			
			if( (int)(Math.random()*2)+1  == 1)
				ball.setDy(ball.getDy() * -1);
			
			p1.setLocation(10,250);
			p2.setLocation(760,250);
			
			
			score2.setText(p2Score +"");
			if(p2Score == 10)
				t1.stop();
		}
		
		repaint();
		
	}
	
	public void paint(Graphics g)
	{
	
	super.paint(g);
	
	
	  Graphics2D g2d = (Graphics2D) g.create();

	  Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL,
	                                  0, new float[]{9}, 0);
	  g2d.setStroke(dashed);
	  g2d.setColor(Color.WHITE);
	  g2d.drawLine((getWidth()- getInsets().left - getInsets().right)/2,0,
				((getWidth()- getInsets().left - getInsets().right)/2), (getWidth()-getInsets().left - getInsets().right));

	  
	  g2d.dispose();

	}
	
}
