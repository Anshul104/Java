import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class line extends JComponent
{
	private Rectangle2D.Double paddle = new Rectangle2D.Double(0,0,15,60);

	
	private Stroke dash;
	private int x1;
	private int y1;
	private int x2;
	private int y2;


	
	public line(int x1, int y1, int x2, int y2)
	{
		dash = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL,
                0, new float[]{9}, 0);
		
		this.x1=x1;
		this.y1=y1;
		this.x2=y2;
		this.y2=y2;
	}
	
	
	public void paintComponent(Graphics g)
	{

		  Graphics2D g2d = (Graphics2D) g.create();

		 
		  g2d.setStroke(dash);
		  g2d.setColor(Color.WHITE);
		  g2d.drawLine(x1,y1,x2,y2);
		  g2d.dispose();

	}
	
}
