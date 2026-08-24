package com;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorPract {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		System.out.println("--Through traditional for loop--");
		
		for(int i=0; i<list.size(); i++){
			
			if(list.get(i) == 20){
				int index = list.indexOf(20);
				list.remove(index);
			}	
			System.out.println(list.get(i));
		}
		
		System.out.println("20 is removed form the list");
		System.out.println(list);
		
		System.out.println("--Thorugh For each loop--");
		
		for(Integer num : list){
//			if(num == 20){
//				int index = list.indexOf(20);
//				list.remove(index);
//			}
			System.out.println(num);
		}
		System.out.println("--Through Iterator--");
		
		Iterator<Integer> iterator = list.iterator();
	    
		while(iterator.hasNext()){
			 
		     int num = iterator.next();
		     
			if(num == 30){
				iterator.remove();
			}
			System.out.println(num);
		}
		
		System.out.println("--30 is removed from the list--");
		System.out.println(list);
		
		System.out.println("---------------------------");
		list.add(1,20);
		list.add(2,30);
		
		System.out.println(list);
		
		System.out.println("ListIterator");
		
		ListIterator<Integer> iterator2 = list.listIterator();
		
		
		System.out.println(iterator2.hasNext());
		System.out.println(iterator2.next());
		System.out.println(iterator2.hasNext());
		System.out.println(iterator2.next());
		System.out.println(iterator2.hasNext());
		System.out.println(iterator2.next());
		System.out.println(iterator2.hasPrevious());
		System.out.println(iterator2.previous());
		System.out.println(iterator2.hasPrevious());
		System.out.println(iterator2.previous());	
		
		
	}	
	
	

}
