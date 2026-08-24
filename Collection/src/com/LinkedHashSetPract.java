package com;

import java.util.LinkedHashSet;

public class LinkedHashSetPract {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> linkedHashSet  = new LinkedHashSet<>();
		
		linkedHashSet.add(50);
		linkedHashSet.add(30);
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add(30);
		
		
		System.out.println(linkedHashSet);
		
		linkedHashSet.add(null);
		linkedHashSet.add(null);
		 
		System.out.println(linkedHashSet);
	}

}
