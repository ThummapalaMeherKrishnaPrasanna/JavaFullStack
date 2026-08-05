package com;

public class Test {

	public static void main(String[] args) {
		
		Student st2 = new Student();
        
		st2.age = 12;
		System.out.println(st2.age);
		st2.hii();
		
		
		System.out.println("-----------------Default----------------");
		String gender = st2.gender = "Male";
		System.out.println(gender);
	}

}
