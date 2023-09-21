package com.coreconcepts.superr;

public class Animal2SuperChildMethod extends Animal2SuperParentMethod {
	
	void eat(){System.out.println("eating bread...");}  
	void bark(){System.out.println("barking...");}  
	void work(){  
	super.eat();  
	bark();  
	}  
	
	public static void main(String[] args) {
		Animal2SuperChildMethod a1 = new Animal2SuperChildMethod();
		a1.work();
	}


}
