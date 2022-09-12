package edu.pitt.classwork;

import javax.swing.JOptionPane;

public class ClassWorkFor401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput = JOptionPane.showInputDialog(null, "Please enter a number: ");
		
		int userInputInt = Integer.parseInt(userInput); //parse int turns an int into a string through typecasting
		
		// Normal Syntax
		if (userInputInt == 7) {
			System.out.println("Lucky Number");
		}
		else {
			System.out.println("Pick another number");
		}
		
		//Boolean also check profs github
		int i = 7;
		System.out.println(i==7);
		
		boolean result = false;
		
		boolean isSkyBlue = true;
		System.out.println("Sky is blue: " + isSkyBlue);
		System.out.println("Sky is NOT blue: " + !isSkyBlue);
		
		// More conditional 
		int userInputNum = Integer.parseInt(userInput);
		System.out.println(userInputNum%2); //tells if it is even or odd, modulus
		
		if(userInputNum%2 == 0) // Similar to python in that the line under still works but only the first line 
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		// Comparing Strings
		
		String s1 = "hello";
		String s2 = "hello";
		
		if(s1 == s2) {
			System.out.println("Eqal");
		}
		
		// s1 = ['h', 'e', 'l', 'l', 'o']
		
		// Better way to compare strings, built in method that works backwards compatibility wise
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("equals");
		}
	/*
	 * 	/*	
		// Seperating the two numbers by using substrings
		String Input_sub1 = Input_s.substring(0,1);
		String Input_sub2 = Input_s.substring(1,2);
		
	 * 
	 * 
		int myNumber = askInteger();
		if(checkLuckyNumber(myNumber)) {
			System.out.println("This is ")
	*/
		
		
	}

}
