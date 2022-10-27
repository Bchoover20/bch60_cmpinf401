package bch60_MenuManager;

/**
 * Class Entree
 * @author Brandon Hoover
 * created: 10/7/2022
 */

public class Entree {

	private String name;
	private String description;
	private int calories;

	// The Constructor for class Entree
	public Entree ( String name, String description, int calories) {
		this.name = name;
		this.description = description;
		this.calories = calories;

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
