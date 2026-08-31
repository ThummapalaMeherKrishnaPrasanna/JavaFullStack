package com.lambdaExpression;

public class Employee {
	
	int id;
	
	String name;
	
	int salary;

	String domain;

	

	public Employee(int id, String name, int salary, String domain) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.domain = domain;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", domain=" + domain + "]";
	}
	
	

}
