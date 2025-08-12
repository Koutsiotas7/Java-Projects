package JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JOptionPaneMain {

	public static void main(String[] args) 
	{
		//JOptionPane: pop up a standard dialog box that prompts
		//users for a value or informs them of something.
		
	//	JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.PLAIN_MESSAGE);
	//	JOptionPane.showMessageDialog(null, "More useless info.", "Title", JOptionPane.INFORMATION_MESSAGE);
	//	JOptionPane.showMessageDialog(null, "Really now mate?", "Title", JOptionPane.QUESTION_MESSAGE);
	//	JOptionPane.showMessageDialog(null, "Your computer has a virus.", "Title", JOptionPane.WARNING_MESSAGE);
	//	JOptionPane.showMessageDialog(null, "Call tech support now.", "Title", JOptionPane.ERROR_MESSAGE);
		
	//	int answer = JOptionPane.showConfirmDialog(null, "You do like coding?", "New Title", JOptionPane.YES_NO_CANCEL_OPTION);
		
	//	String name = JOptionPane.showInputDialog("What is your name? ");
	//	System.out.println("Hello " +name);
		
		String[] responses = {"No, you are awesome!!", "Thanks", "Oh my GOD"};
		
		ImageIcon icon = new ImageIcon("ece.png");
		
		JOptionPane.showOptionDialog(
				null, 
				"You are awesome!", 
				"Secret Message", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				icon, 
				responses, 
				0);
		
	}

}
