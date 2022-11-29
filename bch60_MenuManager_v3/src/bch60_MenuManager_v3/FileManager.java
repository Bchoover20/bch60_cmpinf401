package bch60_MenuManager_v3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class: Menu
 * @author Brandon Hoover
 * Created: 10/25/2022
 */

public class FileManager {

	/**
	 * Method readEntrees
	 * @param String fileName - relative file path that path should be set too
	 * @return entreeList - Array list of type Entree that contains the possible list of entrees
	 * that could be used on the menu from entrees.txt
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
					Entree testMenu = new Entree(dataCollector.get(name), dataCollector.get(desc), tempCal, tempPrice);
					menuItemList.add(testMenu);
				}
				else if (dataCollector.get(dishType).equals("side")) {
					Side testMenu = new Side(dataCollector.get(name), dataCollector.get(desc), tempCal, tempPrice);
					menuItemList.add(testMenu);
				}
				else if (dataCollector.get(dishType).equals("salad")) {
					Salad testMenu = new Salad(dataCollector.get(name), dataCollector.get(desc), tempCal, tempPrice);
					menuItemList.add(testMenu);
				}
				else if (dataCollector.get(dishType).equals("dessert")) {
					Dessert testMenu = new Dessert(dataCollector.get(name), dataCollector.get(desc), tempCal, tempPrice);
					menuItemList.add(testMenu);
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
	
	/*
	public static void writeMenus (String filename, ArrayList<Menu> menus) {
		
		String path = filename;
		
		try {
		
			FileWriter fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fw); 

			bw.write(menus.getName() + "," + menus.getdishesType + "," + menus.get);
			System.out.println(menus.get(0));
			
			for (Menu element : menus) {
				
				//bw.write("this is it");
				
			}


			bw.close();
			fw.close();
		}
		catch (IOException e){
			System.out.println(e);
			System.out.println("Big bruh moement");
			
		}
	}
	*/	

}
