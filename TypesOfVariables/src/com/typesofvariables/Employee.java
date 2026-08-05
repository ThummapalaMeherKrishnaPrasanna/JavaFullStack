package com.typesofvariables;

public class Employee {
	
	String name;
	
	int age;
	
	int salary;
	
	static String companyName;
	
	public Employee(String empname, int empAge, int empSalary, String empCompanyName){
		
		name = empname;
		age = empAge;
		salary = empSalary;
		companyName = empCompanyName;
	}
	
	public Employee(){
		
	}
}
