import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Ball  extends JComponent
{

	private Ellipse2D.Double circle = new Ellipse2D.Double(0,0,15,15);
	
	private int dx;
	private int dy;
	
	public Ball (int x, int y)
	{
		this.setSize(new Dimension(16,16));
		this.setLocation(x,y);
	}
	
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLUE);
		g2.fill(circle);
		
		g2.setColor(Color.RED);
		g2.draw(circle);
		
		dx = 5;
		dy = 0;
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
		this.setLocation(getX()+dx,getY()+dy);
	}

}
