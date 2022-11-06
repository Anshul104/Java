import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class checkBox 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		
		frame.setBounds(100,100,600,300);
		
		
		JCheckBox box = new JCheckBox("Are you a human? ", false);
		
		frame.add(box);
		
		box.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				JButton button = new JButton("Don't press this.");
				button.setBounds(   (int)(Math.random()*100),   (int)(Math.random()*100),50,50);
				frame.add(button);
			}
		});
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
