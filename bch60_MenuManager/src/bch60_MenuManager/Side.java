package bch60_MenuManager;

/**
 * Class: Entree
 * @author Brandon Hoover
 * Created: 09/23/2022
 */

public class Side {

	private String name;
	private String description;
	private int calories;
	
	public Side (String name, String description, int calories) {
		this.name = name;
		this.description = description;
		this.calories = calories;
	}
	
	// Does this differentiate because of the static void? Nemo 
	public static void Side (String name, String description, int calories) {
		
		System.out.println("Am initializing instances of objects here or in Main, what does this method do?");
		
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
