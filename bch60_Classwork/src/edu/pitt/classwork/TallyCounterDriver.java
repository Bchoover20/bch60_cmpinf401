package edu.pitt.classwork;

public class TallyCounterDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TallyCounter t1 =  new TallyCounter();
		TallyCounter t2 = new TallyCounter();
		
		t1.click();
		t2.click();
		
		
		// If you put in t1 it prints the memory location of the variable not the variable 
		System.out.println(t1);

	}

}
