package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int StudentId;
	
	private String name;
	
	private int age;
	
	@JoinColumn(name = "dept_id")
	@ManyToOne
	private Department department;

	
	public Student() {
		super();
	}
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public Student(String name, int age, Department department) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", name=" + name + ", age=" + age + ", department=" + department
				+ "]";
	}

	
	
	
	
	
	
}
