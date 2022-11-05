package bch60_MenuManager;

import java.util.ArrayList;
import java.util.Random;

public class MenuRandomize {

	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;

	public MenuRandomize(String entreeFile,String sideFile, String saladFile, String dessertFile) {

		/*entreeFile = new String();
		sideFile = new String();
		saladFile = new String();
		dessertFile = new String();
		 */

		entrees = FileManager.readEntrees(entreeFile);
		sides = FileManager.readSides(sideFile);
		salads = FileManager.readSalads(saladFile);
		desserts = FileManager.readDesserts(dessertFile);

		//System.out.println(entreeFile); // wont work because its a constructor not a function 

	}

	/**
	 * Method randomMenu
	 * @param String fileName - relative file path that path should be set too
	 * @return entreeList - Array list of type Entree that contains the possible list of entrees
	 * that could be used on the menu from entrees.txt
	 */
	
	public Menu randomMenu() {

		Random randoNum = new Random();

		int entreeRandoNum = randoNum.nextInt(5);
		int	sideRandoNum = randoNum.nextInt(5);
		int saladRandoNum = randoNum.nextInt(5);
		int dessertRandoNum = randoNum.nextInt(5);

		Menu randomizedMenu = new Menu("Here is your menu for tonight, pls enjoy" , entrees.get(entreeRandoNum),sides.get(sideRandoNum), salads.get(saladRandoNum), desserts.get(dessertRandoNum));

		//System.out.println(Menu);//
		return randomizedMenu;
	}


}
