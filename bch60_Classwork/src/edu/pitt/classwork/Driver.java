package edu.pitt.classwork;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Car c = new Car("Ford", "fiesta", "sedan" , 2016) 
		
	Circle c = new Circle(10);
	
	
	// Done it was because you didnt include an extra set of () for the method 
	
	System.out.println(c.perimeter());
	System.out.println(c.area());
	
	Inheritance b = new Derived();
	b.show();
	Inheritance be = new Inheritance();
	be.show();
	
	// The reason that derived is called is because object b is type Derived which included 
	// the different string system out response even though it is apart of base class Inheritance
	// It to get the first one to show up you would use new Inheritance();;
	}


	public class Main {
		public static void main(String[] args) {
			Inheritance b = new Derived();;
			b.show();
		}
	}
}
