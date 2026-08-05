package com.thissuper;

public class Animal {
	
	String name;
	
	int noOfLegs;
	
	int age = 15;
	
	public Animal(String name, int noOfLegs, int age){
		
		this.name = name;
		this.noOfLegs = noOfLegs;
		this.age = age;
		
	}
	public Animal(){
		System.out.println("Animal object is created");
	}
	void display(){
		
		System.out.println(name);
		System.out.println(noOfLegs);
		System.out.println(age);
		
	}
}
