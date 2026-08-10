package com;

public class Employee {
	
	String name;
	
	String domain;
	
	int age;
	
	double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
    
	
	public Employee(String name, String domain, int age, double salary) {
		super();
		this.name = name;
		this.domain = domain;
		this.age = age;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", domain=" + domain + ", age=" + age + ", salary=" + salary + "]";
	}
	
	public void display(){
		System.out.print(this.name + " ");
		System.out.print(this.domain + " ");
		System.out.print(this.age + " ");
		System.out.print(this.salary + " ");
		System.out.println();
		
	}
	
}
