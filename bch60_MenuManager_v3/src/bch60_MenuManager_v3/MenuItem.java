package bch60_MenuManager_v3;

import java.util.ArrayList;

public class MenuItem {

	String name;
	String description;
	int calories;
	double price;
	
	

	public MenuItem (String name, String description, int calories, double price) {
		
		// constructors are used to initialize the state of an object 
		this.name = name;
		this.description = description;
		this.calories = calories;
		this.price = price;

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