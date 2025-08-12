package labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class learnJLabel 
{
	public static void main(String[] args)
	{
		
	ImageIcon image = new ImageIcon("ece.png");
	
	Border border = BorderFactory.createLineBorder(Color.green, 3);
		
	JLabel label = new JLabel(); // Create a label
	
	label.setText("Koutsi's first label"); //Set text of label
	label.setIcon(image);
	
	label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,RIGHT,CENTER of imageIcon
	label.setVerticalTextPosition(JLabel.TOP); // TOP,BOTTOM OR CENTER
	label.setForeground(Color.green); // Text's color
	label.setFont(new Font("MV Boli",Font.PLAIN,50)); //Text' font
	
	label.setIconTextGap(-10); // gap of text to image
	label.setBackground(Color.pink); //set background color
	label.setOpaque(true); //display background color
	label.setBorder(border);
	
	label.setVerticalAlignment(JLabel.CENTER); //Set vertical position of icon+text within label
	label.setHorizontalAlignment(JLabel.CENTER); //Set horizontal position of icon+text within label
//	label.setBounds(100,0,250,250); //set x,y position within frame as well as dimensions
	
	JFrame frame = new JFrame();
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	frame.setSize(500, 500);
	
//	frame.setLayout(null);
	
	frame.setVisible(true);
	
	frame.add(label);
	frame.pack();
	}	
}
