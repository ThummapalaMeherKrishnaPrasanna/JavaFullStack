package com;

import java.awt.List;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListPract {

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(30);
		
		System.out.println(linkedList.size());
		
		System.out.println(linkedList.get(2));
		
		System.out.println("--Traditional for loop--");
		
		for(int i=0; i<linkedList.size(); i++){
			System.out.println(linkedList.get(i));
		}
		
		System.out.println("--Iterate through for each loop--");
		for(Integer num : linkedList){
			
			System.out.println(num);
		}
		
		System.out.println("--iterate through Iterator--");
		
		Iterator<Integer> iterator = linkedList.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		
	}

}
