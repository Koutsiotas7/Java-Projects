package CalculatorApp;

import javax.swing.*;

public class MyFrame extends JFrame 
{
    public MyFrame() 
    {
        this.setTitle("Calculator");
        this.setSize(420, 530);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        MyPanel panel = new MyPanel();
        panel.setBounds(0, 0, 420, 530);
        this.add(panel);

        this.setVisible(true);
    }
}
