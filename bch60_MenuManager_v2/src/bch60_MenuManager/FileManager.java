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

	
 public static void readEntree(String fileName) { // TA did not have void 
	 try {
		 BufferedReader br = new BufferedReader(new FileReader("data/entree.txt")); 
	 
		String line = br.readLine();
		String[] array = line.split("@@");
	 }
	 catch (IOException e ) {
		 e.printStackTrace();
	 }
	 
 }
	
	
 	// It was fileName: "data/entree.txt" if that makes a difference for some reason
 
 
	// Try catch with resoucres, automatically closes br for you in case you forget to include it 
 	// line.split is where you create an array reading from a file into the size you want it to be. each new index
 	// is the individual elements based on the comma seperator
 	// Example: [" grilled chicken:,"vegetable", "Key Lime Pie" ]
 
 
}

