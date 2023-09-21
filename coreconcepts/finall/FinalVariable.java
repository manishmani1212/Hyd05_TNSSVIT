package com.coreconcepts.finall;

public class FinalVariable {
	
	final int speedlimit=90;
	
	void run() {
		speedlimit=125;
	}
	
	public static void main(String[] args) {
		
		FinalVariable obj = new FinalVariable();
		obj.run();
		
	}

}
