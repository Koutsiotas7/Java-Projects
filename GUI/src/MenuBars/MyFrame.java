package MenuBars;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener
{
	JMenuBar menuBar = new JMenuBar();
	
	JMenu fileMenu = new JMenu("File");
	JMenu editMenu = new JMenu("Edit");
	JMenu helpMenu = new JMenu("Help");
	
	JMenuItem loadItem = new JMenuItem("Load");
	JMenuItem saveItem = new JMenuItem("Save");
	JMenuItem exitItem = new JMenuItem("Exit");
	
	ImageIcon loadIcon = new ImageIcon("load.png");
	ImageIcon saveIcon = new ImageIcon("save.png");
	ImageIcon exitIcon = new ImageIcon("exit.png");
	
	MyFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		fileMenu.setMnemonic(KeyEvent.VK_F); //Alt + F for File
		editMenu.setMnemonic(KeyEvent.VK_E); //Alt + E for Edit
		helpMenu.setMnemonic(KeyEvent.VK_H); //Alt + H for Help
		
		loadItem.setMnemonic(KeyEvent.VK_L); // L for load
		saveItem.setMnemonic(KeyEvent.VK_S); // S for save
		exitItem.setMnemonic(KeyEvent.VK_E); // E for exit
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar);
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == loadItem)
		{
			System.out.println("*Beep boop* you loaded a file.");
		}
		if(e.getSource() == saveItem)
		{
			System.out.println("*Beep boop* you saved a file.");
		}
		if(e.getSource() == exitItem)
		{
			System.exit(0);
		}
	}

}
