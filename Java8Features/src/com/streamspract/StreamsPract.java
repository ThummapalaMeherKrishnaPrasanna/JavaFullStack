package com.streamspract;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;	
import java.util.Comparator;
import java.util.ArrayList;

public class StreamsPract {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(15,10,20,25,35,30,45);
		
		Stream<Integer> stream = nums.stream();
		
		stream.forEach((num) -> {System.out.println(num);});
		
		
		System.out.println("-----To print odd numbers from the list----");
		
			nums.stream()
			    .filter(num -> num % 2 !=0)
			    .forEach(num -> System.out.println(num));
		
		System.out.println("----To print even number from the list------");
		
			nums.stream()
				.filter((num) -> (num % 2 == 0))
				.forEach(num -> System.out.println(num));
		
		System.out.println("---- filtered values are assign to another list-----");
		
		List<Integer> list = nums.stream()
								 .filter(num -> num % 2 == 0)
								 .collect(Collectors.toList());
		
		System.out.println(list);
		
		System.out.println("---print values greater tha 20----");
		
		List<Integer> list1 = nums.stream()
								  .filter(num -> num > 20)
								  .toList();
							   // .collect(Collectors.toList());
		
		System.out.println(list1);
		
		System.out.println("---Sorting data to Ascending order---");
	
		List<Integer> list2 = nums.stream()
								  .sorted()
								  .toList();
		
		System.out.println(list2);
		
		System.out.println("---Sorting data to Descending order---");
		
		List<Integer> list3 = nums.stream()
								  .sorted(Comparator.reverseOrder())
								  .toList();
		
		System.out.println(list3);
		
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1, "Meher", 21000));
		empList.add(new Employee(2, "Krishna", 19000));
		empList.add(new Employee(3, "Prasanna", 25000));
		empList.add(new Employee(4, "Devanshi", 18000));
		
		System.out.println(empList);
		
		System.out.println("--Sorting the custom class object--");
		List<Employee> list4 = empList.stream()
									.sorted((emp1, emp2) -> emp1.salary - emp2.salary)
									.toList();
		System.out.println(list4);
		
		
		System.out.println("---To remove dulipcates from the List---");
		
		List<Integer> ages = Arrays.asList(10,10,15,21,24,15,30,24,35);
		System.out.println(ages);
		List<Integer> list5 = ages.stream()
								.distinct()
								.toList();
		
		System.out.println(list5);
		
		System.out.println("--To find the max number from the list");
			
		Integer maxValue = ages.stream()
							.distinct()
							.sorted(Comparator.reverseOrder())
							.findFirst()
							.get();
		
		System.out.println(maxValue);
		
		System.out.println("--To find the min number from the list");
		
		Integer minValue = ages.stream()
		    .distinct()
		    .sorted(Comparator.reverseOrder())
		    .skip(1)
			.findFirst()
			.get();
		
		System.out.println(minValue);
		
		System.out.println("--To find the third largest number from the list");
		
		
		Integer thirdLargestVal = ages.stream()
										.distinct()
										.sorted(Comparator.reverseOrder())
										.skip(2)
									    .findFirst()
									    .get();
		
		System.out.println(thirdLargestVal);
		
		System.out.println("--Find the first 3 largestnumbers into a list--");
		List<Integer> list6 = ages.stream()
								.distinct()
								.sorted(Comparator.reverseOrder())
								.limit(3)
								.toList();
		
		System.out.println(list6);
		
		
	} 

}
