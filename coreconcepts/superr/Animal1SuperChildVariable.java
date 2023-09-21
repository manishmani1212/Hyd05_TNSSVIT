package com.coreconcepts.superr;

public class Animal1SuperChildVariable extends Animal1SuperParentVariable {
	
	String color="black";
	
	void printColor(){  
		System.out.println(color);//prints color of Dog class  
		System.out.println(super.color);//prints color of Animal class  
	}  
	
	public static void main(String[] args) {
		
		Animal1SuperChildVariable a1 = new Animal1SuperChildVariable();
		a1.printColor();
		
	}
}
