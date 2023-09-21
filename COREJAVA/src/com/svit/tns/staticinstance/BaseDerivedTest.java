package com.svit.tns.staticinstance;

public class BaseDerivedTest {
	public static void main(String[] args) {
		   Derived obj1 = new Base();
	        
	       // As per overriding rules this should call to class Derive's static
	       // overridden method. Since static method can not be overridden, it
	       // calls Base's display()
	       obj1.display(); 
	        
	       // Here overriding works and Derive's print() is called
	       obj1.print();    
	}
}
