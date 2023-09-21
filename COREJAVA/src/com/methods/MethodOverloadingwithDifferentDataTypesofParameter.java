package com.methods;

public class MethodOverloadingwithDifferentDataTypesofParameter {
	
	
	public static void main(String[] args) {
		System.out.println("1+2=" + sum(1,2));
		System.out.println("1+2.5=" + sum(1,2.5f));
		System.out.println("1.3+2.5=" + sum(1.3,2.5));
	}

	private static int sum(int i, int j) {
		// TODO Auto-generated method stub
		
		System.out.println("Adding two integers entity");
		return i+j;
	}
	
	private static float sum(int i, float d) {
		// TODO Auto-generated method stub
		System.out.println("Adding one integer with one float entity");
		return i+d;
	}
	
	
	private static double sum(double d, double e) {
		// TODO Auto-generated method stub
		System.out.println("Adding one double with one double entity");
		return d+e;
	}
}
