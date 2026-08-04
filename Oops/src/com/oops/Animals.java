package com.oops;

public class Animals {
	
	String type;
	
	int legs;
	
	String color;
	
	void sound(String value){
		String sound = value;
		System.out.println(type +" sounds "+ sound);
	}
	void eat(String value){
		String food = value;
		System.out.println(type +" is a "+ food);
	}
 	
}
