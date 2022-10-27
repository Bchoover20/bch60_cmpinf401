package bch60_lab7;

public class ArrayLab {

	/**
	 * Class Array
	 * @author Brandon Hoover
	 * created: 10/25/2022
	 */

	public static double max (double[]data) {

		int i = 0;
		double tempMax=0;

		for (double element : data) {
			if (data[i] > tempMax)
				tempMax = data[i];
			i++;
		}

		return tempMax;
	}

	public static double min (double[]data) {

		int i = 0;
		double tempMin = data[0];
		for (double element : data) {
			if (data[i] < tempMin ) {
				tempMin = data[i];
			}
			i++;
		}
		return tempMin;
	}

	public static double sum (double[]data) {

		int i = 0;
		double tempSum = 0;
		for (double element : data) {
			tempSum += data[i];
			i++;
		}

		return tempSum;
	}

	public static double ave (double[]data) {

		int i = 0;
		double tempAve = 0;
		for (double element : data) {

			tempAve += data[i];
			i++;
		}
		tempAve = tempAve/(i);
		return tempAve;
	}


}
