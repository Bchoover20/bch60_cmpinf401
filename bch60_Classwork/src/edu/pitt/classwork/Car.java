package edu.pitt.classwork;

public class Car extends ClassWorkFor401 {

	String color;
	String make;
	String model;
	String bodyType;
	int year;
	



	//Constructor --- looking at syntax to pass variables through 
	// YOU HAVE TO DEFINE THE TYPE OF VAR YOU ARE PASSING 
	public Car (int year, String color, String make, String model) {
	
		// What does this do exactly, besides implement a shortcut 
		this.year = year;
		this.color = color;
		this.make = make;
		this.model = model;
	}
// Example design of making classes and objects that are being defined by the classes 

	
	public void ifScope() {
		boolean i = true;
		if(i=true) {
			System.out.println("5");
		}
	}


	// Creating my own method for car class should be done here so then actual file can use method at any point within the file 
	int carState = 0;
	void start() {
		carState = 1;
	}
	
	void accelerate(double inputForce) {
		if (carState != 0) {
			carState = 2;
			
		}
	}

	int speed = 0;
	void slowDown(double inputForce) {
		speed -= inputForce * 2;
		if (speed <= 0) {
			
		}
	}
	
	//Getters and Setters


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}
	
	
}