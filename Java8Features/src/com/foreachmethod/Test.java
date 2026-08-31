package com.foreachmethod;

import java.util.List;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		nums.add(15);
		nums.add(10);
		nums.add(20);
		nums.add(25);
		nums.add(35);
		
		nums.forEach((num) -> { System.out.println(num);});
		
		System.out.println("=========================");
		
		nums.forEach(num ->  System.out.println(num));
		
		
		
		
		
	}

}
