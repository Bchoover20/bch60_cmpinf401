package edu.pitt.lab2;

import javax.swing.JOptionPane;

public class DecomposingMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Initial Dispaly Statements
		JOptionPane.showMessageDialog(null, "Money Tabulator");
		
		String userInput = JOptionPane.showInputDialog(null,"Enter in the amount of money (between 1 - 9999)");
		
		// Turning string userInput into a integer
		int userInput_I = Integer.parseInt(userInput);
		
		// Using modulus to sort the users money () are important here
		int grands = userInput_I/1000;
		int benjamins = (userInput_I%1000)/100;
		int sawbucks = (((userInput_I%1000)%100)/10);
		int bucks = (((userInput_I%1000)%100)%10);

		// Displaying the results 
		JOptionPane.showMessageDialog(null,"Here is your money sorted: \n" + grands + " grands \n" 
				+ benjamins + " benjamins \n" + sawbucks + " sawbucks \n" + bucks + " bucks \n ");
	}
}