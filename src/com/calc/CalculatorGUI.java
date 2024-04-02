package com.calc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * CalculatorGUI class represents the graphical user interface of a simple
 * calculator
 */
public class CalculatorGUI extends JFrame implements ActionListener {
	CalculatorBackend backend = new CalculatorBackend();
	Double previousResult;
	// Create buttons
	JTextField textField = new JTextField();// Text field
	JButton one = new JButton();
	JButton two = new JButton();
	JButton three = new JButton();
	JButton four = new JButton();
	JButton five = new JButton();
	JButton six = new JButton();
	JButton seven = new JButton();
	JButton eight = new JButton();
	JButton nine = new JButton();
	JButton zero = new JButton();
	JButton equals = new JButton();
	JButton divide = new JButton();
	JButton multiply = new JButton();
	JButton minus = new JButton();
	JButton plus = new JButton();
	JButton point = new JButton();
	JButton delete = new JButton();
	JButton clear = new JButton();

	// Class Constructor
	public CalculatorGUI() {
		int buttonWidth = 100;
		int buttonHeight = 100;
		// Setting button sizes
		textField.setPreferredSize(new Dimension(100, 50));
		one.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
		two.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
		three.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
		four.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
		five.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
		six.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
		seven.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
		eight.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
		nine.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
		zero.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
		equals.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
		divide.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
		multiply.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
		plus.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
		minus.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
		point.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
		delete.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
		clear.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
		// Setting the text for the buttons
		one.setText("1");
		two.setText("2");
		three.setText("3");
		four.setText("4");
		five.setText("5");
		six.setText("6");
		seven.setText("7");
		eight.setText("8");
		nine.setText("9");
		zero.setText("0");
		equals.setText("=");
		divide.setText("/");
		multiply.setText("*");
		plus.setText("+");
		minus.setText("-");
		point.setText(".");
		delete.setText("DEL");
		clear.setText("CLR");
		// Changing the background of buttons
		one.setBackground(Color.decode("#272727"));
		two.setBackground(Color.decode("#272727"));
		three.setBackground(Color.decode("#272727"));
		four.setBackground(Color.decode("#272727"));
		five.setBackground(Color.decode("#272727"));
		six.setBackground(Color.decode("#272727"));
		seven.setBackground(Color.decode("#272727"));
		eight.setBackground(Color.decode("#272727"));
		nine.setBackground(Color.decode("#272727"));
		zero.setBackground(Color.decode("#272727"));
		divide.setBackground(Color.decode("#272727"));
		multiply.setBackground(Color.decode("#272727"));
		plus.setBackground(Color.decode("#272727"));
		minus.setBackground(Color.decode("#272727"));
		point.setBackground(Color.decode("#272727"));
		clear.setBackground(Color.decode("#272727"));
		delete.setBackground(Color.decode("#272727"));
		equals.setBackground(Color.decode("#272727"));
		// Changing color of button text
		one.setForeground(Color.WHITE);
		two.setForeground(Color.WHITE);
		three.setForeground(Color.WHITE);
		four.setForeground(Color.WHITE);
		five.setForeground(Color.WHITE);
		six.setForeground(Color.WHITE);
		seven.setForeground(Color.WHITE);
		eight.setForeground(Color.WHITE);
		nine.setForeground(Color.WHITE);
		zero.setForeground(Color.WHITE);
		point.setForeground(Color.WHITE);
		multiply.setForeground(Color.WHITE);
		divide.setForeground(Color.WHITE);
		plus.setForeground(Color.WHITE);
		minus.setForeground(Color.WHITE);
		delete.setForeground(Color.WHITE);
		clear.setForeground(Color.WHITE);
		equals.setForeground(Color.WHITE);

		setLayout(new BorderLayout());
		JPanel buttonPanel = new JPanel(new GridLayout(0, 4));// Creates a panel
		// Adding buttons to the panel
		buttonPanel.add(one);
		buttonPanel.add(two);
		buttonPanel.add(three);
		buttonPanel.add(four);
		buttonPanel.add(five);
		buttonPanel.add(six);
		buttonPanel.add(seven);
		buttonPanel.add(eight);
		buttonPanel.add(nine);
		buttonPanel.add(zero);
		buttonPanel.add(divide);
		buttonPanel.add(multiply);
		buttonPanel.add(plus);
		buttonPanel.add(minus);
		buttonPanel.add(point);
		buttonPanel.add(equals);
		buttonPanel.add(delete);
		buttonPanel.add(clear);

		// Changing button font
		Font ButtonFont = new Font("Arial", Font.BOLD, 16);
		Font textFieldFont = new Font("Arial", Font.BOLD, 30);
		one.setFont(ButtonFont);
		two.setFont(ButtonFont);
		three.setFont(ButtonFont);
		four.setFont(ButtonFont);
		five.setFont(ButtonFont);
		six.setFont(ButtonFont);
		seven.setFont(ButtonFont);
		eight.setFont(ButtonFont);
		nine.setFont(ButtonFont);
		zero.setFont(ButtonFont);
		point.setFont(ButtonFont);
		divide.setFont(ButtonFont);
		multiply.setFont(ButtonFont);
		minus.setFont(ButtonFont);
		plus.setFont(ButtonFont);
		equals.setFont(ButtonFont);
		clear.setFont(ButtonFont);
		delete.setFont(ButtonFont);
		textField.setFont(textFieldFont);

		// Removes the little box when button is clicked
		one.setFocusPainted(false);
		two.setFocusPainted(false);
		three.setFocusPainted(false);
		four.setFocusPainted(false);
		five.setFocusPainted(false);
		six.setFocusPainted(false);
		seven.setFocusPainted(false);
		eight.setFocusPainted(false);
		nine.setFocusPainted(false);
		zero.setFocusPainted(false);
		divide.setFocusPainted(false);
		multiply.setFocusPainted(false);
		plus.setFocusPainted(false);
		minus.setFocusPainted(false);
		point.setFocusPainted(false);
		equals.setFocusPainted(false);
		clear.setFocusPainted(false);
		delete.setFocusPainted(false);

		// Adding Action Listeners
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		zero.addActionListener(this);
		delete.addActionListener(this);
		clear.addActionListener(this);
		plus.addActionListener(this);
		divide.addActionListener(this);
		multiply.addActionListener(this);
		minus.addActionListener(this);
		point.addActionListener(this);
		equals.addActionListener(this);

		ImageIcon image = new ImageIcon(CalculatorGUI.class.getResource("calculator.png"));// Adding App icon
		this.setIconImage(image.getImage());

		pack();
		this.add(buttonPanel, BorderLayout.CENTER);
		this.add(textField, BorderLayout.NORTH);

		this.getContentPane().setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calculator");// Calculator Title
		this.setSize(420, 600);
		this.setVisible(true);
		this.setResizable(false);
	}

	/**
	 * Action Listener for handling button clicks
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == one) {

			textField.setText(textField.getText() + "1");

		}

		else if (e.getSource() == two) {

			textField.setText(textField.getText() + "2");

		}

		else if (e.getSource() == three) {

			textField.setText(textField.getText() + "3");

		}

		else if (e.getSource() == four) {

			textField.setText(textField.getText() + "4");

		}

		else if (e.getSource() == five) {

			textField.setText(textField.getText() + "5");

		}

		else if (e.getSource() == six) {

			textField.setText(textField.getText() + "6");

		}

		else if (e.getSource() == seven) {

			textField.setText(textField.getText() + "7");

		}

		else if (e.getSource() == eight) {

			textField.setText(textField.getText() + "8");

		}

		else if (e.getSource() == nine) {

			textField.setText(textField.getText() + "9");

		}

		else if (e.getSource() == zero) {

			textField.setText(textField.getText() + "0");

		}

		else if (e.getSource() == delete) {

			int cursorPosition = textField.getCaretPosition();

			String currentText = textField.getText();

			if (!currentText.isEmpty() && cursorPosition > 0) {
				StringBuilder updatedText = new StringBuilder(currentText);
				updatedText.deleteCharAt(cursorPosition - 1);
				textField.setText(updatedText.toString());
				textField.setCaretPosition(cursorPosition - 1);
			}

		}

		else if (e.getSource() == clear) {
			textField.setText("");
		}

		else if (e.getSource() == plus) {
			textField.setText(textField.getText() + "+");
		}

		else if (e.getSource() == multiply) {
			textField.setText(textField.getText() + "*");
		}

		else if (e.getSource() == minus) {
			textField.setText(textField.getText() + "-");
		}

		else if (e.getSource() == divide) {
			textField.setText(textField.getText() + "/");
		}

		else if (e.getSource() == point) {
			textField.setText(textField.getText() + ".");
		}

		else if (e.getSource() == equals) {
			String expression = textField.getText(); // Get the expression from your GUI input field

			if (!expression.isEmpty() && backend.isOperator(expression.charAt(expression.length() - 1))) {

				if (previousResult != null) {
					// Append the previous result only if it's preceded by an operator
					expression += " " + previousResult.toString();
				}
			}
			Double result = CalculatorBackend.evaluateInfix(expression);
			System.out.println("Result" + result);
			textField.setText(Double.toString(result));
			previousResult = null;
		}

	}

}
