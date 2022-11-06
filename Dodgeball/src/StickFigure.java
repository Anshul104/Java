import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;


public class StickFigure extends JComponent
{


		private Ellipse2D.Double head = new Ellipse2D.Double(15.5,0,20,20);
		private Rectangle2D.Double arm = new Rectangle2D.Double(0,20,50,15);
		private Rectangle2D.Double body = new Rectangle2D.Double(18,35,15,45);
		private Rectangle2D.Double leg_Left = new Rectangle2D.Double(9,75,12.5,45);
		private Rectangle2D.Double leg_Right = new Rectangle2D.Double(29,75,12.5,45);
		
		private int dx;
		private int dy;
		
		private String color;
		
		private Rectangle2D.Double border = new Rectangle2D.Double(0,0,50,120);
		
		
		public StickFigure(int x, int y, String colour)
		{
			this.setSize(new Dimension(50,120));
			this.setLocation(x,y);
			
			
			dx = 0;
			dy = 0;
			color = colour;
		}
		
		
		public void paintComponent(Graphics g)
		{
			if(color.equals("BLUE"))
			{
				Graphics2D g2 = (Graphics2D) g;
				g2.setColor(Color.BLUE);
				g2.fill(head);
				g2.fill(arm);
				g2.fill(leg_Left);
				g2.fill(leg_Right);
				g2.fill(body);
				g2.draw(border);
			}
			if(color.equals("RED"))
			{
				Graphics2D g2 = (Graphics2D) g;
				g2.setColor(Color.RED);
				g2.fill(head);
				g2.fill(arm);
				g2.fill(leg_Left);
				g2.fill(leg_Right);
				g2.fill(body);
				g2.draw(border);
			}

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
