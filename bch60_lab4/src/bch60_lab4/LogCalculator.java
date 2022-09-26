package bch60_lab4;

import javax.swing.JOptionPane;

public class LogCalculator {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		
		// Displaying and intaking user input, checking to make sure that they do not enter improper input
		
		String userInput1 = JOptionPane.showInputDialog(null, "Enter in the log(x) you want to calc");
		String userInput2 = JOptionPane.showInputDialog(null, "Enter in the base you want to calc");
		
		
		// type casting user input into integers and giving them appropriate names
		int log = Integer.parseInt(userInput1);
		int base = Integer.parseInt(userInput2);
		
		
		while (log < 0 || base < 1) {
			do {
				userInput1 = JOptionPane.showInputDialog(null, "WRONG INPUT, Enter log");
				userInput2 = JOptionPane.showInputDialog(null, "WRONG INPUT, Re-enter base");
				
				// Re-updating variables
				log = Integer.parseInt(userInput1);
				base = Integer.parseInt(userInput2);
				
			} while (log < 0 && base < 1);
		}
		
		int counter=0; 
		
		for (int i=1; log>=base; i++) {
			log = log/base;
			counter++;
		}
		
		//Display Answer
		JOptionPane.showMessageDialog(null, "The answer to log" + userInput1 + " with a base of " + userInput2 + " is equal too approximately: " + counter);
		
		

	}

}
