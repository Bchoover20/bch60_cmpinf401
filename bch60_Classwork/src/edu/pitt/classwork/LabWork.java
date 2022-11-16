package edu.pitt.classwork;

import java.io.Console;

public class LabWork {

	int year;
	String color;
	String engine;
	


	
public LabWork (int year, String s, String e) {
	this.year = year;
	
	
	// Thisi s code that I tried to use to solve lab 8 in very UNIQUE way because I did not properly grasp how to do it
	// This is a way to read console output and use it as data, not sure how useful it is but interesting regardless
	Console cnsl = System.console();
	
	while (cnsl != null) {
		String tempLine = cnsl.readLine();
		
		String[] splitLine = tempLine.split(",");
		
		// parse that int 
		int tempInt = Integer.parseInt(splitLine[1]);
		// Adding the time that has been split from splitLine
		timeData.add(tempInt);
		
		for (int element : timeData) {
			
			if (timeData.get(element) < timeData.get(element+1)) {
				rightSpot = element;
			}
		}
	}
	
	}

}
