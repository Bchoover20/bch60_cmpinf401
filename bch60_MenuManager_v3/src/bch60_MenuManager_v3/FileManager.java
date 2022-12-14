package bch60_MenuManager_v3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class: FileManager
 * @author Brandon Hoover
 * Created: 11/15/2022
 */

public class FileManager {

	/**
	 * Method readItems
	 * @param String fileName - relative file path that path should be set too
	 * at which point path is the data file that is being read
	 * @return menuItemList - Array list of type MenuItem that contains all of the Menu items(options) that
	 * were pulled from the data file being read 
	 */


	public static ArrayList<MenuItem> readItems (String fileName) {

		ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();

		String path = fileName;

		try {

			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr); 

			// Initializing the state of line
			String line = null;

			int counter=0;
			ArrayList<String> dataCollector = new ArrayList<String>();
			// Reading through each line until its null

			while ((line = br.readLine()) != null) {

				String[] tempLine = line.split("@@");

				dataCollector.add(tempLine[0]);
				dataCollector.add(tempLine[1]);
				dataCollector.add(tempLine[2]);
				dataCollector.add(tempLine[3]);
				dataCollector.add(tempLine[4]);

				counter++;	
			}

			int counter2=0;
			int name=0,dishType=1,desc=2,cal=3,price=4;
			int tempCal=0;
			double tempPrice=0.0;

			while (counter2 < counter) {

				tempCal = Integer.parseInt(dataCollector.get(cal));
				tempPrice = Double.parseDouble(dataCollector.get(price));

				// Use equals internal method when comparing two strings 
				if (dataCollector.get(dishType).equals("entree")) {
					menuItemList.add(new Entree(dataCollector.get(name), dataCollector.get(desc), tempCal, tempPrice));
				}
				else if (dataCollector.get(dishType).equals("side")) {
					menuItemList.add(new Side(dataCollector.get(name), dataCollector.get(desc), tempCal, tempPrice));
				}
				else if (dataCollector.get(dishType).equals("salad")) {
					menuItemList.add(new Salad(dataCollector.get(name), dataCollector.get(desc), tempCal, tempPrice));
				}
				else if (dataCollector.get(dishType).equals("dessert")) {
					menuItemList.add(new Dessert(dataCollector.get(name), dataCollector.get(desc), tempCal, tempPrice));
				}
				else {
					System.out.println(dataCollector.get(dishType));
					System.out.println("INVALID DATA FOR DISHTYPE, please make sure that the dishtypes in your data file"
							+ " is completely lower-case and spelled correctly, thank you!");
				}

				name = (name + 5);
				dishType = (dishType + 5);
				desc = (desc + 5);
				cal = (cal + 5);
				price = (price + 5);

				counter2++;
			}
			fr.close();
			br.close();
		}
		catch (IOException e){
			System.out.println("ERROR OCCURED IN READITEMS IN FILEMANAGER.JAVA");
			e.printStackTrace();
		}
		return menuItemList;
	}

	/**
	 * Method writeMenus
	 * @param String fileName - relative file path that path should be set too in order to properly write to file
	 * @param ArrayList<Menu> menus - An ArrayList of type Menus that contains the menu objects that are going to be wrote to the file 
	 * @return no return as method is set to void
	 */

	// Why does everything have to be static for one thing to be static 

	
	public static void writeMenus (String filename, ArrayList<Menu> menus) {

		String path = filename;

		try {

			FileWriter fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fw); 

			for (int i=0; i<menus.size(); i++) {

				//System.out.println(menus.get(i).toString());
				bw.write(menus.get(i).getName() + "---------------------\n");
				bw.write(menus.get(i).getEntree().name + "@@" + menus.get(i).getEntree().description + "@@" + menus.get(i).getEntree().calories + "@@" + menus.get(i).getEntree().price + "\n");
				bw.write(menus.get(i).getSide().name + "@@" + menus.get(i).getSide().description + "@@" + menus.get(i).getSide().calories + "@@" + menus.get(i).getSide().price + "\n");
				bw.write(menus.get(i).getSalad().name + "@@" + menus.get(i).getSalad().description + "@@" + menus.get(i).getSalad().calories + "@@" + menus.get(i).getSalad().price + "\n");
				bw.write(menus.get(i).getDessert().name + "@@" + menus.get(i).getDessert().description + "@@" + menus.get(i).getDessert().calories + "@@" + menus.get(i).getDessert().price + "\n");

				int totalCal = menus.get(i).totalCalories(); 
				double totalPri = menus.get(i).totalPrice();
				bw.write("The total calories for this menu is: " + totalCal + "\n");
				bw.write("The total price for this menu is: " + totalPri + "\n");
			}
			bw.close();
			fw.close();
		}
		catch (IOException e){
			System.out.println(e);
			System.out.println("Error ocurred in method writeMenus try\\catch");

		}
	}

	/*
	 * Verfication Checks:
	 * System.out.println(menuItemList.get(counter2).toString() + counter2);
	 */

}

