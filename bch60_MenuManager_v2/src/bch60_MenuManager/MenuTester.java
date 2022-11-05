package bch60_MenuManager;

/**
 * Class MenuTester.java
 * @author Brandon Hoover
 * created: 10/25/2022
 */

public class MenuTester {

	public static void main(String[] args){
		MenuRandomize randomize = new MenuRandomize("cd ..\\..\\data\\entrees.txt",
				"cd ..\\..\\data\\sides.txt","cd ..\\..\\data\\salads.txt","cd ..\\..\\data\\desserts.txt");
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description()+"\nTotal calories: "+
				myMenu.totalCalories());
	}
}

/**
 * The reason that I am using the characters 'cd' in my relative file path is because it was the only way that I could 
 * get eclipse to read the '..' to back out of the current directory that MenuTester.java is located in, and meneuver
 * to the current directory where it could access the data and begin to implement the methods that I created. 
 * 
 * My absolute file path for the data files on my computer is as follows:
 * public static String entreeFile="C:\\Users\\Brandon\\Documents\\GitHub\\bch60_cmpinf401\\bch60_MenuManager_v2\\data\\entrees.txt";
 * public static String sideFile="C:\\Users\\Brandon\\Documents\\GitHub\\bch60_cmpinf401\\bch60_MenuManager_v2\\data\\sides.txt";
 * public static String saladFile="C:\\Users\\Brandon\\Documents\\GitHub\\bch60_cmpinf401\\bch60_MenuManager_v2\\data\\salads.txt";
 * public static String dessertFile="C:\\Users\\Brandon\\Documents\\GitHub\\bch60_cmpinf401\\bch60_MenuManager_v2\\data\\desserts.txt";
 * 
 * I also wanted to note that the idea for using 'cd' in front of '..' was because of my past experience using linux. 
 * In linux OS to navigate through terminal you use 'cd .. ' or 'cd the specific file or directory'.
 * And I am fascinated by the pragmatic programming that allowed for me to find a solution to my problem.
 */
