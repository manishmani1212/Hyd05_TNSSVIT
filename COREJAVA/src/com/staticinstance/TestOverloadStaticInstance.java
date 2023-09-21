package com.staticinstance;

//filename Test.java
public class TestOverloadStaticInstance {
	public static void foo() {
		System.out.println("Test.foo() called ");
	}

	
	  public void foo(int a) { // Compiler Error: cannot redefine foo()
	  System.out.println("Test.foo(int) called "); }
	 
	
	public static void main(String args[]) {
		TestOverloadStaticInstance.foo();
		
		TestOverloadStaticInstance t1 = new TestOverloadStaticInstance();
		t1.foo(1);
	}
}

