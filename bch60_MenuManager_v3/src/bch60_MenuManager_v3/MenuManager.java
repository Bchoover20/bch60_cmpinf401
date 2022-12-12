package bch60_MenuManager_v3;

import java.util.ArrayList;
import java.util.Random;



/**
 * Class: MenuManager
 * @author Brandon Hoover
 * Created: 11/15/2022
 */

public class MenuManager {

	private static ArrayList<Entree> entrees = new ArrayList<Entree>();
	private static ArrayList<Side> sides = new ArrayList<Side>();
	private static ArrayList<Salad> salads = new ArrayList<Salad>();
	private static ArrayList<Dessert> desserts = new ArrayList<Dessert>();

	// IMPORTANT --- The Sides are included into the meal at no extra cost because the entrees themselves are so expensive

	/**
	 * Constructor MenuManager
	 * @param dishesFile - String - Relative filepath for data that will be read 
	 */

	public MenuManager (String dishesFile) {

		if (dishesFile==null) {
			dishesFile = "cd ..\\..\\data\\dishes.txt";
		}
		
		usingReadItems(dishesFile);

	}

	/**
	 * Method usingReadItems
	 * - Essentially as suggested this method functions as a way to implement readItems method and 
	 * sort through the MenuItem Array List into other array List of its object type, such as Entree, Side, Salad, or Dessert.
	 * @param fileName - String - relative file path that path should be set too
	 */

	public void usingReadItems (String filename) {

		ArrayList<MenuItem> returnedList = new ArrayList<MenuItem>();

		String path = filename;
		returnedList = FileManager.readItems(path);

		int counter=0;
		for (MenuItem element : returnedList) {

			if (returnedList.get(counter).getClass().toString().equals("class bch60_MenuManager_v3.Entree")) {
				//System.out.println("Sucess! its an entree " + (counter+1));
				entrees.add((Entree) element);
			}
			else if (returnedList.get(counter).getClass().toString().equals("class bch60_MenuManager_v3.Side")) {
				//System.out.println("success! its a side " + counter);
				sides.add((Side) element);
			}
			else if (returnedList.get(counter).getClass().toString().equals("class bch60_MenuManager_v3.Salad")) {
				//System.out.println("success! its a salad " + counter);
				salads.add((Salad) element);
			}
			else if (returnedList.get(counter).getClass().toString().equals("class bch60_MenuManager_v3.Dessert")) {
				//System.out.println("success! its a dessert " + counter);
				desserts.add((Dessert) element);
			}
			else {
				System.out.println("OOPS" + counter);
			}
			counter++;
		}

	}

	/**
	 * Method randomMenu
	 * @param name, string, name of the menu that is going to be randomly generated
	 * @return randomizedMenu - a randomly generated (menu)object of type menu using the sorted ArrayLists that
	 * have been created within MenuManager class 
	 */

	public static Menu randomMenu(String name) {

		Random randoNum = new Random();

		int entreeRandoNum = randoNum.nextInt(4);
		int	sideRandoNum = randoNum.nextInt(4);
		int saladRandoNum = randoNum.nextInt(4);
		int dessertRandoNum = randoNum.nextInt(4);

		Menu randomizedMenu = new Menu(name, entrees.get(entreeRandoNum),sides.get(sideRandoNum), salads.get(saladRandoNum), desserts.get(dessertRandoNum));

		return randomizedMenu;
	}
	/**
	 * Method maxCaloriesMenu
	 * - reads through the arrayLists contained within MenuManager class and generates the highest calories menu 
	 * using multiple for loops
	 * - type Menu
	 * @param name - String - name of the highest calories menu that you are generating
	 * @return the generated Maximum Calories Menu 
	 */
	public static Menu maxCaloriesMenu(String name) {
		int calSaver=0;
		int entreeIndex = 0;
		int sideIndex = 0;
		int saladIndex = 0;
		int dessertIndex = 0;
		
		
		for (int i=0; i<entrees.size(); i++) {
			if (entrees.get(i).calories > calSaver ) {
				calSaver = entrees.get(i).calories;
			}
		}
		for (int i=0; i<entrees.size(); i++) {
			if (entrees.get(i).calories == calSaver ) {
				 entreeIndex = i;
			}
		}
		calSaver = 0;
		for (int i=0; i<sides.size(); i++) {
			if (sides.get(i).calories > calSaver ) {
				calSaver = sides.get(i).calories;
			}
		}
		for (int i=0; i<sides.size(); i++) {
			if (sides.get(i).calories == calSaver ) {
				 sideIndex = i;
			}
		}
		calSaver = 0;
		for (int i=0; i<salads.size(); i++) {
			if (salads.get(i).calories > calSaver ) {
				calSaver =	salads.get(i).calories;
			}
		}
		for (int i=0; i<salads.size(); i++) {
			if (salads.get(i).calories == calSaver ) {
				 saladIndex = i;
			}
		}
		calSaver = 0;
		for (int i=0; i<desserts.size(); i++) {
			if (desserts.get(i).calories > calSaver ) {
				calSaver = desserts.get(i).calories;
			}
		}
		for (int i=0; i<desserts.size(); i++) {
			if (desserts.get(i).calories == calSaver ) {
				 dessertIndex = i;
			}
		}
		
		Menu maxCal = new Menu("The Highest Calorie Menu: ", entrees.get(entreeIndex), sides.get(sideIndex), salads.get(saladIndex), desserts.get(dessertIndex));
		
		return maxCal;
	}
	/**
	 * Method minCaloriesMenu
	 * - reads through the arrayLists contained within MenuManager class and generates the lowest calories menu 
	 * using multiple for loops
	 * - type Menu
	 * @param name - String - name of the lowest calories menu that you are generating
	 * @return the generated lowest calories menu
	 */
	public static Menu minCaloriesMenu(String name) {
		int calSaver=2000; // Must be very large to get the if conditional iterator to properly start
		int entreeIndex = 0;
		int sideIndex = 0;
		int saladIndex = 0;
		int dessertIndex = 0;
		
		
		for (int i=0; i<entrees.size(); i++) {
			if (entrees.get(i).calories < calSaver ) {
				calSaver = entrees.get(i).calories;
			}
		}
		for (int i=0; i<entrees.size(); i++) {
			if (entrees.get(i).calories == calSaver ) {
				 entreeIndex = i;
			}
		}
		calSaver = 2000;
		for (int i=0; i<sides.size(); i++) {
			if (sides.get(i).calories < calSaver ) {
				calSaver = sides.get(i).calories;
			}
		}
		for (int i=0; i<sides.size(); i++) {
			if (sides.get(i).calories == calSaver ) {
				 sideIndex = i;
			}
		}
		calSaver = 2000;
		for (int i=0; i<salads.size(); i++) {
			if (salads.get(i).calories < calSaver ) {
				calSaver =	salads.get(i).calories;
			}
		}
		for (int i=0; i<salads.size(); i++) {
			if (salads.get(i).calories == calSaver ) {
				 saladIndex = i;
			}
		}
		calSaver = 2000;
		for (int i=0; i<desserts.size(); i++) {
			if (desserts.get(i).calories < calSaver ) {
				calSaver = desserts.get(i).calories;
			}
		}
		for (int i=0; i<desserts.size(); i++) {
			if (desserts.get(i).calories == calSaver ) {
				 dessertIndex = i;
			}
		}
		
		Menu minCal = new Menu("The Lowest Calorie Menu: ", entrees.get(entreeIndex), sides.get(sideIndex), salads.get(saladIndex), desserts.get(dessertIndex));
		
		return minCal;
	}

	public ArrayList<Entree> getEntrees() {
		return entrees;
	}

	public void setEntrees(ArrayList<Entree> entrees) {
		MenuManager.entrees = entrees;
	}

	public ArrayList<Side> getSides() {
		return sides;
	}

	public void setSides(ArrayList<Side> sides) {
		MenuManager.sides = sides;
	}

	public ArrayList<Salad> getSalads() {
		return salads;
	}

	public void setSalads(ArrayList<Salad> salads) {
		MenuManager.salads = salads;
	}

	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}

	public void setDesserts(ArrayList<Dessert> desserts) {
		MenuManager.desserts = desserts;
	}

	

	
	
	// Verification Checks
	//System.out.println(testMenu.getSalad());
	//System.out.println(menus.get(0).getEntree().description);
	//menus.a(testMenu.getName(), testMenu.getEntree(), testMenu.getSide(), 
	//testMenu.getSalad(), testMenu.getDessert());

	/* More Verification Checks
	for (Entree element : entrees) {
		System.out.println(element.description);
	}
	for (Side element : sides) {
		System.out.println(element);
	}
	 */ 

	/* Useless garbage I put in the constructor
	dishesFile = "dishes.txt";
	usingReadItems(dishesFile);

	MenuManager.usingReadItems("cd ..\\..\\data\\dishes.txt");
	randomMenu("A surprise");
	 */

	/*
	 * Verification within method UsingReadItems
	 * If one thing is static then it seems like it all has to be static within the file
	 * System.out.println(returnedList.get(0));
	 * String typeClass = thefile.getClass();
	 * System.out.println(thefile.get(counter).getClass().toString());
	 */
	
	


}
