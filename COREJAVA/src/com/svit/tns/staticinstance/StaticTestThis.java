package com.svit.tns.staticinstance;

public class StaticTestThis {
	public static void main(String[] args) {
		StaticDemo.callme();
		 //Static variable is accessed with the class name
		System.out.println("The value of b = " + StaticDemo.a);
	}
}
