package com.funcinterfaceanddefaultstatic;

@FunctionalInterface
public interface Car {
	
	void noOfWheels();
	
	
	default void airBags() {
		
		System.out.println("2 airbags");
	}
	
	static void headLight() {
		
		System.out.println("Turn on");
	}
}
