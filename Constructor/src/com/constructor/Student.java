package com.constructor;

public class Student {
	
	String name;
	int rollno;
	int age;
	
	public Student(String value, int num , int a){
	     name = value;
	     rollno = num;
	     age = a;
	}
	public Student(String value, int num){
		 name = value;
		 rollno = num;
	}
	
	public Student(){
		System.out.println("System the student name ");
	}
    
	
	void print(){
		System.out.println(this.name);
		System.out.println(this.rollno);
		System.out.println(this.age);
	}
	
}
