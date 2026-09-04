package com.streampract2;

public class Student {
		
	int id;
	
	String name;
	
	int age;
	
	Branch branch;
	

	public Student() {
		super();
	}


	public Student(int id, String name, int age, Branch branch) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.branch = branch;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Branch getBranch() {
		return branch;
	}


	public void setBranch(Branch branch) {
		this.branch = branch;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", branch=" + branch + "]";
	}
	
	
	
	
}
