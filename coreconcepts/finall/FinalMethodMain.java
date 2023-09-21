package com.coreconcepts.finall;

public class FinalMethodMain extends FinalMethod1{
	
	void run() {
		System.out.println("Running safely with 100kmph");
	}
	
	public static void main(String[] args) {
		FinalMethodMain f1 = new FinalMethodMain();
		f1.run();
	}

}
