package com.finalkeyword;

public class Test extends Student{
	
	
	public static void main(String[] args) {
		
		Student stu = new Student("Meher", 21, 218);
		Student stu2 = new Student("Krishna", 22 , 216);

		
	// Student.collegeName = "WOw";
		
		stu.print();
		System.out.println("======================");
		stu2.print();
		
		System.out.println("=======================");
		
		Test t1 = new Test();
		t1.studentReading();
		
	}

}
