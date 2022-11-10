package edu.pitt.classwork;

public class Inheritance {

	public void show() {
		System.out.println("Base::show() called");
	}
}
class Derived extends Inheritance {
	public void show() {
		System.out.println("Derived::show() called");
	}
}

/*
public class Main {
	public static void main(String[] args) {
		Inheritance b = new Derived();;
		b.show();
	}
}
*/
