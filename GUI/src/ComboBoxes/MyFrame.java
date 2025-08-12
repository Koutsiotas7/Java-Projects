package ComboBoxes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener
{
	String[] animals = {"Dog", "Cat", "Bird"};
	JComboBox comboBox = new JComboBox(animals);
	
	MyFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		comboBox.addActionListener(this);
		
//		comboBox.setEditable(true);
		System.out.println(comboBox.getItemCount());	
		
		comboBox.addItem("Horse");
		comboBox.insertItemAt("Pig", 0);
		comboBox.setSelectedIndex(0);
		
		comboBox.removeItem("Cat");
		
		comboBox.removeItemAt(0);
		
	//	comboBox.removeAll(); //empties the list
		
		this.add(comboBox);
		
		this.pack();
		this.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == comboBox)
		{
			System.out.println(comboBox.getSelectedItem());
		//	System.out.println(comboBox.getSelectedIndex());
		}
	}
	
}
