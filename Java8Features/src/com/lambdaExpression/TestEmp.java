package com.lambdaExpression;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestEmp {

	public static void main(String[] args) {
		
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee (1, "Meher", 21000, "Software Engineer"));
		empList.add(new Employee (4, "Prasanna", 25000, "Frontend develoer"));
		empList.add(new Employee (2, "Rajesh", 35000, "Full statck develoepr"));
		empList.add(new Employee (3, "Krishna", 45000, "Backend developer"));
		
		
		Collections.sort(empList , new IdComparator());
		
		System.out.println(empList);
		
		System.out.println("=================================");
		// lambda Expression 
		System.out.println("lambda Expression  sorted by id");
		Comparator<Employee> comparator = ( emp1 , emp2) -> emp1.salary - emp2.salary;
		
		Collections.sort(empList , comparator);
		System.out.println(empList);
		
		System.out.println("=================================");
		
		System.out.println("lambda Expression sorted by name");
		Comparator<Employee> comparator1 = (emp1, emp2) -> emp1.name.compareTo(emp2.name);
		
		Collections.sort(empList , comparator1);
		System.out.println(empList);
	}

}
