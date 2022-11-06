import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class salaryCalculator
{

	public static void main(String[] args) 
	{

		JFrame frame = new JFrame("Salary Calculator");
		
		frame.setBounds(100,100,350,185);
		frame.setLayout(null);

		
		JLabel hourlyRateLabel = new JLabel("Hourly Rate: ");
		hourlyRateLabel.setBounds(20,10,100,50);
		frame.add(hourlyRateLabel);
		
		JTextField hourlyRate = new JTextField();
		hourlyRate.setBounds(100,25, 120,25);
		frame.add(hourlyRate);
		
		
		
		JLabel weekLabel = new JLabel("Hours/Week: ");
		weekLabel.setBounds(20,35,100,50);
		frame.add(weekLabel);
		
		JTextField weeklyHours = new JTextField();
		weeklyHours.setBounds(100,50, 120,25);
		frame.add(weeklyHours);
		
		JCheckBox fullTime = new JCheckBox ("Full Time");
		fullTime.setBounds(20,75,100,20);
		frame.add(fullTime);
		
		JButton calc = new JButton("Calculate");
		calc.setBounds(20,100,120,25);
		frame.add(calc);
		
		JLabel annualSalary = new JLabel("Annual Salary: $");
		annualSalary.setBounds(150,85,200,50);
		frame.add(annualSalary);

		calc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if(!(hourlyRate.getText().isEmpty()))
				{
					if(fullTime.isSelected()==true)
					{
						double amount = Double.parseDouble(hourlyRate.getText()) * 52 * 40;
						amount = (double) Math.round(amount*100)/100;
						annualSalary.setText("Annual Salary: $" + amount);
					}
					else
					{
						if(!(weeklyHours.getText().isEmpty()))
						{
							
							double amount = Double.parseDouble(hourlyRate.getText()) * 52 * Double.parseDouble(weeklyHours.getText());
							amount = (double) Math.round(amount*100)/100;
							annualSalary.setText("Annual Salary: $" + amount);
						}
					}
				}	
			}

		});
		
		fullTime.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if(fullTime.isSelected())
					weeklyHours.setEditable(false);
				else
					weeklyHours.setEditable(true);
			}

		});
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}