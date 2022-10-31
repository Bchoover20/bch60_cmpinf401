package bch60_lab7;

import java.util.Random;
import java.util.Scanner;

/**
 * Class ArrayLabDriver
 * @author Brandon Hoover
 * created: 10/25/2022
 */

public class ArrayLabDriver {

	public static void main (String [] args) {


		System.out.println("How many numbers would you like to be randomly generated into the array");
		Scanner userInput = new Scanner(System.in);

		int arraySize = userInput.nextInt();

		//System.out.println(arraySize);
		//Creates an array the size of what the user input
		double[] data = new double[arraySize];

		//Filling the indices of the array with random values
		Random newRandoNum = new Random();

		for (int i=0; i<arraySize; i++) {

			data[i] = newRandoNum.nextDouble(1000);

			System.out.println(data[i]);
		}
		
		System.out.println("The maximum value in the array is: " + ArrayLab.max(data));
		System.out.println("The minimum value in the array is: " + ArrayLab.min(data));
		System.out.println("The sum of the values in the array is: " + ArrayLab.sum(data));
		System.out.println("The average value within the array is: " + ArrayLab.ave(data));

	}

}
