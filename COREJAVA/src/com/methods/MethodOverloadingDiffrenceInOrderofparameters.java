package com.methods;

public class MethodOverloadingDiffrenceInOrderofparameters {
	
	public static void main(String[] args) {
		
		MethodOverloadingDiffrenceInOrderofparameters m1 = new MethodOverloadingDiffrenceInOrderofparameters();
		m1.orderParameters(10,"Ajay");
		m1.orderParameters("Ajay", 10);
		
	}
	
	public void orderParameters(int id,String name){
		System.out.println("id:" + id + "name:" + name);
	}	
 
	public  void orderParameters(String name,int id){
		System.out.println("id:" + id + "name:" + name);
	}

}
