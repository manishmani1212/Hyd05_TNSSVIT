


package com.staticinstance;

//filename Test.java
public class TestOverloadStatic {
	public static void foo() {
		System.out.println("Test.foo() called ");
	}
	public static void foo(int a) {
		System.out.println("Test.foo(int) called ");
	}
	
	public static void foo(float b) {
		System.out.println("float value is displayed");
	}
	public static void main(String args[])
	{
		TestOverloadStatic.foo();
		TestOverloadStatic.foo(10);
		TestOverloadStatic.foo(12.2f);
	}
}
