package checkboxes;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener
{
	JButton button = new JButton();
	JCheckBox checkBox = new JCheckBox();
//	ImageIcon icon = new ImageIcon("ece.png");
	
	MyFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		this.setLayout(new FlowLayout());
		
		button.setText("submit");
		button.addActionListener(this);
		
		checkBox.setText("I am not a robot.");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas",Font.PLAIN,30));
//		checkBox.setIcon(null);
//		checkBox.setSelectedIcon(icon);
		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == button)
		{
			System.out.println(checkBox.isSelected());	
		}
	}
	
}
