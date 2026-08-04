package com.oops;

public class AnimalObject {
	public static void main(String[] args) {
		Animals myAnimal = new Animals();
		
		myAnimal.type = "bird";
		myAnimal.legs = 2;
		myAnimal.color = "white";
		
		myAnimal.sound("dhur dhur");
		myAnimal.eat("herbivours");
		
	}
}
