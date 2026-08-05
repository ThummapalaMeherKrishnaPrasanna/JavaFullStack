package com.access;

import com.Student;

public class Test2 extends Student{

	public static void main(String[] args) {
		
		Student st3 = new Student();
		st3.age = 13;
		
		System.out.println(st3.age);
		st3.hii();
		
		System.out.println("------------Protected----------------");
		Test2 st4 = new Test2();
		
		int marks = st4.marks = 90;
		System.out.println(marks);
		st4.result();
		
		
	}

}
