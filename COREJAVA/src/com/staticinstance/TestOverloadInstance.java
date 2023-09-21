package com.staticinstance;

//filename Test.java
public class TestOverloadInstance {
	public  void foo() {
		System.out.println("Test.foo() called ");
	}
	public  void foo(int a) {
		System.out.println("Test.foo(int) called ");
	}
	public static void main(String args[])
	{
		TestOverloadInstance t1 = new TestOverloadInstance();
		t1.foo();
		t1.foo(10);
	}
}
