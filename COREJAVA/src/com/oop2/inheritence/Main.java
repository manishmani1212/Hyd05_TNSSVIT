package com.oop2.inheritence;

public class Main {
	
	public static void main(String[] args) {
		// create an object of the subclass
	    Dog labrador = new Dog();

	    // access field of superclass
	    labrador.name = "Rohu";
	    labrador.display();

	    // call method of superclass
	    // using object of subclass
	    labrador.eat();
	}

}
