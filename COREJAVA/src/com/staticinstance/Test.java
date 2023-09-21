package com.staticinstance;

public class Test {
	
	public static void main(String args[ ])  {
	       Base obj1 = new Derived();
	        
	       // As per overriding rules this should call to class Derive's static
	       // overridden method. Since static method can not be overridden, it
	       // calls Base's display()
	       obj1.display(); 
	        
	       // Here overriding works and Derive's print() is called
	       obj1.print();    
	    }

}


//output

//Static or class method from Base
//Non-static or Instance method from Derived


//If a derived class defines a static method with the same signature as a static method in the base class, 
//the method in the derived class is hidden by the method in the base class. 