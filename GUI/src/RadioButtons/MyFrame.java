package RadioButtons;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener
{
	
	JRadioButton pizzaButton = new JRadioButton("Pizza");
	JRadioButton hamburgerButton = new JRadioButton("Hamburger");
	JRadioButton hotdogButton = new JRadioButton("Hotdog");
	
	ImageIcon pizzaIcon = new ImageIcon("pizza.png");
	ImageIcon hamburgerIcon = new ImageIcon("hamburger.png");
	ImageIcon hotdogIcon = new ImageIcon("hotDog.png");
	
	ButtonGroup group = new ButtonGroup();
	
	MyFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotdogButton);
		
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);
		
		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		
		pizzaButton.setIcon(pizzaIcon);
		hamburgerButton.setIcon(hamburgerIcon);
		hotdogButton.setIcon(hotdogIcon);
		
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == pizzaButton)
		{
			System.out.println("You ordered pizza!");
		}
		else if(e.getSource() == hamburgerButton)
		{
			System.out.println("You ordered a hamburger!");
		}
		else
		{
			System.out.println("You ordered a hotdog!");
		}
	}
	
}
