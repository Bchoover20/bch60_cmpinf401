package edu.pitt.classwork;

public class Car extends ClassWorkFor401 {

	String color;
	String make;
	String model;
	String bodyType;
	int year;
	



// Example design of making classes and objects that are being defined by the classes 



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
	
	
}