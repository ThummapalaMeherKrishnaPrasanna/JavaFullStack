package com.comparable;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(2, "Meher", 95));
		list.add(new Student(3, "Krishna", 84));
		list.add(new Student(1, "Prasanna",101));
		
		
		System.out.println(list);
		
	    Collections.sort(list);
	    
		System.out.println(list);
	}

}
