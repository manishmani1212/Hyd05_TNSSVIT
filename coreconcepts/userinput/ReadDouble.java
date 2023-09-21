package com.coreconcepts.userinput;

import java.util.*;

public class ReadDouble {
	
	public static void main(String[] args) {

	    // creates an object of Scanner
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter Double value: ");

	    // reads the double value
	    double value = input.nextDouble();
	    System.out.println("Using nextDouble(): " + value);

	    input.close();
	  }

}
