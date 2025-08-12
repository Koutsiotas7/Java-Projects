package JLayeredPane;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class JLayeredPaneMain {

	public static void main(String[] args) 
	{
		//JLayeredPane: Swing container that provides a third
		//dimension for positioning components, ex. depth, Z-index
		
		JLabel labe11 = new JLabel();
		labe11.setOpaque(true);
		labe11.setBackground(Color.RED);
		labe11.setBounds(50,50,200,200);
		
		JLabel labe12 = new JLabel();
		labe12.setOpaque(true);
		labe12.setBackground(Color.YELLOW);
		labe12.setBounds(100,100,200,200);
		
		JLabel labe13 = new JLabel();
		labe13.setOpaque(true);
		labe13.setBackground(Color.GREEN);
		labe13.setBounds(150,150,200,200);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 500, 500);
		
		layeredPane.add(labe11, JLayeredPane.DEFAULT_LAYER);
		layeredPane.add(labe12, JLayeredPane.DEFAULT_LAYER);
		layeredPane.add(labe13, JLayeredPane.DRAG_LAYER);
		
		JFrame frame = new JFrame("JLayeredPane");
		frame.add(layeredPane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500, 500));
		frame.setLayout(null);
		
		
		frame.setVisible(true);
	}

}
