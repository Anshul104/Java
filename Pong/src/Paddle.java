import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class Paddle extends JComponent
{
	
	private Rectangle2D.Double paddle = new Rectangle2D.Double(0,0,15,60);

	
	private int dx;
	private int dy;

	
	public Paddle(int x, int y)
	{
		this.setSize(new Dimension(15,60));
		this.setLocation(x,y);
		
		
		dx = 0;
		dy = 0;
	}
	
	
	public void paintComponent(Graphics g)
	{

			Graphics2D g2 = (Graphics2D) g;
			g2.setColor(Color.WHITE);
			g2.fill(paddle);

	}
	
	public void setDx(int x)
	{
		dx = x;
	}
	
	public void setDy(int y)
	{
		dy = y;
	}
	
	public void update()
	{
		setLocation(getX()+dx,getY()+dy);
	}

}
