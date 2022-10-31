package edu.pitt.classwork;

import java.io.FileReader;

public class FileIoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "a,b,c,d,e,f,g\n";
			s += "1,2,3,4,5,6\n";
			s += "p,r,y,u,o,p";
			
		
		// USING SPLIT METHOD -- very useful
		// What is s functionality -- s is the string you are splittign with comma sep
		
			String[] a = s.split(",");
		
		for (String element : a) {
			System.out.println(a[2]);
		}
		
		
		// using comma as an IFS - Internal Field Separator (remember)
		// and then saving the string as an array

		/*
		// Creating a matrix 
		String[] rows = s.split("\n");
		System.out.println(rows[2]);
		
		
		for (String row : rows) {
			// GET NEMO HELP the line below is wack
			String[] cols = row.split(",");
			System.out.println(cols[4]);
			
			
			for(String col : cols) {
				System.out.println(col + "\t");
			}
			System.out.println();
		}
		*/
		
		
		
		
	}

}
