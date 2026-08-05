package com.finalkeyword;

public class Student {
	
	String name;
	
	int age;
	
	int collegeId;
	
	final  String collegeName = "BVC Engineering colleges";
	
	final String city = "Amalapuram";
	
	public Student(String name, int age, int collegeId){
		
		this.name = name;
		this.age = age;
		this.collegeId = collegeId;
		
	}
	public Student(){
		System.out.println("Enter the student details");
	}
	
	void print(){
		
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.collegeId);
		System.out.println(this.collegeName);
		System.out.println(this.city);
		
	}
	
	final void studentReading(){
		
		System.out.println("Students are reading");
		
	}
	
}
