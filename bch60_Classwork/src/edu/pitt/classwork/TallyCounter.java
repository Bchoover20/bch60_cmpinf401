package edu.pitt.classwork;

public abstract class TallyCounter {
	
	/*
	 * What does a tally counter do? (methods)
	 * What would its internal state be?
	 */

	private int counter = 0;
	
	
	//These are methods right
	// WHen creating methods if you do not use void it needs a return
	public void click() {
		counter ++;
	}
}
