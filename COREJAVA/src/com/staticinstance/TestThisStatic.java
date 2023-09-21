package com.staticinstance;

public class TestThisStatic {
	public static void main(String args[]) 
	{
	 //Static method is being called using the name of the class
	StaticDemo.callme();
	 //Static variable is accessed with the class name
	System.out.println("The value of b = " + StaticDemo.a);
	}

}
