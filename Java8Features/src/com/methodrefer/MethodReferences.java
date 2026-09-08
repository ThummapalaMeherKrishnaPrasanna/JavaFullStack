package com.methodrefer;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MethodReferences {

	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Meher", "Krishna", "Satya", "Varaha", "Rajesh");
		
		// Tradition way to call method
		names.stream()
		     .map(name -> name.toUpperCase())
		     .forEach(name -> System.out.println(name));
		
		// Using Method References while calling method
		names.stream()
	     .map(String::toUpperCase)
	     .forEach(System.out::println);
		
		
		
		List<Integer> nums = Arrays.asList(10,21,54,96,21,88,34,65,16,44,51);
		
		List<Integer> nums1 = Arrays.asList(10, 21, 54, 96, 21, 88, 34, 65, 16, 44, 51,
                2, 3, 5, 7, 11, 13);
		
		
		//Prime numbers should print
		nums1.stream()
		    .filter(num -> MethodReferences.isPrime(num))
		    .forEach(num -> System.out.println(num));
		
		System.out.println("==========");
		
		nums1.stream()
		     .filter(MethodReferences::isPrime)
		     .forEach(System.out::println);
		
		String name = "M$E%^H*(E@!R";
		
		// using Method references
		
		String collect = name.chars()
					     	.filter(Character::isAlphabetic)
						    .mapToObj(c -> String.valueOf((char) c))
						    .collect(Collectors.joining());
						    
		    System.out.println(collect);
		
	    String collect1 = name.chars()
		     	.filter(c -> Character.isAlphabetic(c))
			    .mapToObj(c -> String.valueOf((char) c))
			    .collect(Collectors.joining());
	   
	    System.out.println(collect1);
	}
	
	public static boolean isPrime(int num) {
		
		for(int i=2; i<=Math.sqrt(num); i++) {
			
			if(num % i == 0) {
				
				return false;
			}
		}
		return true;
	}

}
