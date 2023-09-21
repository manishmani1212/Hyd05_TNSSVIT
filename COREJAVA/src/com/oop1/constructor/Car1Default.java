package com.oop1.constructor;

public class Car1Default {
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public Car1Default() {
		doors = "closed";
		engine = "on";
		driver= "seated";
		speed = 10;
	}
	
	public String run() {
		if(doors.equals("closed") && engine.equals("on")&& driver.equals("seated") 
				&& speed >0) {
			return "car is running";
		}
		else{
			return "car is not running";
		}
	}

}
