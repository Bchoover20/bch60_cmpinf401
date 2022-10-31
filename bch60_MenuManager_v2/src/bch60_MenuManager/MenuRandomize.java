package bch60_MenuManager;

import java.util.ArrayList;
import java.util.Random;

public class MenuRandomize {
	
	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;
	
	//public static String entreeFile="\\data\\entrees.txt";
	//public static String entreeFile="C:\\Users\\Brandon\\Documents\\GitHub\\bch60_cmpinf401\\bch60_MenuManager_v2\\data\\entrees.txt";
	//public static String sideFile="C:\\Users\\Brandon\\Documents\\GitHub\\bch60_cmpinf401\\bch60_MenuManager_v2\\data\\sides.txt";
	//public static String saladFile="C:\\Users\\Brandon\\Documents\\GitHub\\bch60_cmpinf401\\bch60_MenuManager_v2\\data\\salads.txt";
	//public static String dessertFile="C:\\Users\\Brandon\\Documents\\GitHub\\bch60_cmpinf401\\bch60_MenuManager_v2\\data\\desserts.txt";
	
	public MenuRandomize(String entreeFile,String sideFile, String saladFile, String dessertFile) {
		
		// initializing state and defining what the vars are 
		/*entreeFile = new String();
		sideFile = new String();
		saladFile = new String();
		dessertFile = new String();
		*/
	
		entrees = FileManager.readEntrees(entreeFile);
		sides = FileManager.readSides(sideFile);
		salads = FileManager.readSalads(saladFile);
		desserts = FileManager.readDesserts(dessertFile);
		
		//System.out.println(entreeFile); // because its a constructor not a function 
	
	}
	
	
	

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// RELATIVE FILE PATH NOT WORKING -- ASK PROF
		// are you even allowed to have a main -- ASK PROF 
		
		/*
		FileManager.readEntrees(entreeFile);
		FileManager.readSides(sideFile);
		FileManager.readSalads(saladFile);
		FileManager.readDesserts(dessertFile);
		*/
		
		// Look up a way to verify that the method is properly working
		
		
		//System.out.println(entreeList.get(2));
	//}
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
	
	

	public static void main(String[] args) {
		
		//System.out.println(MenuRandomize.randomMenu());
		
		
	
	}
}
