package com.coreconcepts.finall;

public class FinalExtends extends FinalBike{
	
	void run() {
		System.out.println("Running safely with 100kmph");
	}
	
	public static void main(String[] args) {
		
		FinalExtends f1 = new FinalExtends();
		f1.run();
		
	}

}
