package bch60_MenuManager_v3;

/**
 * Class Salad
 * @author Brandon Hoover
 * created: 10/7/2022
 */

public class Salad extends MenuItem {

	/**
	 * Constructor Salad
	 * - individual object in the menu that has all of the properties as parent class Menu 
	 * @param name - string, name of the salad, 
	 * @param description - String, description of the salad
	 * @param calories - int, number of calories for this salad
	 * @param price - double, price of salad 
	 */

	public Salad ( String name, String description, int calories, double price) {
	
		super(name, description,calories, price);
	}



}
