package bch60_MenuManager_v3;

import java.util.ArrayList;
import java.util.Scanner;



/**
 * Class: Assign3Driver
 * @author Brandon Hoover
 * Created: 11/20/2022
 */

public class Assign3Driver {
	
	/*
	 * This is the driver file that actually allows for the classes that I have created for Assignment 3 to fucntion
	 * Acts a tester
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<Menu> menus = new ArrayList<Menu>();
		
		for (Menu element : menus) {
			System.out.println(element);
		}
		MenuManager userTest = new MenuManager("cd ..\\..\\data\\dishes.txt");
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please input the number of Menus that you would like to create below: ");
		
		int userInput = myObj.nextInt();
		
		System.out.println("You have chosen to generate " + userInput + " random menus, enjoy!");

		for (int i=0; i<userInput; i++) {
			Menu testMenu = MenuManager.randomMenu("Menu " + (i+1));
			menus.add(testMenu); // .get(index) .add(object)
			FileManager.writeMenus("cd ..\\..\\data\\WritingMenus.txt", menus);
			
			// if you are non static you need to call it with a new instance
			// if you are static you DONT need to call it with a new instance 
			// System.out.println its attatched to the system 
		}
		
		System.out.println("\n\nIf you are curious, the HIGHEST calorie menu that can be generated is the one shown below \n");
		Menu mostCal = MenuManager.maxCaloriesMenu("Highest Calorie menu: ");
		
		System.out.println(mostCal.getName() + "\n" +  mostCal.getEntree().name + "-" + mostCal.getEntree().description + "-" + mostCal.getEntree().calories + " calories -" + mostCal.getEntree().price);
		System.out.println(mostCal.getSide().name + "-" + mostCal.getSide().description + "-" + mostCal.getSide().calories + " calories -" + mostCal.getSide().price);
		System.out.println(mostCal.getSalad().name + "-" + mostCal.getSalad().description + "-" + mostCal.getSalad().calories + " calories -" + mostCal.getSalad().price);
		System.out.println(mostCal.getDessert().name + "-" + mostCal.getDessert().description + "-" + mostCal.getDessert().calories + " calories -" + mostCal.getDessert().price);
		
		System.out.println("\nThat massive meal brings us to a maximum calories of: " + mostCal.totalCalories());
		
		System.out.println("\n\nIf you are curious, the LOWEST calorie menu that can be generated is the one shown below \n");
		Menu minCal = MenuManager.minCaloriesMenu("Lowest Calorie menu: ");
		
		System.out.println(minCal.getName() + "\n" +  minCal.getEntree().name + "-" + minCal.getEntree().description + "-" + minCal.getEntree().calories + " calories -" + minCal.getEntree().price);
		System.out.println(minCal.getSide().name + "-" + minCal.getSide().description + "-" + minCal.getSide().calories + " calories -" + minCal.getSide().price);
		System.out.println(minCal.getSalad().name + "-" + minCal.getSalad().description + "-" + minCal.getSalad().calories + " calories -" + minCal.getSalad().price);
		System.out.println(minCal.getDessert().name + "-" + minCal.getDessert().description + "-" + minCal.getDessert().calories + " calories -" + minCal.getDessert().price);
		
		System.out.println("\nThat tiny meal brings us to a minimum calories of: " + minCal.totalCalories());
		
	}

}
