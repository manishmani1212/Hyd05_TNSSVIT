package com.oop1.constructor;

public class Car2Main {
	
	public static void main(String[] args) {
		Car2Parametrized c2 = new Car2Parametrized("closed"	, "on", "seated", 10);
		
		System.out.println(c2.run());
	}

}
