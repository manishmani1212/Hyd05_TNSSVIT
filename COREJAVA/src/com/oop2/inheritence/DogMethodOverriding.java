package com.oop2.inheritence;

public class DogMethodOverriding extends AnimalMethodOverriding {
	
	@Override
	public void eat() {
		System.out.println("I eat dog food");
	}
	
	public void bark() {
		System.out.println("I can bark");
	}

}
