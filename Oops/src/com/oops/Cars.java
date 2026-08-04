package com.oops;

public class Cars {
	
	String brand;
	
	int model;
	
	String color;
	
	int speed;
	int gear;
	
	void acclerator(int value){
		speed += value;
		System.out.println("Speed Increased " + speed);	
	}
	void appliedBreak(int value){
    	speed -= value;
    	System.out.println("Break " + speed);
    }
	void changeGear(int value){
		gear = gear + value;
		System.out.println("Gear changed to " + gear);
	}
    

    
}
