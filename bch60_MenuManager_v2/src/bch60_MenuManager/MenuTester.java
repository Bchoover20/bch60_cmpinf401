package bch60_MenuManager;

public class MenuTester {

		public static void main(String[] args){
			MenuRandomize randomize = new MenuRandomize("C:\\Users\\Brandon\\Documents\\GitHub\\bch60_cmpinf401\\bch60_MenuManager_v2\\data\\entrees.txt",
					"C:\\Users\\Brandon\\Documents\\GitHub\\bch60_cmpinf401\\bch60_MenuManager_v2\\data\\sides.txt","C:\\Users\\Brandon\\Documents\\GitHub\\bch60_cmpinf401\\bch60_MenuManager_v2"
							+ "\\data\\salads.txt","C:\\Users\\Brandon\\Documents\\GitHub\\bch60_cmpinf401\\bch60_MenuManager_v2\\data\\desserts.txt");
			Menu myMenu = randomize.randomMenu();
			System.out.println(myMenu.description()+"\nTotal calories: "+
								myMenu.totalCalories());
		}
	}


