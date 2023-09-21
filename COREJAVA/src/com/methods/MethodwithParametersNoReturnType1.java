package com.methods;

public class MethodwithParametersNoReturnType1 {
	
	public static void main(String[] args) {
		loop(1,10);
	}
	
	public static void loop(int step , int finalvalue) {
		
		while(step<=finalvalue) {
			System.out.println(step);
			step++;
		}
		
	}

}
