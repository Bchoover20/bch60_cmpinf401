package edu.pitt.classwork;

public class Circle {
	
	private double radius;
	
	
	// Overiding the default constructor its when you have the same function name but different parameters for each function
	
	
	
	// Constructor
	public Circle(double radius) {
		if (radius > 0) {
			this.radius = radius;
		}
		else {
			System.out.println("You cannot have a negative radius");
		}
	}

	// getter
	public double getRadius() {
		return this.radius;
	}
	
	public double perimeter() {
		return this.radius * 2 * Math.PI;
	}
	
	// This calls this class
	public double area() {
		return (this.radius * 2 * Math.PI) * .5;
	}
	
	
}
