package edu.pitt.classwork;

public class Person {
	
	private String ssn = "111-111-1111";
	private String dob = "04/11/1977";
	private String firstName;
	private String lastName = "Babichenko";
	
	public String getSnn() {
		return ssn;
	}

	public String getDob() {
		return dob;
	}
	
	public String firstName() {
		return firstName;
		
	}
	
	// SETTERS ARE ALWAYS VOID -- no return
	
	public void setFirstName(String val) {
		firstName = val;
	}
	
}
