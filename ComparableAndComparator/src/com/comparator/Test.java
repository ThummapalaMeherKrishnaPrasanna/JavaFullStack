package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(3, "Prasanna", 98));
		list.add(new Student(1, "Krishna", 78));
		list.add(new Student(2, "Thummapala", 48));
		
		System.out.println(list);
		Collections.sort(list, new IdComparator());
		System.out.println("Id comparator");
		System.out.println(list);
		
		System.out.println("=============================");
		System.out.println(list);
		Collections.sort(list, new NameComparator());
		System.out.println("Id comparator");
		System.out.println(list);
		
		
	}

}
