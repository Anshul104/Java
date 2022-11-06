import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;


public class cross extends JComponent
{



		private Rectangle2D.Double tester = new Rectangle2D.Double(20,20,20,5);
		private Shape rotatedRect;
		private double theta = Math.toRadians(45);

//		// create rect centred on the point we want to rotate it about
//		Rectangle2D rect = new Rectangle2D.Double(-width/2., -height/2., width, height);

		public cross(int x, int y)
		{
			this.setSize(new Dimension(100,100));
			this.setLocation(x,y);
			
			AffineTransform transform = new AffineTransform();
			transform.rotate(theta);
			transform.translate(x, y); 
			
			Shape rotatedRect = transform.createTransformedShape(tester);
		}
		
		
		public void paintComponent(Graphics g)
		{
			Graphics2D g2 = (Graphics2D) g;
			g2.setColor(Color.BLUE);
			g2.fill(tester);
			
			g2.draw(rotatedRect);

		}
	

}
