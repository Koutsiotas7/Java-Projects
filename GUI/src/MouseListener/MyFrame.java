package MouseListener;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener
{
	
	JLabel label = new JLabel();
	ImageIcon hamburger = new ImageIcon("hamburger.png");
	ImageIcon pizza = new ImageIcon("pizza.png");
	ImageIcon hotDog = new ImageIcon("hotDog.png");
	ImageIcon ece = new ImageIcon("ece.png");
	
	MyFrame()
	{
		label.setBounds(0, 0, 100, 100);
//		label.setBackground(Color.YELLOW);
		label.setOpaque(true);
		label.addMouseListener(this);
		
	//	this.addMouseListener(this); Add it to frame
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);
		
		this.add(label);
		
		label.setIcon(hamburger);
		
		this.add(label);
		label.addMouseListener(this);

		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//Invoked when the mouse button has been clicked(pressed and released) on a component
		System.out.println("You clicked the mouse!");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//Invoked when a mouse button has been pressed on a component
		System.out.println("You pressed the mouse!");
	//	label.setBackground(Color.RED);
		label.setIcon(pizza);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//Invoked when a mouse button has been released on a component
		System.out.println("You released the mouse!");
	//	label.setBackground(Color.green);
		label.setIcon(ece);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//Invoked when the mouse enters a component
		System.out.println("You entered the component!");
	//	label.setBackground(Color.BLUE);
		label.setIcon(hotDog);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//Invoked when the mouse exits a component
		System.out.println("You exited the component!");
	//	label.setBackground(Color.YELLOW);
		label.setIcon(hamburger);
	}
}
