package buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener
{
	JButton button;
	JLabel label;
	
	MyFrame()
	{
		ImageIcon icon = new ImageIcon("ece.png");
		
		label = new JLabel();
		label.setBounds(50,50,100,100);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(200, 100, 400, 300);
		button.addActionListener(this);
		button.setText("I am a new Button.");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
		button.setIconTextGap(-5);
		button.setForeground(Color.cyan);
		button.setBackground(Color.gray);
		button.setBorder(BorderFactory.createEtchedBorder());
//		button.setEnabled(false); if we want not to be pushed
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == button)
		{
			label.setVisible(true);
		}
	}
	
}
