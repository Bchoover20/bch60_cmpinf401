package bch60_MenuManager_v3;

/**
 * Class Entree
 * @author Brandon Hoover
 * created: 10/7/2022
 */

public class Entree extends MenuItem {

	/**
	 * Constructor Entree
	 * - individual object in the menu that has all of the properties as parent class Menu 
	 * @param name - string, name of the entree, 
	 * @param description - String, description of the entree
	 * @param calories - int, number of calories for this entree
	 * @param price - double, price of entree
	 */
	public Entree (String name, String description, int calories, double price) {
	
		// You are calling the super Constructor in Menu Item to initialize the state of the object within class Entree
		super(name,description,calories,price);
		
		
	}
}