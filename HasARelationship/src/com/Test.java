package com;

public class Test {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.brand = "Tata";
		car.model = "nano";
		car.price = 400000;
		
		Engine engine = new Engine();
		engine.numOfCylinder = 4;
		engine.fuelType = "Petrol";
		
		car.engine = engine;
		
		System.out.println(car.brand);
		System.out.println(car.model);
		System.out.println(car.price);
		
		System.out.println(car.engine.numOfCylinder);
		System.out.println(car.engine.fuelType);
		System.out.println(car.engine);
		
		System.out.println("-----------2nd way--------------");
		System.out.println();
		
		Engine engine2 = new Engine(4,"Petrol");
		Car car2 = new Car("Audi","Q2",5500000,engine2);
		System.out.println(car2);
		
		System.out.println("------------3rd way--------------");
		System.out.println();
		
		Car car3 = new Car("Toyato","Innova",2300000,new Engine(4,"Disel"));
		System.out.println(car3);
		
		
		
	}

}
