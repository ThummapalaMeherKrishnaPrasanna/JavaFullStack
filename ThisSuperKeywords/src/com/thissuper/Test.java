package com.thissuper;

public class Test {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.name = "Meher";
		emp.age = 21;
		emp.salary = 10000;
		
		Employee.companyName = "wOw";
		
		emp.display();
	}
}
