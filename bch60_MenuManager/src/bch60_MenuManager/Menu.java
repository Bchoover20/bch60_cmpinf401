package bch60_MenuManager;

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
	
	public Menu(){ // Do I need to pass String name through here
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
	
	int totalCalories () {
		
		int entreeCal = entree.getCalories();
		int sideCal = side.getCalories();
		int saladCal = salad.getCalories();
		int dessertCal = dessert.getCalories();
		
		int totalCal= entreeCal + sideCal + saladCal + dessertCal;
		return totalCal;
	}
	
	String description() {
		
		String entreeDesc = entree.getDescription();
		String sideDesc = side.getDescription();
		String saladDesc = salad.getDescription();
		String dessertDesc = dessert.getDescription();
		
		String totalDesc = entreeDesc + "\n" + sideDesc + "\n" + saladDesc + "\n" + dessertDesc;
		
		return totalDesc;
	}

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
