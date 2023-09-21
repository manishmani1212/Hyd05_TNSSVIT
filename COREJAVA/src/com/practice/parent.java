package com.practice;

class Parent {
	
	static int c=1;
	Parent()
	{
		System.out.println("\nParent class constructer "+c++);
	}
	
	String sum()
	{
		return "Parent Sum";
	}
	
	int sum(int a, int b)
	{
		return a+b;
	}
	
	float sum(float a, float b)
	{
		return a+b;
	}
}