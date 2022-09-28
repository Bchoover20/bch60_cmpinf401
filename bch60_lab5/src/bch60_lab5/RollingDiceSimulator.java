package bch60_lab5;


import java.util.Scanner; // system input
import java.util.Random;

public class RollingDiceSimulator {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		rollDice (1, new Random(), new Random());

	}

	public static void rollDice (int timesRolled, Random randomNum1, Random randomNum2) {
		
		
		System.out.println(timesRolled);
		System.out.println(randomNum1);
		
		
		int roll1 = (randomNum1.nextInt(6) + 1);
		int roll2 = (randomNum2.nextInt(6) + 1);
		
		System.out.println(roll1);
		System.out.println(roll2);
	
		int theRoll = roll1 + roll2;
	}
	
	// int roll = rand.nextInt(bound: 6) + 1 
	// 6 is exclusive so you have to add one because it would end at 6
	
	// Scanner input = new Scanner(System.in);
	
	// input.nextLine(); // they want to continue 
	
	// rollDice ( 10000 number of times , new Random) ;
	
	// next line in scanner
	
	// new Scanner(System.in);
	
	
	
}
