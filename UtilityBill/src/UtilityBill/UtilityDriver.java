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
	double Brandon = electric;
	double Jerod = gas;
	double Shu_Yuan = internet;
	double Brian = water;
	double Jack = 0;
	
	// magicNum is the var that if you would split the total cost evenely thats what it would cost
	double subCost=0;
	double magicNum=0;
	double aditionalAmount=0;
	
	
	
	System.out.println(gas);
	System.out.println(water);
	System.out.println(electric);
	System.out.println(internet);
	
	
	// Array of given utilities
	double[] utilities = {gas, water, electric, internet};
	
	for(int i=0; i<4; i++) {
		
		 utilities[i] = utilities[i]/4;
		 
		 utilities[i] += magicNum;
		 
		 System.out.println(magicNum);
		
	}
	
	// for += operator x = x + y
	
	double[] roomates = {Brandon, Jerod, Shu_Yuan, Brian, Jack};
	
	for (int i=0; i<5; i++) {
		roomates[i] = (roomates[i] - magicNum);
		
		if (roomates[i] > 0) {
			aditionalAmount +=  roomates[i];
		}
	
	}
	
	System.out.println("Additional Amount that should be payed back to roomates: " + aditionalAmount);
	
	for (int i=0; i<5; i++) {
		
	}
		
	}
	
	
	

	}


