package com.thissuper;

public class AmalapuramCat extends Cat{
	int age = 30;
	String health;
	
	public AmalapuramCat(String health){
		
		this.health = health;
		
	}
	
	public AmalapuramCat(){
		System.out.println("Amalapuram cat object is created");
	}
	
	void print(){
		System.out.println(super.age);
		System.out.println(this.age);
		System.out.println(this.health);
		
		
	}
}
