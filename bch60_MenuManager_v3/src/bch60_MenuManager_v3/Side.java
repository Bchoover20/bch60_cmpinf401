package bch60_MenuManager_v3;

/**
 * Class: Entree
 * @author Brandon Hoover
 * Created: 09/23/2022
 */

public class Side extends MenuItem {

	/**
	 * Constructor Side
	 * - object in the menu that has all of the properties as parent class Menu 
	 * @param name - string, name of the side, 
	 * @param description - String, description of the side
	 * @param calories - int, number of calories for this side
	 * @param price - double, price of side 
	 */

	public Side (String name, String description, int calories, double price) {
		
		super(name, description, calories, price);
	}


}
