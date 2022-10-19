package bch60_MenuManager;

/**
 * Class Dessert
 * @author Brandon Hoover
 * created: 10/7/2022
 */

public class Dessert {

	private String name;
	private String description;
	private int calories;
	
	public Dessert (String name, String description, int calories) {
		
		// Initializaing the state of the variables in the constructor
		this.name="";
		this.name="";
		this.calories=0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	
	
	
}
