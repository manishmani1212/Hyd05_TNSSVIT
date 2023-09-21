package com.coreconcepts.interfacee;

public class OnePlus5 implements Phone{

	@Override
	public String processor() {
		// TODO Auto-generated method stub
		return "SD835";
	}

	@Override
	public String OS() {
		// TODO Auto-generated method stub
		return "Android";
	}

	@Override
	public int spaceInGB() {
		// TODO Auto-generated method stub
		return 64;
	}
	
	public static void main(String[] args) {
		Phone oneplus = new OnePlus5();
		System.out.println("OS: "+ oneplus.OS());
		System.out.println("Processor: "+ oneplus.processor());
		System.out.println("spaceinGB: "+ oneplus.spaceInGB());
		
		Phone ios = new Iphone8();
		System.out.println("OS: "+ ios.OS());
		System.out.println("Processor: "+ ios.processor());
		System.out.println("spaceinGB: "+ ios.spaceInGB());
	}

}
