package com;

public class Engine {
	
	int numOfCylinder;
	
	String fuelType;

	public Engine(int numOfCylinder, String fuelType) {
		super();
		this.numOfCylinder = numOfCylinder;
		this.fuelType = fuelType;
	}

	public Engine() {
		super();
	}

	@Override
	public String toString() {
		return "Engine [capacity=" + numOfCylinder + ", fuelType=" + fuelType + "]";
	}

	
	
}
