package bch60_lab3;

import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Displaying project interface
		JOptionPane.showMessageDialog(null, "Alternaiting Unit Converter! ");
		
		
		// Taking user input and saving it as a string
		String userInput = JOptionPane.showInputDialog(null, "Input a distance or weight amount ");
		
		int whiteSpace = 0;
		// Looking for the space where the seperation between the number and the units 
		// Source that helped me find the right method for my idea: https://stackoverflow.com/questions/4067809/how-can-i-find-whitespace-in-a-string
		for (int i = 0; i < userInput.length(); i++) {
			if (Character.isWhitespace(userInput.charAt(i))) {	
				whiteSpace = i;	
			}
		}
		// Using the saved whitespace var to seperate string input must 
		
		String units = userInput.substring((whiteSpace+1), userInput.length());
		String number =  userInput.substring(0, (whiteSpace));
	
		// Parsing the string into a double
		Double numberD = Double.parseDouble(number);
		
		// Creating a switch statements that interprets string units to decide which proper alternate unit to convert too and then do so
		// Also changes the var units to the proper unit that is has been changed too 
		switch (units) {
		
		case "in" : 
			numberD = numberD * 2.54;
			units = "cm";
			break;
		case "cm" : 
			numberD = numberD / 2.54;
			units = "in";
			break;
		case "yd" : 
			numberD = (numberD / 1.094);
			units = "m";
			break;
		case "m" : 
			numberD = numberD * 1.094;
			units = "yd";
			break;
		case "oz": 
			numberD = numberD * 28.35;
			units = "gm";
			break;
		case "gm":
			numberD = numberD / 28.35;
			units = "oz";
			break;
		case "lb":
			numberD = numberD / 2.205;
			units = "kg";
			break;
		case "kg":
			numberD = numberD * 2.205;
			units = "lb";
			break;
		}
		
		// Rounding numberD to 
		numberD = (numberD * 100);
		int numberDRound= (int)Math.round(numberD);
		Double numberTemp = Double.valueOf(numberDRound);
		numberD = numberTemp/100;
		
		// Final Display Output
		
		JOptionPane.showMessageDialog(null, "The alternate unit for " + userInput + " is " + numberD + " "
				+ units +  ". ");
		
	}

}


