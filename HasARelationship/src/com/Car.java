package com;

public class Car {
		
	String brand;
	
	String model;
	
	int price;
	
	Engine engine;

	public Car(String brand, String model, int price, Engine engine) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.engine = engine;
	}

	public Car() {
		super();
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", price=" + price + ", engine=" + engine + "]";
	}

	
}
