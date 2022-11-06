import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author Anshul104
 * Assignment: Add Account Frame
 *
 */
public class mainInterface extends JFrame
{
	private ArrayList<BankAccount> bankAccountArray;
	
	public mainInterface()
	{
		bankAccountArray = new ArrayList<BankAccount>();
		setBounds(200,100,350,200);
		setTitle("Ellis National Bank");
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		JLabel lblName = new JLabel("Name: ");
		add(lblName,gbc);
		JTextField nameTxt = new JTextField();
		nameTxt.setPreferredSize(new Dimension(120,20));
		gbc.gridx++;
		add(nameTxt,gbc);
		
		JLabel initialDeposit = new JLabel("Initial Deposit: ");
		gbc.gridx=0;
		gbc.gridy--;
		add(initialDeposit,gbc);
		JTextField intialTxt = new JTextField();
		intialTxt.setPreferredSize(new Dimension(120,20));
		gbc.gridx++;
		add(intialTxt,gbc);
		
		String[] tempTypes = {"Select Account Type","Savings Account","Checkings Account"};
		JComboBox dropDown = new JComboBox(tempTypes);

		dropDown.setSelectedItem(1);

		gbc.gridy--;
		gbc.gridx=0;
		add(dropDown,gbc);
		
		
		JButton buttonCreate = new JButton("Create");
		buttonCreate.setPreferredSize(new Dimension(240,20));


		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 20;     
		gbc.weightx = 0.0;
		gbc.gridwidth = 3;
		
		gbc.gridy--;
		
		
		add(buttonCreate, gbc);

		
		JCheckBox intitalCheckBox = new JCheckBox ("Initial Deposit",true);
		gbc.gridy=3;
		gbc.gridx=1;
		add(intitalCheckBox,gbc);
		
		
		intitalCheckBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if(intitalCheckBox.isSelected())
					intialTxt.setEditable(true);
				else
					intialTxt.setEditable(false);
			}

		});
		
		buttonCreate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
					if(intitalCheckBox.isSelected())
					{
						if(!(nameTxt.getText().isEmpty()) )
						{
							if(!(intialTxt.getText().isEmpty()) || isDouble(intialTxt.getText()))
							{
								if(dropDown.getSelectedItem().equals("Checkings Account"))
								{
									
									try
									{
										bankAccountArray.add(new CheckingAccount(nameTxt.getText(),Double.parseDouble(intialTxt.getText())));										
									}
									catch(IllegalArgumentException e1)
									{
										
									}
									
									dropDown.setSelectedIndex(0);
									intialTxt.setText("");
									nameTxt.setText("");
									intitalCheckBox.setSelected(true);
								}
								else if (dropDown.getSelectedItem().equals("Savings Account"))
								{
									
									try
									{
										bankAccountArray.add(new SavingsAccount(nameTxt.getText(),Double.parseDouble(intialTxt.getText())));		
										
									}
									catch(IllegalArgumentException e1)
									{
										
									}
									dropDown.setSelectedIndex(0);
									intialTxt.setText("");
									nameTxt.setText("");
									intitalCheckBox.setSelected(true);
								}
								

								
							}
						}
						
					}
					else //if initial is not checked
					{
						if(!(nameTxt.getText().isEmpty()) )
						{
	
								if(dropDown.getSelectedItem().equals("Checkings Account"))
								{
									try
									{
										
										bankAccountArray.add(new CheckingAccount(nameTxt.getText(),Double.parseDouble(intialTxt.getText())));
										
									}
									catch(IllegalArgumentException e1)
									{
										
									}
									dropDown.setSelectedIndex(0);
									intialTxt.setText("");
									nameTxt.setText("");
									intitalCheckBox.setSelected(true);
								}
								else if (dropDown.getSelectedItem().equals("Savings Account"))
								{
									try
									{
										bankAccountArray.add(new SavingsAccount(nameTxt.getText(),Double.parseDouble(intialTxt.getText())));
										
									}
									catch(IllegalArgumentException e1)
									{
										
									}
									
									dropDown.setSelectedIndex(0);
									intialTxt.setText("");
									nameTxt.setText("");
									intitalCheckBox.setSelected(true);
								}
							
						}
					}
					
			}

		});
		

		
		this.setResizable(false);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
	
	
	public static boolean isDouble (String str)
	{
		try
		{
			double tempDouble  = Double.parseDouble(str);
		}
		
		catch (NumberFormatException e)
		{
			return false;
		}
		
		return true;
	}

	public static void main(String[] args)
	{
		new mainInterface();


	}

}
