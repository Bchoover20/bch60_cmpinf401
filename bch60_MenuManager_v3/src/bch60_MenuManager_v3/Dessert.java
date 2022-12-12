package bch60_MenuManager_v3;

/**
 * Class Dessert
 * @author Brandon Hoover
 * created: 10/7/2022
 */

public class Dessert extends MenuItem {

	/**
	 * Constructor Dessert
	 * - individual object in the menu that has all of the properties as parent class Menu 
	 * @param name - string, name of the dessert 
	 * @param description - String, description of the dessert
	 * @param calories - int, number of calories for this dessert
	 * @param price - double, price of dessert
	 */
	public Dessert (String name, String description, int calories, double price) {
	// Initializing the state of the variables in the constructor
	super(name,description,calories, price);
	
	}



}
