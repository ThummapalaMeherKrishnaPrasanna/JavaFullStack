package com.methodrefer;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Arrays;


public class Test {

	public static void main(String[] args) {
		
		
		List<Employee> empList = new ArrayList<Employee>();		
		
		empList.add(new Employee(1, "Meher", 21000, new Department(15, "Software Enginner")));
		empList.add(new Employee(2, "Krishna", 20000, new Department(1, "Frontend developer")));
		empList.add(new Employee(3, "Satya", 22000, new Department(11, "Backend Developer")));
		empList.add(new Employee(4, "Varaha", 24000, new Department(16, "Full stack developer")));
		
		
		Map<String , Long> collect = empList.stream()
				              .collect(Collectors.groupingBy(
				    		   emp -> emp.getDepartment().getDeptName(),
				    		   Collectors.counting()		   
				    		   ));
		
		System.out.println(collect);
		
		
		// using Method references
		
		Map<String, Long> collect2 = empList.stream()
						       .collect(Collectors.groupingBy(
						        Employee::getDepartmentName	,	   
						        Collectors.counting() ));
						
		System.out.println(collect2);
		
		
		
		List<Integer> stuAge = Arrays.asList(21,22,21,22,20);
			
		List<Student> list = stuAge.stream()
						       .map(age -> new Student(age))
						       .toList();
		
	    System.out.println(list);
	    
	    List<Student> list2 = stuAge.stream()
					    	  .map(Student::new)
					    	  .toList();
	    
	    System.out.println(list2);
	   
	}

}
