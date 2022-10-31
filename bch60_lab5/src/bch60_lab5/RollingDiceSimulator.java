package bch60_lab5;


import java.util.Scanner; // system input
import java.util.Random;

public class RollingDiceSimulator {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int prompt=0;
		
		do {
			Scanner userInput = new Scanner(System.in);
	
			System.out.println("How many times would you like to perform the rolling dice experiment?");
			int timesRolled = userInput.nextInt();
			
			
			rollDice(timesRolled, new Random());
			
			System.out.println("Experiment concluded, would you like to continue? If so, Input any NUMBER other than '2'");
			Scanner userInput2 = new Scanner(System.in);
			prompt = userInput2.nextInt();
			
		} while (prompt !=2);
		
		System.out.println("You have chosen to exit the program have a nice day!");
		
		
	}

	public static void rollDice (int timesRolled, Random randomNum) {

		// Setting up an array to store each roll for the amount of times the user has chose
		int[] rollData = new int[timesRolled];
		//System.out.println(timesRolled);
		
		for (int i=0; i<timesRolled; i++) {
			
			// Rolling the Dice
			int roll1 = (randomNum.nextInt(6) + 1);
			int roll2 = (randomNum.nextInt(6) + 1);
			
			// Adding each die to get the roll
			int theRoll = roll1 + roll2;
			rollData[i] = theRoll;
			
			//System.out.println(rollData[i]);
		}
		
		// Array that is going to be used to calculate the percentage of each number in rollData[] occurring
		double[] percentage = new double[11];
		
		//For loop to go through each indice of rollData 
		for (int i=0; i<timesRolled; i++) {
			// Needed check each indice of rollData of which Dice roll occurred for comparrison
			int j=0;
			do {
				// Check to see if rollData is equal to whichever number j is set to during the while loop, resets after 1-12 has been checked
				if (rollData[i]== j) {
					// Adding one to each occurrence of number, must subtract 2 to get it in the right spot
					percentage[j-2]++;
				}
				j++;
			}while (j<=12); 
	
		}	
		
		//Initializing counter for System out to get Dice roll right
		int counter=1;
		for (int i=0; i<11; i++) {
			percentage[i] = percentage[i]/timesRolled;
			percentage[i] = percentage[i]*100;
			counter++;
			
			System.out.println("The dice rolled a combined " + counter + " approimately " + percentage[i] + " percent of the time. Out of " + timesRolled + " rolls");
		}
	}
	
	
	
}
