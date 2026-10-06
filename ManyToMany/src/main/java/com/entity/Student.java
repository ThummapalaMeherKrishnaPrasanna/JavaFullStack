package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studId;
	
	private String StudName;

	private int age;
	
    @ManyToMany
	@JoinTable(name = "student_courses" ,
			joinColumns = @JoinColumn(name = "student_id"),
			inverseJoinColumns = @JoinColumn(name = "course_id"))
	
	private List<Course> courses;

	
	public Student() {
		super();
	}


	public Student(String studName, int age) {
		super();
		StudName = studName;
		this.age = age;
	
	}


	public int getStudId() {
		return studId;
	}


	public void setStudId(int studId) {
		this.studId = studId;
	}


	public String getStudName() {
		return StudName;
	}


	public void setStudName(String studName) {
		StudName = studName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public List<Course> getCourses() {
		return courses;
	}


	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}


	@Override
	public String toString() {
		return "Student [studId=" + studId + ", StudName=" + StudName + ", age=" + age + ", courses=" + courses + "]";
	}
	
	
	
	
	
}
