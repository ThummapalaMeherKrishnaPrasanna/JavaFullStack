package com;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetPract {

	public static void main(String[] args) {
		
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		treeSet.add(12);
		treeSet.add(22);
		treeSet.add(25);
		treeSet.add(18);
		treeSet.add(78);
		treeSet.add(78);
		
		System.out.println(treeSet);
		
	//	treeSet.add(null);
		
		System.out.println(treeSet);
		
		System.out.println("--for each loop--");
		
		for(Integer num : treeSet){
			
			System.out.println(num);
		}
		
		System.out.println("--Iterator--");
		
		Iterator<Integer> iterator = treeSet.iterator();
		
		while(iterator.hasNext()){
			
			System.out.println(iterator.next());	
		}
	}
}
