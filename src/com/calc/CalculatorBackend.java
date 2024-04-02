package com.calc;

import java.util.Stack;

/**
 * CalculatorBackend class provides functionality for the calculator
 */
public class CalculatorBackend {
	private CalculatorGUI gui;

	/**
	 * Constructor for Calculator for CalculatorBackend
	 * 
	 * @param gui CalculatorGUI object representing the graphical user interface
	 */
	public CalculatorBackend(CalculatorGUI gui) {
		this.gui = gui;
	}

	/**
	 * Default constructor for CalculatorBackend
	 * 
	 */
	public CalculatorBackend() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Checks if a character is an operator
	 * 
	 * @param c The character to be checked
	 * @return true if the character is an operator, false otherwise
	 */
	public boolean isOperator(char c) {
		return c == '+' || c == '-' || c == '*' || c == '/';
	}

	/**
	 * Evaluates an infix expression
	 * 
	 * @param expression The infix expression to be evaluated
	 * @return The result of the evaluation
	 */
	public static double evaluateInfix(String expression) {
		String postfix = infixToPostfix(expression);
		System.out.println("PostfixExpression: " + postfix);
		return evaluatePostfix(postfix);
	}

	/**
	 * Evaluates a postfix expression
	 * 
	 * @param expression The postfix expression to be evaluated
	 * @return The result of the evaluation
	 */
	public static double evaluatePostfix(String expression) {
		Stack<Double> stack = new Stack<>();

		String[] tokens = expression.split("\\s+");

		for (String token : tokens) {
			if (isNumeric(token)) {
				stack.push(Double.parseDouble(token));
			} else {
				double operand2 = stack.pop();
				double operand1 = stack.pop();
				double result = 0;
				switch (token) {
				case "+":
					result = operand1 + operand2;
					break;
				case "-":
					result = operand1 - operand2;
					break;
				case "*":
					result = operand1 * operand2;
					break;
				case "/":
					result = operand1 / operand2;
					break;
				}
				stack.push(result);
			}
		}

		return stack.pop();
	}

	/**
	 * Checks if a string is numeric
	 * 
	 * @param str The string to be checked
	 * @return true if the string is numeric, false otherwise
	 */
	private static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}

	/**
	 * Converts an infix expression to postfix
	 * 
	 * @param infix The infix Expression to be converted
	 * @return The postfix expression
	 */
	public static String infixToPostfix(String infix) {
		StringBuilder postfix = new StringBuilder();
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < infix.length(); i++) {
			char c = infix.charAt(i);

			if (Character.isDigit(c) || c == '.') {
				// Handle digits and decimal points
				while (i < infix.length() && (Character.isDigit(infix.charAt(i)) || infix.charAt(i) == '.')) {
					postfix.append(infix.charAt(i++));
				}
				postfix.append(" ");
				i--;
			} else if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					postfix.append(stack.pop()).append(" ");
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
					postfix.append(stack.pop()).append(" ");
				}
				stack.push(c);
			}
		}

		while (!stack.isEmpty()) {
			postfix.append(stack.pop()).append(" ");
		}

		return postfix.toString().trim();
	}

	/**
	 * Determines the precedence of an operator
	 * 
	 * @param operator The operator whose precedence is to be determined
	 * @return The precedence value
	 */
	private static int precedence(char operator) {
		if (operator == '+' || operator == '-') {
			return 1;
		} else if (operator == '*' || operator == '/') {
			return 2;
		}
		return 0;
	}
}
