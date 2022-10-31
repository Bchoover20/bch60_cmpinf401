package edu.pitt.classwork;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class ReadFileData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Relative path not working, somewhat concerning 
		String path = "C:\\Users\\Brandon\\Documents\\GitHub\\bch60_cmpinf401\\bch60_Classwork\\src\\edu\\pitt\\classwork\\data\\input.csv";
		
		//C:\Users\Brandon\Documents\GitHub\bch60_cmpinf401\bch60_Classwork\src\edu\pitt\classwork\data
		
		// use try catch format when reading files
		
		// fr and br just vars?
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
		
			String line = null;
			
			// Iterates through and reads the lines in buffered reader until it reaches null which is when its read through the whole file
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
