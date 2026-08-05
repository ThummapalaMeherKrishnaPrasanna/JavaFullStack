package com.thissuper;

public class Cat extends Animal{
	
	int age = 5;
	
	String food;
	
	String color;
	
	public Cat(String food, String color){
		
		this.food = food;
		this.color = color;
	}
	
	public Cat(String food){
		this("Milk" , "White");
		this.food = food;
	}
	
	public Cat(){
		this("Milk");
		System.out.println("Cat object is created");
	}
	
	
	void sound(){
		
		//System.out.println(super.age);
		
		System.out.println("Age : " + this.age);
		System.out.println("Animal Age : " + super.age);
		 
		System.out.println(this.color + " " + "Cat sound Meow....");
	}
}
