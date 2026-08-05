package com.thissuper;

public class Employee {
	
	String name;
	
	int age;
	
	int salary;
	
	static String companyName;
	
	public Employee(String name, int age, int salary, String companyName){
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		Employee.companyName = companyName;
		
	}
	
	void display(){
		
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.salary);
		System.out.println(Employee.companyName);
		
	}
	public Employee(){
		
	}
}
