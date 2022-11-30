package bch60_MenuManager_v3;

import java.util.ArrayList;


/**
 * Class: FileManager
 * @author Brandon Hoover
 * Created: 11/15/2022
 */

public class MenuItem {

	String name;
	String description;
	int calories;
	double price;
	
	/**
	 * Constructor MenuItem
	 * @param String name  - The name of the menuItem object that is being created
	 * @param String description - The description of the menuItem object that is being created
	 * @param int calories - The set calaories of the menuItem object that is being created
	 * @param double price - The set price the menuItem object that is being created
	 * @return no return for a constructor 
	 */
	

	public MenuItem (String name, String description, int calories, double price) {
		
		// constructors are used to initialize the state of an object 
		this.name = name;
		this.description = description;
		this.calories = calories;
		this.price = price;

		// Trick to remember
		// this.name <-- name
		// this.description <-- description
		// this.calories <-- calories 
		// this.price <-- price
	}
	
	
	@Override
	public String toString() {
		return name;
	}



	private String getName() {
		return name;
	}



	private void setName(String name) {
		this.name = name;
	}



	private String getDescription() {
		return description;
	}



	private void setDescription(String description) {
		this.description = description;
	}



	private int getCalories() {
		return calories;
	}



	private void setCalories(int calories) {
		this.calories = calories;
	}



	private double getPrice() {
		return price;
	}



	private void setPrice(double price) {
		this.price = price;
	}

}