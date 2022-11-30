package bch60_MenuManager_v3;

/**
 * Class: Menu
 * @author Brandon Hoover
 * Created: 10/7/2022
*/
public class Menu {

	
	private String name;
	private Entree entree;
	private Side side;
	private Salad salad;
	private Dessert dessert;

	
	/**
	 * Constructor Menu
	 * @param String name  - The name of the menu object that is being created
	 * @return no return for a constructor 
	 */
	
	public Menu(String name){ 
		entree=null;
		side=null;
		salad=null;
		dessert=null;
	}
	
	/**
	 * Constructor Menu
	 * @param String name  - The name of the menu object that is being created
	 * @param Entree entree - Entree Item that is being used in the menu Object
	 * @param Side side - Side Item that is being used in the menu Object
	 * @return no return for a constructor
	 */
	
	public Menu (String name, Entree entree, Side side) {
		this.name=name;
		this.entree=entree;
		this.side=side;
	}
	/**
	 * Constructor Menu
	 * @param String name  - The name of the menu object that is being created
	 * @param Entree entree - Entree item that is being used in the menu Object
	 * @param Side side - Side item that is being used in the menu Object
	 * @param Salad salad - Salad item that is being used in the menu Object
	 * @param Dessert dessert - Dessert item that is being used in the menu Object
	 * @return no return for a constructor
	 */
	
	public Menu (String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name=name;
		this.entree=entree;
		this.side=side;
		this.salad=salad;
		this.dessert=dessert;
	}

	
	@Override
	public String toString() {
		return name;
	}
	
	
	/*
	 * I realize that there is a major error with this method but it fortunately still works
	 * Basically entree, side, and salad, and dessert, are always going to be null because when you are comparing them,
	 * they are object type data so there is nothing to compare. Which makes the if conditionals useless
	 */
	
	/**
	 * Method totalCalories
	 * @return returns the total calories of one of the randomly generated menus contained within ArrayList menus
	 */
	
	int totalCalories () {
		int entreeCal=0;
		int sideCal=0;
		int saladCal=0;
		int dessertCal=0;

		if (entree != null) {
			entreeCal = entree.calories;
		}
		if (side != null) {
			sideCal = side.calories;
		}
		if (salad != null) {
			saladCal = salad.calories;
		}
		if (dessert != null) {
			dessertCal = dessert.calories;
		}

		int totalCal= entreeCal + sideCal + saladCal + dessertCal;
		return totalCal;
	}
	
	/**
	 * Method totalPrice
	 * @return returns the total price of one of the randomly generated menus contained within ArrayList menus
	 */
	
	double totalPrice() {
		double entreePrice=entree.price;
		double sidePrice=side.price;
		double saladPrice=salad.price;
		double dessertPrice=dessert.price;
		
		double totalPrice = entreePrice + sidePrice + saladPrice + dessertPrice;
		return totalPrice;
	}
	
	/*

	String description() {

		String entreeDesc="Entree: N/A";
		String sideDesc="Side: N/A";
		String saladDesc="Salad: N/A";
		String dessertDesc="Dessert: N/A";

		if (entree != null) {
			entreeDesc = ("Entree: " + entree.getName() + "- " + entree.getDescription());
		}
		if (side != null) {
			sideDesc = ("Side: " + side.getName() + "- " + side.getDescription());
		}
		if (salad != null) {
			saladDesc = ("Salad: " + salad.getName() + "- " + salad.getDescription());
		}
		if (dessert != null) {
			dessertDesc = ("Dessert: " + dessert.getName() + "- " + dessert.getDescription());
		}

		String totalDesc = entreeDesc + "\n" + sideDesc + "\n" + saladDesc + "\n" + dessertDesc + "\n";

		return totalDesc;
	}
	*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Entree getEntree() {
		return entree;
	}

	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Salad getSalad() {
		return salad;
	}

	public void setSalad(Salad salad) {
		this.salad = salad;

	}

	public Dessert getDessert() {
		return dessert;
	}

	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}


}
