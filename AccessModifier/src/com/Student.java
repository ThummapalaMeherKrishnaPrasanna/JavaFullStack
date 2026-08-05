package com;

public class Student {
	
	public int age;
	
	private int password;
	
	protected int marks;
	
	String gender;
	
	public void hii(){
		System.out.println("Hii all");
	}
	
	public Student(int age){
		this.age = age;
	}
	
	public Student(){
		
	}
	
	protected void result(){
		
		System.out.println("Pass");
	}
	
	public static void main(String[] args) {
	
		System.out.println("-----------------public--------------");
		
		Student stu = new Student(21);
		System.out.println(stu.age);
		stu.hii();
		
		System.out.println("------------------private-----------");
		
		stu.password = 132456;
		System.out.println(stu.password);
		
		
		
	}
}
