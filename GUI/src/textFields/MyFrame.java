package textFields;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener
{
	JButton button = new JButton("Submit");
	
	JTextField textField = new JTextField();
	
	MyFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		this.setLayout(new FlowLayout());
		
		button.addActionListener(this);
		
		textField.setPreferredSize(new Dimension(250, 40));
		textField.setFont(new Font("Consolas",Font.PLAIN, 30));
		textField.setForeground(Color.CYAN);
		textField.setBackground(Color.yellow);
		textField.setCaretColor(Color.white);
		textField.setText("Username");
	//	textField.setEditable(false);
		
		this.add(button);
		this.add(textField);
		
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == button)
		{	
			System.out.println("Hello " + textField.getText());	
			button.setEnabled(false);
			textField.setEditable(false);
		}
	}

}
