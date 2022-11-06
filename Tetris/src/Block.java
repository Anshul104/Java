import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class Block
{
	//private Rectangle2D.Double block1 = new Rectangle2D.Double(0,0,20,20);
	private int dx;
	private int dy;
	private String colour;
	
	private int cord1X;
	private int cord1Y;
	
	private int cord2X;
	private int cord2Y;
	
	private int cord3X;
	private int cord3Y;
	
	private int cord4X;
	private int cord4Y;


	
//The cords are just the indexes of the board
	public Block(int cord1X,int cord1Y,int cord2X,int cord2Y, int cord3X,int cord3Y,
			int cord4X,int cord4Y, String color) 
	{
		
		dx = 1; //This moves the piece down by one space
		dy = 0; // Positive move it to the right
		colour = color;
	
		this.cord1X =cord1X;
		this.cord1Y =cord1Y;
	
		this.cord2X =cord2X;
		this.cord2Y =cord2Y;
		
		this.cord3X =cord3X;
		this.cord3Y =cord3Y;
		
		this.cord4X =cord4X;
		this.cord4Y =cord4Y;

	}


	public int[][] getCords()
	{
		int[][] cords = {{cord1X,cord1Y}, {cord2X,cord2Y}, {cord3X,cord3Y}, {cord4X,cord4Y}};
		return cords;
	}

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);
	//	g2.fill(block1);

	}
	public void setDx(int x)
	{
		dx = x;
	}
	
	public void setDy(int y)
	{
		dy = y;
	}
	public void setCords()
	{
		cord1X += dx;
		cord1Y += dy;
		
		cord2X += dx;
		cord2Y += dy;
		
		cord3X += dx;
		cord3Y += dy;
		
		cord4X += dx;
		cord4Y += dy;
	}//setting new coords
	
	public void setCords(int cord1X,int cord1Y,int cord2X,int cord2Y, int cord3X,int cord3Y,
			int cord4X,int cord4Y)
	{
		this.cord1X =cord1X;
		this.cord1Y =cord1Y;
	
		this.cord2X =cord2X;
		this.cord2Y =cord2Y;
		
		this.cord3X =cord3X;
		this.cord3Y =cord3Y;
		
		this.cord4X =cord4X;
		this.cord4Y =cord4Y;
	}
	public int[][] getCords1()
	{
		int[][] cords = {{cord1X,cord1Y},{cord2X,cord2Y},{cord3X,cord3Y},{cord4X,cord4Y}};
		return cords;
	}
	
	public String getColor()
	{
		return colour;
	}
	public void update()
	{
		setCords();
	}



}
