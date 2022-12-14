package bch60_MenuManager;

import java.io.BufferedReader;
import java.io.FileReader;
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

	public static ArrayList<Entree> readEntrees(String fileName) {
		String path = fileName;
		// Absolute path -- C:\Users\Brandon\Documents\GitHub\bch60_cmpinf401\bch60_MenuManager_v2\data 
		// Creating an array list to throw in Entree data that fits type entree parameter (name, desc, cal)
		ArrayList<Entree> entreeList  = new ArrayList<Entree>();

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

				counter++;	
			}

			int counter2=1;
			int i=0,j=1,k=2;
			int tempCal=0;

			while (counter2 <= counter) {

				tempCal = Integer.parseInt(dataCollector.get(k));

				Entree testEntree = new Entree(dataCollector.get(i), dataCollector.get(j), tempCal);

				entreeList.add(testEntree);

				i = (i + 3);
				j = (j + 3);
				k = (k + 3);

				counter2++;
			}
			fr.close();
			br.close();
		}
		catch (IOException e){
			System.out.println("IT HAPPENED IN ARRAY LIST ENTREE");
			e.printStackTrace();
		}
		return entreeList;

	}

	/**
	 * Method readSides
	 * @param String fileName - relative file path that path should be set too
	 * @return sideList - Array list of type Side that contains the possible list of sides
	 * that could be used on the menu from sides.txt
	 */

	public static ArrayList<Side> readSides(String fileName) {
		String path = fileName;
		ArrayList<Side> sideList  = new ArrayList<Side>();

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

				// Verification Check
				/*System.out.println(tempLine[0]);
    				System.out.println(tempLine[1]);
    				System.out.println(tempLine[2]);
				 */

				dataCollector.add(tempLine[0]);
				dataCollector.add(tempLine[1]);
				dataCollector.add(tempLine[2]);

				counter++;	
			}

			int counter2=1;
			int i=0,j=1,k=2;
			int tempCal=0;

			while (counter2 <= counter) {

				tempCal = Integer.parseInt(dataCollector.get(k));

				Side addSide = new Side(dataCollector.get(i), dataCollector.get(j), tempCal);

				sideList.add(addSide);

				i = (i + 3);
				j = (j + 3);
				k = (k + 3);

				counter2++;
			}
			fr.close();
			br.close();
		}
		catch (IOException e){
			System.out.println("The error occurred in readSides");
			e.printStackTrace();
		}
		return sideList;

	}

	/**
	 * Method readSalads
	 * @param String fileName - relative file path that path should be set too
	 * @return saladList - Array list of type Salad that contains the possible list of Salads
	 * that could be used on the menu from salads.txt
	 */

	public static ArrayList<Salad> readSalads(String fileName) {
		String path = fileName;
		ArrayList<Salad> saladList  = new ArrayList<Salad>();

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

				// Verification Check
				/*System.out.println(tempLine[0]);
    				System.out.println(tempLine[1]);
    				System.out.println(tempLine[2]);
				 */

				dataCollector.add(tempLine[0]);
				dataCollector.add(tempLine[1]);
				dataCollector.add(tempLine[2]);

				counter++;	
			}

			int counter2=1;
			int i=0,j=1,k=2;
			int tempCal=0;

			while (counter2 <= counter) {

				tempCal = Integer.parseInt(dataCollector.get(k));

				Salad addSalad = new Salad(dataCollector.get(i), dataCollector.get(j), tempCal);

				saladList.add(addSalad);

				i = (i + 3);
				j = (j + 3);
				k = (k + 3);

				counter2++;
			}
			fr.close();
			br.close();
		}
		catch (IOException e){
			System.out.println("The error occurred in readSalads");
			e.printStackTrace();
		}
		return saladList;

	}

	/**
	 * Method readDesserts
	 * @param String fileName - relative file path that path should be set too
	 * @return dessertList - Array list of type Dessert that contains the possible list of desserts
	 * that could be used on the menu from desserts.txt
	 */

	public static ArrayList<Dessert> readDesserts(String fileName) {
		String path = fileName;
		ArrayList<Dessert> dessertList  = new ArrayList<Dessert>();

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

				// Verification Check
				/*System.out.println(tempLine[0]);
    				System.out.println(tempLine[1]);
    				System.out.println(tempLine[2]);
				 */

				dataCollector.add(tempLine[0]);
				dataCollector.add(tempLine[1]);
				dataCollector.add(tempLine[2]);

				counter++;	
			}

			int counter2=1;
			int i=0,j=1,k=2;
			int tempCal=0;

			while (counter2 <= counter) {

				tempCal = Integer.parseInt(dataCollector.get(k));

				Dessert addDessert = new Dessert(dataCollector.get(i), dataCollector.get(j), tempCal);

				dessertList.add(addDessert);

				i = (i + 3);
				j = (j + 3);
				k = (k + 3);

				counter2++;
			}
			fr.close();
			br.close();
		}
		catch (IOException e){
			System.out.println("The error occurred in readDesserts");
			e.printStackTrace();
		}
		return dessertList;

	}

}

