package com.oop4.polymorphism;

public class PolymorphismLanguage1MainMOverriding {
	
	public static void main(String[] args) {
		
		PolymorphismLanguage1ExtendsMOverriding p1 = new PolymorphismLanguage1ExtendsMOverriding();
		p1.displayInfo();
		
		PolymorphismLanguage1MOverriding p2 = new PolymorphismLanguage1MOverriding();
		p2.displayInfo();
	}

}	