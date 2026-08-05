package com.typesofvariables;

public class Test {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.name = "Meher";
		emp1.age = 21;
		emp1.salary = 1000;
		Employee.companyName = "FLM";
		
		
		Employee emp2 = new Employee();
		
		emp2.name = "Krishna";
		emp2.age = 22;
		emp2.salary = 2000;
		
//		emp2.companyName = "Oracle";
		
		System.out.println(emp1.name);
		System.out.println(Employee.companyName);
		System.out.println();
		System.out.println(emp2.name);
		System.out.println(Employee.companyName);
		
	}

}
