import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;

public class borders extends JComponent
{
	private Rectangle2D.Double hor1 = new Rectangle2D.Double(0,70,300,5);
	private Rectangle2D.Double hor2 = new Rectangle2D.Double(0,170,300,5);
	private Rectangle2D.Double ver1 = new Rectangle2D.Double(90,0,5,300);
	private Rectangle2D.Double ver2 = new Rectangle2D.Double(190,0,5,300);
	
	public borders()
	{
		this.setSize(new Dimension(300,300));
		this.setLocation(0,0);
	}
	
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);
		g2.fill(hor1);
		g2.fill(hor2);
		g2.fill(ver1);
		g2.fill(ver2);
//		g2.fill(body);
//		g2.draw(border);

	}


}
