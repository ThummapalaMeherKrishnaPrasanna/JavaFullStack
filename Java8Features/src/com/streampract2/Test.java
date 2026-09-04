package com.streampract2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Map;
import java.util.Comparator;

public class Test {

	public static void main(String[] args) {
		
		List<Student> stuList = new ArrayList<Student>();
		
		stuList.add(new Student(1, "Meher" , 21, new Branch(220, "EEE")));
		stuList.add(new Student(2, "Krishna" ,20, new Branch(149, "ECE")));
		stuList.add(new Student(3, "Varaha" , 23, new Branch(204, "CSE")));
		stuList.add(new Student(4, "Satya" , 20, new Branch(220, "EEE")));
		stuList.add(new Student(5, "Prasanna" , 20, new Branch(149, "ECE")));
		stuList.add(new Student(6, "Satya Vathi" , 18, new Branch(204, "CSE")));
		stuList.add(new Student(7, "Rajesh" , 20, new Branch(201, "Mech")));
		stuList.add(new Student(8, "Krishna prasanna" ,19, new Branch(149, "ECE")));
	       
		
//		
		System.out.println("=====Grouping students based on the deparment=====");
		
		Map<String , List<Student>> collect = stuList.stream()
		       .collect(Collectors.groupingBy(stu -> stu.getBranch().getBranchName()));
		
		System.out.println(collect);
		
		System.out.println("========================");
		
		collect.entrySet()
				.stream()
				.forEach(stu -> System.out.println(stu.getKey() + " " + stu.getValue()));
		
		
		System.out.println("============Count of students in each department==============");
		
		Map<String , Long> collect2 = stuList.stream()
		       .collect(Collectors.groupingBy(c -> c.getBranch().getBranchName() , Collectors.counting()));
		
		System.out.println(collect2);
		
		
		System.out.println("==============Average age of students in each department==============");
		
		Map<String, Double> collect3 = stuList.stream()
		       .collect(Collectors.groupingBy(stu -> stu.getBranch().getBranchName() , Collectors.averagingDouble(stu -> stu.getAge())));
		
		collect3.entrySet()
		        .stream()
		        .forEach(stu -> System.out.println(stu.getKey()+ " = " + stu.getValue()));

		System.out.println("----------------------------------");
		
		Map<String , Long> collect4 = stuList.stream()
								.collect(Collectors.groupingBy(stu -> stu.getBranch().getBranchName(), Collectors.counting()));
		
		
		System.out.println(collect4);
		
		
		collect4.entrySet()
		        .stream()
		        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		        .limit(1)
		        .forEach(e -> System.out.println(e.getKey() + " = " + e.getValue()));
		
		
		
		
		
		        
		
	}

}
