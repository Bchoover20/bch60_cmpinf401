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

	
	public Menu(String name){ // Do I need to pass String name through here
		entree=null;
		side=null;
		salad=null;
		dessert=null;
	}
	
	public Menu (String name, Entree entree, Side side) {
		this.name=name;
		this.entree=entree;
		this.side=side;
	}
	

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
	int totalCalories () {
		int entreeCal=0;
		int sideCal=0;
		int saladCal=0;
		int dessertCal=0;

		if (entree != null) {
			entreeCal = entree.getCalories();
		}
		if (side != null) {
			sideCal = side.getCalories();
		}
		if (salad != null) {
			saladCal = salad.getCalories();
		}
		if (dessert != null) {
			dessertCal = dessert.getCalories();
		}

		int totalCal= entreeCal + sideCal + saladCal + dessertCal;
		return totalCal;
	}
	

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
