package com;

import java.util.HashSet;

public class HashSetPract {

	public static void main(String[] args) {
		
	  HashSet<Integer> set = new HashSet<>();
	  
	  set.add(10);
	  set.add(20);
	  set.add(40);
	  set.add(60);
	  set.add(9);
	  
	  System.out.println(set);
	  
	  System.out.println(set.contains(12));
	  
	  set.add(null);
	  set.add(null);
	  
	  System.out.println(set);
	  
	 set.remove(10);
	 System.out.println(set);
	 
	 System.out.println("--for each loop--");
	 
	 for(Integer num : set){
		 System.out.println(num);
	 }
	 
	 
	 
	}

}
