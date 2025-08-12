package KeyListener;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements KeyListener
{
	
	JLabel label = new JLabel();
	ImageIcon icon = new ImageIcon("hamburger.png");
	
	MyFrame()
	{	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		this.setSize(500, 500);
		this.setLayout(null);
		
		label.setBounds(0, 0, 100, 100);
//		label.setBackground(Color.RED);
//		label.setOpaque(true); //Display the color
		label.setIcon(icon);
		
		this.getContentPane().setBackground(Color.YELLOW);
		this.add(label);
		this.addKeyListener(this);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{
		//keyTyped:Invoked when a key is typed. Uses KeyChar, char output.
		switch(e.getKeyChar())
		{
			case 'a': label.setLocation(label.getX() - 5, label.getY());
			break;
			
			case 'w': label.setLocation(label.getX(), label.getY() - 5);
			break;
			
			case 's': label.setLocation(label.getX(), label.getY() + 5);
			break;
			
			case 'd': label.setLocation(label.getX() + 5, label.getY());
			break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		//keyPressed:Invoked when a physical key is pressed down. Uses KeyCode, int output.
		
		switch(e.getKeyCode())
		{
		// cases are the arrow codes on the keyboard
			case 37: label.setLocation(label.getX() - 5, label.getY());
			break;
			
			case 38: label.setLocation(label.getX(), label.getY() - 5);
			break;
			
			case 39: label.setLocation(label.getX() + 5, label.getY());
			break;
			
			case 40: label.setLocation(label.getX(), label.getY() + 5);
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		//keyReleased:Called whenever a button is released
		System.out.println("You released key char: " +e.getKeyChar());
		System.out.println("You released key char: " +e.getKeyCode());
	}
}
