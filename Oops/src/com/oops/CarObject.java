package com.oops;

public class CarObject {
	public static void main(String[] args) {
		
		Cars myCar = new Cars();
		
		myCar.brand = "TATA";
		myCar.model = 568;
		myCar.color = "Black";

		
		System.out.println(myCar.brand);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		
		
		myCar.changeGear(1);
		myCar.acclerator(10);
		myCar.acclerator(10);
		myCar.changeGear(1);
		myCar.acclerator(20);
		myCar.appliedBreak(5);
		myCar.acclerator(20);
		myCar.changeGear(-2);
		myCar.appliedBreak(55);
		
		
		
	}
}
