package com.clone;

public class Student implements Cloneable{
	

	private int id;
	
	private String name;
	
	private int age;
	
	private Address address;

	public Student() {
		super();
	}
	
	public Student(int id, String name, int age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	// copy constructor 
	public Student(Student stu){
		
		this.id = stu.id;
		this.name = stu.name;
		this.age = stu.age;
		this.address = new Address(stu.address);
		
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return new Student(this);
	}
	
	
}
