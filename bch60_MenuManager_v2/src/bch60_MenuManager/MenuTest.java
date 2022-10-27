package bch60_MenuManager;

/**
 * Class Salad
 * @author Brandon Hoover
 * created: 10/7/2022
 */
public class MenuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating instances of each type of object that need in order to call class object Menu

		Entree Crepe = new Entree("Strawberry Crepe", "A thin, flaky textured pancake, that is filled with "
				+ " cream cheese and topped with fresh strawberries", 475);
		Side HomeFries = new Side("HomeFries", "Full helping of Hash-browns ", 245);

		Menu FirstMenu = new Menu("Breakfast Menu Option", Crepe, HomeFries);

		System.out.println("\n\b " + FirstMenu.getName());
		System.out.println(FirstMenu.description());
		System.out.println("The total Calories for this entire meal is: " + FirstMenu.totalCalories());

		Entree Bacon_Burger = new Entree("Bacon Burger", "A delicious slab of meat topped with sizziling bacon, lettuce, mayo," 
				+ "all contained within a toasted brioche bun", 650);
		Side FrenchFries = new Side("French Fries", " A helping of tasty beer-battered fries" , 280);
		Salad HouseSalad = new Salad("House Salad", "A fresh mixed salad topped with an Italian vinegarratte ", 165);
		Dessert KeyLime = new Dessert("Key Lime Pie", "A classic fluffy, airy, dessert topped with whip-cream" , 290);

		Menu SecondMenu = new Menu("Dinner Menu Option", Bacon_Burger , FrenchFries, HouseSalad, KeyLime);

		System.out.println("\n\b " + SecondMenu.getName());
		System.out.println(SecondMenu.description());
		System.out.println("The total Calories for this entire meal is: " + SecondMenu.totalCalories());

		// Some extra objects I made because I got carried away with the amount we were supposed to make
		//Dessert CinnamonRoll = new Dessert("Cinnamon Roll","sweet baked cinnamon dough roll that is covered a delicious"
		//		+ "vanilla icing", 325);
		/*
		 * Salad CaesarSalad = new Salad("Ceasar Salad", "Fresh cut lettuce with carrots, tomatoes, and "
				+ "ceasar style dressing", 100);
		 */
	}


}
