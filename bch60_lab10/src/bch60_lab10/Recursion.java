package bch60_lab10;

public class Recursion {

	
	
	int sumOfDigitsRecursive(int x) {
		if (x == 0) {
			return 0;
		}
		
	// 12345
		
		else {
			int lastDigit = x % 10;
			int restOfNum = x % 10;
			return lastDigit + sumOfDigitsRecursive(restOfNum);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,4,5,6};
		int index = 0;
		
		printArray(arr,index);
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
	
	public void allCombinations(int[] arr) {
		
		
		
		for (int i=0; i<arr[i]; i++) {
			for(int k=0; i<arr[k]; k++) {
				System.out.print("");
			}	
		}
		
	}
	

}

// How would we do this iteratively 
//