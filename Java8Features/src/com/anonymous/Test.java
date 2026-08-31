package com.anonymous;

public class Test {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.noOfWheels();
		
		// Anonymous inner class
		
		Vehicle bike = new Vehicle() {
			
			public void noOfWheels() {
				
				System.out.println("Bike has 2 wheels");
			}
		};
		
	    bike.noOfWheels();
	   
	    

	}

}
