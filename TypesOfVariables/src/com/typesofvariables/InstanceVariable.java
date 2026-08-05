package com.typesofvariables;

public class InstanceVariable {	
	
	String name;
	int rollNo;
	int age;
	String collage;
	public static void main(String[] args) {
		
		InstanceVariable one = new InstanceVariable();
		
		one.name = "Meher";
		one.rollNo = 216;
		one.age = 21;
		one.collage = "BVC Engineering college";
		
		InstanceVariable two = new InstanceVariable();
		
		two.name = "Krishna";
		two.rollNo = 218;
		two.age = 22;
		two.collage = "BVC Engineering college";
		
		two.name = "Prasanna";
		
		System.out.println(one.name);
		System.out.println(two.name);
		
		
	}
}
