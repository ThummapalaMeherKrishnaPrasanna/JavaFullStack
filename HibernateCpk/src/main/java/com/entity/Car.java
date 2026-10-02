package com.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity 
public class Car {
	
	@EmbeddedId
	private CarId carId;
	
	private String model;
	
	private String brand;
	
	private int price;

	public Car() {
		super();
	}

	public Car(CarId carId, String model, String brand, int price) {
		super();
		this.carId = carId;
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	public Car(String model, String brand, int price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	public CarId getCarId() {
		return carId;
	}

	public void setCarId(CarId carId) {
		this.carId = carId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", model=" + model + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
}
