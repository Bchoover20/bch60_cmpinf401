package bch60_MenuManager;

public class MenuRandomize {
	
	//public static String entreeFile="\\data\\entrees.txt";
	public static String entreeFile="C:\\Users\\Brandon\\Documents\\GitHub\\bch60_cmpinf401\\bch60_MenuManager_v2\\data\\entrees.txt";
	public static String sideFile="C:\\Users\\Brandon\\Documents\\GitHub\\bch60_cmpinf401\\bch60_MenuManager_v2\\data\\sides.txt";
	public static String saladFile="C:\\Users\\Brandon\\Documents\\GitHub\\bch60_cmpinf401\\bch60_MenuManager_v2\\data\\salads.txt";
	public static String dessertFile="C:\\Users\\Brandon\\Documents\\GitHub\\bch60_cmpinf401\\bch60_MenuManager_v2\\data\\desserts.txt";
	
	public MenuRandomize(String entreeFile,String sideFile, String saladFile, String dessertFile) {
		
		// initializing state and defining what the vars are 
		entreeFile = new String();
		sideFile= new String();
		saladFile=new String();
		dessertFile= new String();
		
		//System.out.println(entreeFile); // because its a constructor not a function 
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// RELATIVE FILE PATH NOT WORKING -- ASK PROF
		
		// Look up a way to verify that the method is properly working
		FileManager.readEntrees(entreeFile);
		FileManager.readSides(sideFile);
		//System.out.println(entreeList.get(2));
	}

}
