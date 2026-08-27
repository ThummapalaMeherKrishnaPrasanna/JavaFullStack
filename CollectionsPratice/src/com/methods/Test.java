package com.methods;

import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
			
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(112);
		list.add(30);
		list.add(150);
		list.add(70);
		list.add(15);
		
		System.out.println(list);
		
		
		System.out.println("--sort--");
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("--reverse--");
		Collections.reverse(list);
		System.out.println(list);
		
		System.out.println("--shuffle--");
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println("--max value in the List--");
		Integer max = Collections.max(list);
		System.out.println(max);
		
		System.out.println("--min value in the List--");
		Integer min = Collections.min(list);
		System.out.println(min);
		
		list.add(15);
		
		System.out.println("--frequency--");
		Integer frequency = Collections.frequency(list, 15);
		System.out.println(list);
		System.out.println(frequency);
		
		System.out.println("--swap--");
		System.out.println(list);
		Collections.swap(list, 1, 2);
		System.out.println(list);
		
		System.out.println("--rotate--");
		System.out.println(list);
		Collections.rotate(list, 1);
		System.out.println(list);
		
		System.out.println("--replaceAll--");
		System.out.println(list);
		Collections.replaceAll(list, 15, 18);
		System.out.println(list);
		
		System.out.println("=============================");
		
		List<Integer> list1 = List.of(10,20,30,40,50);
	
		System.out.println(list1);
		
		List<Integer> list2 = Arrays.asList(20,30,45,50);
		
		System.out.println(list2);
		
		
		
	}

}
