package bch60_MenuManager_v3;

/**
 * Class Entree
 * @author Brandon Hoover
 * created: 10/7/2022
 */

public class Entree extends MenuItem {

	
	// The Constructor for class Entree
	public Entree (String name, String description, int calories, double price) {
	
		// You are calling the super Constructor in Menu Item to initialize the state of the object within class Entree
		super(name,description,calories,price);
		
		
	}
}