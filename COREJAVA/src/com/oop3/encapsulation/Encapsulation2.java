package com.oop3.encapsulation;

public class Encapsulation2 {
	
	private String name="john";
	private int age=25;
	private String gender="Male";
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public static void main(String[] args) {
		Encapsulation2 e2 = new Encapsulation2();
		System.out.println(e2.getAge());
		System.out.println(e2.getName());
		System.out.println(e2.getGender());
	
	}

}
