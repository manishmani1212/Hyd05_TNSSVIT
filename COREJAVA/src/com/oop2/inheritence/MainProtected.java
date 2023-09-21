package com.oop2.inheritence;

public class MainProtected {
	
	public static void main(String[] args) {
		
		DogProtected labrador = new DogProtected();
		
		
		// access protected field and method
	    // using the object of subclass
	    labrador.name = "Rocky";
	    labrador.display();

	    labrador.getInfo();
	}

}
