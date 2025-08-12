package CalculatorApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyPanel extends JPanel implements ActionListener 
{
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton, negButton;
    JPanel buttonPanel;

    Font myFont = new Font("Ink Free", Font.BOLD, 30);
    double num1 = 0, num2 = 0, result = 0;
    char operator;

    public MyPanel() 
    {
        this.setLayout(null);

        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(myFont);
        textfield.setEditable(false);
        this.add(textfield);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");
        negButton = new JButton("(-)");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;

        for (JButton btn : functionButtons) 
        {
            btn.addActionListener(this);
            btn.setFont(myFont);
            btn.setFocusable(false);
        }

        for (int i = 0; i < 10; i++) 
        {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        negButton.setBounds(50, 430, 100, 50);
        delButton.setBounds(150, 430, 100, 50);
        clrButton.setBounds(250, 430, 100, 50);
        this.add(negButton);
        this.add(delButton);
        this.add(clrButton);

        buttonPanel = new JPanel();
        buttonPanel.setBounds(50, 100, 300, 300);
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));

        buttonPanel.add(numberButtons[1]);
        buttonPanel.add(numberButtons[2]);
        buttonPanel.add(numberButtons[3]);
        buttonPanel.add(addButton);
        buttonPanel.add(numberButtons[4]);
        buttonPanel.add(numberButtons[5]);
        buttonPanel.add(numberButtons[6]);
        buttonPanel.add(subButton);
        buttonPanel.add(numberButtons[7]);
        buttonPanel.add(numberButtons[8]);
        buttonPanel.add(numberButtons[9]);
        buttonPanel.add(mulButton);
        buttonPanel.add(decButton);
        buttonPanel.add(numberButtons[0]);
        buttonPanel.add(equButton);
        buttonPanel.add(divButton);

        this.add(buttonPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        for (int i = 0; i < 10; i++) 
        {
            if (e.getSource() == numberButtons[i]) 
            {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == decButton) {
            textfield.setText(textfield.getText().concat("."));
        }

        if (e.getSource() == addButton) 
        {
            num1 = Double.parseDouble(textfield.getText());
            operator = '+';
            textfield.setText("");
        }

        if (e.getSource() == subButton) 
        {
            num1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText("");
        }

        if (e.getSource() == mulButton) 
        {
            num1 = Double.parseDouble(textfield.getText());
            operator = '*';
            textfield.setText("");
        }

        if (e.getSource() == divButton) 
        {
            num1 = Double.parseDouble(textfield.getText());
            operator = '/';
            textfield.setText("");
        }

        if (e.getSource() == equButton) 
        {
            num2 = Double.parseDouble(textfield.getText());
            switch (operator) 
            {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num2 != 0 ? num1 / num2 : 0;
                    break;
            }
            textfield.setText(String.valueOf(result));
            num1 = result;
        }

        if (e.getSource() == clrButton) 
        {
            textfield.setText("");
        }

        if (e.getSource() == delButton) 
        {
            String s = textfield.getText();
            if (!s.isEmpty()) 
            {
                textfield.setText(s.substring(0, s.length() - 1));
            }
        }

        if (e.getSource() == negButton) 
        {
            try 
            {
                double temp = Double.parseDouble(textfield.getText());
                temp *= -1;
                textfield.setText(String.valueOf(temp));
            } 
            catch (NumberFormatException ex) 
            {
                textfield.setText("");
            }
        }
    }
}
