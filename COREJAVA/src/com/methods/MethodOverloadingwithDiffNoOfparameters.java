package com.methods;

public class MethodOverloadingwithDiffNoOfparameters {
	
	public static void main(String[] args) {
		System.out.println("Area of reactangle " + area(14.25d,10.65d));
		System.out.println("Area of square " + area(5.0d));
	}

	

	public static double area(double length, double width) {
		// TODO Auto-generated method stub
		return (length*width);
	}
	
	public static double area(double side) {
		// TODO Auto-generated method stub
		return side*side;
	}
	
	

}
