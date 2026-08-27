package com.comparable;

public class Student implements Comparable<Student>{
	
	int id;
	
	String name;
	
	int marks;
	
	public Student(){
		
	}
	
	public Student(int id, String name , int marks){
		
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student student){
		
		return this.id - student.id;
	}
	
//	@Override
//	public int compareTo(Student student){
//		
//		return student.marks - this.marks;
//	}
}
