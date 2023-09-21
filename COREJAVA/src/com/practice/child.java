package com.practice;
class Child extends Parent  {
	
	static int a=1; 
	Child()
	{
		System.out.println("\nChild class constructer "+a++);
	}
	
	String sum()
	{
		return "Child Sum";
	}
	
}

