package edu.pitt.lab2;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PythagoreanTheorem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// Declaration Statement
		double answer = 0;
		
		
		//Assignment Statements
		JOptionPane.showMessageDialog(null, "Pythagorean theorem Solver");
		
		
		// Putting multiple text input boxes in the same JOption Pane -- https://www.codejava.net/java-se/swing/jtextfield-basic-tutorial-and-examples
		// And pulling the data the user input from both text boxes into 2 seperate variables
		JTextField textBox1 = new JTextField("Enter in number for a");
		
		String userInput2 = JOptionPane.showInputDialog(null, textBox1, "Enter in number for b");
		
		String userInput1 = textBox1.getText();
		
		// Turning those numbers into int's 
		double userInput1_I = Integer.parseInt(userInput1);
		double userInput2_I = Integer.parseInt(userInput2);
		
		// Calculating the hypotenuse using Math.pow and Math.sqrt methods
		double two = 2;
		answer = Math.pow(userInput1_I, two) + Math.pow(userInput2_I, two);
		answer = Math.sqrt(answer);

		//Converting back into a string for the output -- https://www.javatpoint.com/java-double-to-string
		String answer_S = String.valueOf(answer);
		
		//Rounding the string to show useful output
		String answer_S_Sub = answer_S.substring(0,5);
		
		// Final JOption pane
		JOptionPane.showMessageDialog(null,"The hypotenuse is " + answer_S_Sub);

	}

}
