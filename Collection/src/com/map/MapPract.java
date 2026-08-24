package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapPract {

	public static void main(String[] args) {
		
		System.out.println("Map");
		
		Map map = new HashMap();

		map.put(1, "Meher");
		map.put("Krishna", 2);
		map.put(true, 3);
		map.put(12, 15);
		map.put(15, "Prasanna");
		map.put("Thummapala", 78);
		map.put(null, null);
		map.put(null, "Meher krishna");
		
		System.out.println("--Hetrogenous data--");
		System.out.println(map);
		
		System.out.println("============================");
		System.out.println("HashMap");
		
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Meher");
		map1.put(10, "Krishna");
		map1.put(3, "Prasanna");
		map1.put(11, "Rajesh");
		map1.put(5, "Jagadeesh");
		map1.put(6, "Varaha");
		map1.put(16, "Lalitha");
		map1.put(8, "Vani");
		map1.put(29, "Satya");
		System.out.println("--Generics data--");
		System.out.println(map1);
		
		System.out.println("==============================");
		
		System.out.println("--keySet--");
		
		for(Integer key : map1.keySet()){
			
			System.out.println(key + " - " + map1.get(key));
		}
		
		System.out.println("==============================");
        System.out.println("--Values--");
        
		Collection<String> values = map1.values();
		 
		System.out.println(values);
		
		System.out.println("==============================");
		
		System.out.println("--Entry set--");
		
		Set<Entry<Integer, String>> entrySet = map1.entrySet();
		
		for(Map.Entry<Integer, String> entry : entrySet){
			
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		System.out.println("=====================================");
		
		System.out.println("--Iterator--");
		
		Iterator<Entry<Integer, String>> iterator = map1.entrySet().iterator();
		
		while(iterator.hasNext()){
			
			Entry<Integer, String> entry = iterator.next();
			
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		System.out.println("====================================");
		System.out.println("--LinkedHashMap--");
		
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(1, "Meher");
		linkedHashMap.put(20, "Krishna");
		linkedHashMap.put(41, "Prasanna");
		linkedHashMap.put(7, "Rajesh");
		linkedHashMap.put(null, "wow");
		
		for(Integer key : linkedHashMap.keySet()){
			
			System.out.println(key + " = " + linkedHashMap.get(key));
		}
		
		System.out.println("=====================================");
	    System.out.println("--TreeMap--");
	    
	    TreeMap<Integer ,String> treeMap = new TreeMap<>();
	    
	    treeMap.put(1, "meher");
	    treeMap.put(5, "Krishna");
	    treeMap.put(11, "Prasanna");
	    treeMap.put(2, "Wow");
	    treeMap.put(7, "Rajesh");
	    treeMap.put(3, "Krishna");
	    
	   Set<Entry<Integer, String>> entrySet3 = treeMap.entrySet();
	   
	    for(Map.Entry<Integer, String> entry : entrySet3){
	    	
	    	System.out.println(entry.getKey()+ " = " + entry.getValue());
	    }
	    
	}

}
