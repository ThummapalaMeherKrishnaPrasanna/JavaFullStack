package com;

public class Employee {
	
	private int age;
	
	private String name;
	
	private String domain;

	public Employee(){
		
	}
	
	public Employee(int age, String name, String domain) {
		
		this.age = age;
		this.name = name;
		this.domain = domain;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDomain() {
		return domain;
	}

	public void setBranch(String branch) {
		this.domain = branch;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", domain=" + domain + "]";
	}
	
	
	
	
}
