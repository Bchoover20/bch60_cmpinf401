package edu.pitt.assignment1;


import javax.swing.JOptionPane;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Declaration Statements
	int Input_i_1 = 0;
	int Input_i_2 = 0;
	double Answer = 0;
	
	//Assignment Statements
	JOptionPane.showMessageDialog(null, "Pythagorean theorem Solver");
	String Input_s = JOptionPane.showInputDialog("-- DO NOT USE SPACES -- \n Input number for a. \n Input number for b \n");
	
	// Seperating the two numbers by using substrings
	String Input_sub1 = Input_s.substring(0,1);
	String Input_sub2 = Input_s.substring(1,2);
	
	// Turning those numbers into ints 
	Input_i_1 = Integer.parseInt(Input_sub1);
	Input_i_2 = Integer.parseInt(Input_sub2);
	
	// Calculating the hypotenuse
	Answer = Math.pow(Input_i_1,2) + Math.pow(Input_i_2,2);
	Answer = Math.sqrt(Answer);

	//Converting back into a string for the output -- https://www.javatpoint.com/java-double-to-string
	String Answer_s = String.valueOf(Answer);
	
	//Rounding the string to show useful output
	String Answer_s_sub = Answer_s.substring(0,5);
	
	// Final JOption pane
	JOptionPane.showMessageDialog(null,"The hypotenuse is " + Answer_s_sub);
		
	}

}
