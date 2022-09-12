package edu.pitt.lab2;

import javax.swing.JOptionPane;

public class AreaPerimeterCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	JOptionPane.showMessageDialog(null, "Circle Area and Perimeter Calculator");
	String input = JOptionPane.showInputDialog(null, "Input the radius of the circle below: ");
	
	// Converting from a string to a double
	Double radius = Double.parseDouble(input);
	
	// Calculating Perimeter and Area of the circle
	Double perimeter = (2 * Math.PI * radius);
	Double area = (Math.PI) * (Math.pow(radius, 2));
	
	//Rounding Perimeter
	perimeter = (perimeter * 100);
	int perimeter_r = (int)Math.round(perimeter);
	Double perimeter_r2 = Double.valueOf(perimeter_r);
	perimeter = perimeter_r2/100;
	
	// Rounding area
	area = (area * 100);
	int area_r = (int)Math.round(area);
	Double area_r2 = Double.valueOf(area_r);
	area = area_r2/100;
	
	
	
	
	//Converting to strings so we can output 
	
	JOptionPane.showMessageDialog(null, "The circle with a radius of " + radius +  " has an area of " + area +
			" and a perimter of " + perimeter + ".");
	
	
	}

}
