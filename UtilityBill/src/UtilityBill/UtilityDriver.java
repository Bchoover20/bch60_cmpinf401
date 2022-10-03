package UtilityBill;

import java.util.Scanner; // system input


public class UtilityDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner myObj = new Scanner(System.in);
	
	System.out.println("Enter in amount for Gas, Water, Electric, and Internet");
	
	// Collecting and sorting the utilites by name
	double gas = myObj.nextDouble();
	double water = myObj.nextDouble();
	double electric = myObj.nextDouble();
	double internet = myObj.nextDouble();
	
	// Assigning the correct utilities to the person that payed them
	double Jerod = gas;
	double Brian = water;
	double Brandon = electric;
	double Shu_Yuan = internet;
	double Jack = 0;
	
	// magicNum is the var that if you would split the total cost evenely thats what it would cost
	double magicNum=0;
	
	// Array of given utilities and calculating the eqaul amount that each person should pay for the month
	double[] utilities = {gas, water, electric, internet};
	
	for(int i=0; i<4; i++) {
		
		 utilities[i] = utilities[i]/5;
		 magicNum += utilities[i];
	}
	
	System.out.println("The amount that everyone should contributed this month is: " + (int) magicNum + " dollars");
	// for += operator x = x + y
	
	// Indicing through the roomates to see who needs money back
	String[] roomateString = { "Jerod", "Brian", "Brandon", "Shu_Yuan", "Jack"};
	double[] roomates = {Jerod, Brian, Brandon, Shu_Yuan, Jack};
	//int [] roomatesFinal = {0,0,0,0,0};
	//int setLimit = (int) (0 - magicNum);
	
	for (int i=0; i<5; i++) {
		roomates[i] = (roomates[i] - magicNum);
		
		if (roomates[i] >= 0) {
			int roomatesFinal = (int) roomates[i];
			System.out.println(roomateString[i] + " needs to be payed: " + roomatesFinal + " dollars");
		}
		else if(roomates[i] < 0 ) {
			int roomatesFinal = (int) roomates[i]*-1;
			System.out.println(roomateString[i] + " needs to pay: " + roomatesFinal + " dollars");
		}
	}
}
}

