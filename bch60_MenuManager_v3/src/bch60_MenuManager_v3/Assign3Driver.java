package bch60_MenuManager_v3;

import java.util.ArrayList;
import java.util.Scanner;


public class Assign3Driver {
	
	/*
	 * This is the driver file that actually allows for the classes that I have created for Assignment 3 to fucntion
	 * Acts a tester
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<Menu> menus = new ArrayList<Menu>();
		MenuManager userTest = new MenuManager("cd ..\\..\\data\\dishes.txt");
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please input the number of Menus that you would like to create below: ");
		
		int userInput = myObj.nextInt();
		
		System.out.println("You have chosen to generate " + userInput + " random menus, enjoy!");

		for (int i=0; i<userInput; i++) {
			Menu testMenu = MenuManager.randomMenu("Menu " + (i+1));
			menus.add(testMenu); // .get(index) .add(object)
			FileManager.writeMenus("cd ..\\..\\data\\WritingMenus.txt", menus);
		}

	}

}
