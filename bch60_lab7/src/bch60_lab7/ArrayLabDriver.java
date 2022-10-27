package bch60_lab7;

import java.util.Random;
import java.util.Scanner;


public class ArrayLabDriver {

	public static void main (String [] args) {


		System.out.println("How many items would you like to be randomly generated into the array");
		Scanner userInput = new Scanner(System.in);

		int arraySize = userInput.nextInt();

		//System.out.println(arraySize);
		// creates an array the size of what the user input
		double[] data = new double[arraySize];

		//Filling the indices of the array with random values
		Random newRandoNum = new Random();

		for (int i=0; i<arraySize; i++) {

			data[i] = newRandoNum.nextDouble(1000);

			System.out.println(data[i]);
		}

		// testing enhanced for loops 
		/*
		for (double element : data) {
			System.out.println("HI");
		}
		 */
		
		System.out.println("The maximum value in the array is: " + ArrayLab.max(data));
		System.out.println("The minimum value in the array is: " + ArrayLab.min(data));
		System.out.println("The sum of the values in the array is: " + ArrayLab.sum(data));
		System.out.println("The average value within the array is: " + ArrayLab.ave(data));

	}

}
