package bch60_MenuManager_v3;

import java.util.ArrayList;
import java.util.Random;

public class MenuManager {

	static ArrayList<Entree> entrees = new ArrayList<Entree>();
	static ArrayList<Side> sides = new ArrayList<Side>();
	static ArrayList<Salad> salads = new ArrayList<Salad>();
	static ArrayList<Dessert> desserts = new ArrayList<Dessert>();
	
	// The Sides are included into the meal at no extra cost because the entrees themselves are so expensive
	
	public MenuManager (String dishesFile) {
		
		if (dishesFile==null) {
			dishesFile = "cd ..\\..\\data\\dishes.txt";
		}
		/*
		dishesFile = "dishes.txt";
		usingReadItems(dishesFile);
		
		MenuManager.usingReadItems("cd ..\\..\\data\\dishes.txt");
		randomMenu("A beutiful surprise");
		*/
	}
	
	
	public static void usingReadItems (String filename) {
		
		ArrayList<MenuItem> returnedList = new ArrayList<MenuItem>();
		
		String path = filename;
		//FileManager fileManager = new FileManager();
		returnedList = FileManager.readItems(path);
		
		//System.out.println(returnedList.get(0));
		
		

		int counter=0;
		for (MenuItem element : returnedList) {
			
		//	String typeClass = thefile.getClass();
		//	System.out.println(thefile.get(counter).getClass().toString());
			
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
		/* Verification Checks
		for (Entree element : entrees) {
			System.out.println(element.description);
		}
		for (Side element : sides) {
			System.out.println(element);
		}
		*/ 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuManager.usingReadItems("cd ..\\..\\data\\dishes.txt");
		ArrayList<Menu> menus = new ArrayList<Menu>();
		
		
		System.out.println("Please input the number of Menus that you would like to create");
		
		for (int i=0; i<3; i++) {
			Menu testMenu = randomMenu("Menu " + (i+1));
			menus.add(testMenu); // .get(index) .add(object)
			FileManager.writeMenus("cd ..\\..\\data\\WritingMenus.txt", menus);
		}
	}
	// Verification Checks
	//System.out.println(testMenu.getSalad());
	//System.out.println(menus.get(0).getEntree().description);
	//menus.a(testMenu.getName(), testMenu.getEntree(), testMenu.getSide(), 
	//testMenu.getSalad(), testMenu.getDessert());

	public static Menu randomMenu(String name) {

		Random randoNum = new Random();

		int entreeRandoNum = randoNum.nextInt(4);
		int	sideRandoNum = randoNum.nextInt(4);
		int saladRandoNum = randoNum.nextInt(4);
		int dessertRandoNum = randoNum.nextInt(4);

		Menu randomizedMenu = new Menu(name , entrees.get(entreeRandoNum),sides.get(sideRandoNum), salads.get(saladRandoNum), desserts.get(dessertRandoNum));

		
		return randomizedMenu;
	}
	
	/*
	 * I implemented the total Calories from 
	 */
	

	

}
