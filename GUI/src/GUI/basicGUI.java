package GUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class basicGUI 
{

    public static void main(String[] args) 
    {
    	// JFrame: GUI Window to add components to
    	JFrame frame = new JFrame(); //Creates the frame
    	frame.setTitle("Our first GUI"); //Frame's title
    	
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setSize(420, 420); //Sets the x and y dimension of the frame
    	
//    	frame.setResizable(false); //prevent the resize
    	
    	frame.setVisible(true); // make frame visible
    	
    	ImageIcon image = new ImageIcon("ece.png"); //Create an ImageIcon
    	frame.setIconImage(image.getImage()); //Change frame's icon
    	
    	frame.getContentPane().setBackground(Color.blue); //Background color
//    	frame.getContentPane().setBackground(new Color(255,0,0)); //Color with RGB system
    }
    
}

