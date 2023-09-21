package com.oop1.constructor;

public class DefaultConstructoruserAdded {
	
	private String brand;
	
	public DefaultConstructoruserAdded(String ibrand) {
		brand=ibrand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public static void main(String[] args) {
		
		DefaultConstructoruserAdded phone = new DefaultConstructoruserAdded("Nokia");
		System.out.println (phone.getBrand ());
	}

}
