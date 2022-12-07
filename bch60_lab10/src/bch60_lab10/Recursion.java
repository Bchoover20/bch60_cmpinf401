package bch60_lab10;

public class Recursion {



	static int sumOfDigits(int x) {
		
		// xSepSum stands for "x that has been separated which is going to be used in calculating the sum of Digits in X"
		int	xSepSum = (x % 10);
		System.out.println(x);
		int leftOverX = x/10 ;

		//System.out.println(lastDigit);
		if (x == 0) {
			return xSepSum;
		}

		else {
			return xSepSum + sumOfDigits(leftOverX);
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numArray = {1,2,3,4,5,6};
		int index = 0;

		System.out.println("First Task, sumofDigitsRecursive: ");
		// Why do I have to change this to static for it to work, ask Alex
		int task1Answer = sumOfDigits(340);
		System.out.println(task1Answer); 


		System.out.println("Second Task, printArray: ");
		printArray(numArray,index);
		
		System.out.println("Third Task, printCombos:");
		

		int [] a = {2,3,7,8,9};
		
		printCombos(a,"",0,3);
		
	}


	static void printArray(int[] arr, int index) {

		// you need a temporary argument to pass through 

		if (index == arr.length) { // checks to make sure that it does not call 
			return;
		}
		// for loops have to keep track of its own state 
		// its hard to think about and slower than a for loop
		// stuff with arrays dont use recursion back tracking use recursion

		System.out.println(arr[index]);

		printArray(arr,(index+1));
		
	}

	public static void printCombos(int[] a, String out, int startIndex, int k ) {

		// baseCase: elements = 0
		// paramater changing = elements? -- recursive condition

		/*
		if (startIndex < k) {
			
			int statement = 0;
			int tempIndex = startIndex;
			int facts = 0;
			
			//while (statement == 0) {
			
			for (int g=1; g<a.length; g++) {
				
			
			out += ("{ ");
				
					out += a[startIndex] + ", ";
					
		
					out += a[startIndex+1] + ", ";
					
					out += a[startIndex+2] + ", ";
			
					
			}
			
			startIndex++;
			printCombos(a,out,startIndex,k);
			
			
		//	}
			else {
				System.out.println(out);
				System.out.println("Task is finished");
			}
			*/
			
			/*
			 * 	for (int i=1; i<k; i++) {
						out += (a[tempIndex+g] + ", ");
						tempIndex++;
						System.out.println("run " + i);
	
					}
					tempIndex = 0;
					facts++;
					System.out.println(g);
			out += ("}\n");
			
			System.out.println(out);
			if (facts == a.length-1) {
				statement = 1;
				System.out.println("It happened");
			}
			
			}

			 */
			/*
			if (a[tempIndex] == a[lastA] && a[tempIndex-1] == a[secondToLastA]) {
				printCombos(a, out, startIndex+1, k);
			}
			else {
				do { 
					out += ("{ ");
					
					out += a[startIndex] + ", ";
					
					tempIndex = startIndex+1;
					for (int i =0; i<k-1; i++) {
						out += (a[tempIndex+1] + ", ");
						tempIndex++;
					}
					
					out += ("}\n");
			
				} while (startIndex != a.length-1 && startIndex != a.length-2);
				
				printCombos(a,out,startIndex+1,k);
			}	
		}
		else {
			System.out.println(out);
			System.out.println("Task is finished");
		}
		
		
		*/
		
		

	}
}