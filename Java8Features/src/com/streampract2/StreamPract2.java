package com.streampract2;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.Set;

public class StreamPract2 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,50,24,44,78);
			
		System.out.println("Additon with map");
		
	      List<Integer> list1 = list.stream()
							      	.map(n -> n+4)
							      	.toList();
	      
	      System.out.println(list1);
	     
	      System.out.println("Multiplication with map");
	      
	      List<Integer> list2 = list.stream()
						          .map(n -> n * 2)
						          .toList();
	      
	      System.out.println(list2);
	      
	      System.out.println("Multiple of 5 in the list after increment");
	      
	      List<Integer> mul = Arrays.asList(11,21,35,75,36); 
	      
	      List<Integer> list3 = mul.stream()
	    		  				.map(n  -> n + 4)
	    		  				.filter(n -> n % 5 == 0)
	    		  				.sorted(Comparator.reverseOrder())
	    		  				.limit(2)
	    		  				.toList();
	      
	      System.out.println(list3);
	   
	      
	      List<Employee> empList = new ArrayList<>();
	      
	      empList.add(new Employee(1, "Meher" , 20000));
	      empList.add(new Employee(2, "Krishna" , 23000));
	      empList.add(new Employee(3, "Prasanna" , 19000));
	      empList.add(new Employee(4, "Varaha" , 21000));
	      empList.add(new Employee(5, "Meher Krishna" , 28000));

	      List<String> list4 = empList.stream()
						      		.map(emp -> emp.getName())
						      		.toList();
						      
	      System.out.println(list4);
	      
	      System.out.println("------Employee orginal list---------");
	      
	      empList.stream()
	      		.forEach(emp -> System.out.println(emp));
	      
	      System.out.println("------Employee salary upadated list-------");
	      
	      empList.stream()
	      		 .map(emp -> new Employee(emp.getId() , emp.getName(), emp.getSalary() + 1000))
	             .forEach(emp -> System.out.println(emp));
	  
	      System.out.println("----Print Employee Names which starts with M ------");
	      
	      empList.stream()
	       		 .filter(emp -> emp.getName().startsWith("M"))
	      		 .map(emp -> emp.getName())
	      		 .forEach(emp -> System.out.println(emp));
	      
	      System.out.println("stream on Map Collections");
	      
	      Map<String , String > map = new HashMap<>();
	     
	      map.put("Meher", "Amalapuram");
	      map.put("Krishna", "Hyderabad");
	      map.put("Prasanna" , "Kakinada");
	      map.put("Varaha", "Amalapuram");
	      
	     System.out.println("-----print values based on location-----");
	     
	      map.entrySet()
	      	.stream()
	      	.filter(e -> e.getValue().equals("Amalapuram"))
	      	.forEach(e -> System.out.println( e.getKey() + " : " +  e.getValue()));
	       
	      System.out.println("----To print unique values from the map and stored in set");
	      
	      Set<String> set = map.entrySet()
						      	.stream()
						      	.map(e -> e.getValue())
						      	.collect(Collectors.toSet());
	      
	      System.out.println(set);
	     
	      System.out.println("----Print map using keySet()----");
	      
	      map.keySet()
		     .stream()
		     .forEach(e -> System.out.println(e));
	     
	      System.out.println("----Print map using values()----");
	     map.values()
	     	.stream()
	     	.forEach(e -> System.out.println(e));
	     
	     System.out.println("-----Print key and values based on the location and store back them into new map");
	     Map<String , String> map2 = map.entrySet()
									    .stream()
									    .filter(e -> e.getValue().equals("Amalapuram"))
									    .collect(Collectors.toMap(e -> e.getKey() , e -> e.getValue()));
	     
	     System.out.println(map2);
	     
	     
	     System.out.println("--sum method--");
	     System.out.println("----Add all the values in the list----");
	     
	     List<Integer> nums = Arrays.asList(10,20,30,40);
	     
	     int sum = nums.stream()
				     	.mapToInt(num -> num)
				     	.sum();
	     
	     
	     System.out.println(sum);
	     System.out.println("--To get the max value from the list--");
	     
	     int maxValue = nums.stream()
						     .mapToInt(n -> n)
						     .max()
						     .getAsInt();
	     
	     System.out.println(maxValue);
	     
	     System.out.println("--To get the min value from the list--");
	     
	     int minValue = nums.stream()
	    		 			.mapToInt(n -> n)
	    		 			.min()
	    		 			.getAsInt();
	     
	     System.out.println(minValue);
	     
	     System.out.println("-- To get the average value from the list");
	     
	     double avgValue = nums.stream()
	    		            .mapToInt(n -> n)
	                        .average()
	                        .getAsDouble();
	    		 		
	     		System.out.println(avgValue);				
	     
	     		
	     		System.out.println("allMatch");
	     		
	     List<Integer> list6 = Arrays.asList(10,25,36,40);
	     
	     	boolean allMatch = 	list6.stream()
						 		    .mapToInt(n -> n)
						 		    .allMatch(n -> n % 5 == 0);
	                
	     		System.out.println(allMatch);
	     		
	     	boolean anyMatch = list6.stream()
	     	                     .mapToInt(n -> n)
	     	                     .anyMatch(n -> n % 6 == 0);
	     	
	     	System.out.println(anyMatch);
	     	
	     	System.out.println("--List inside list---");
	     	
	     	List<List<String>> list7 = new ArrayList<List<String>>();
	     	
	     	list7.add(Arrays.asList("Meher" , "Krishna"));
	     	list7.add(Arrays.asList("Krishna" , "Krishna Prasanna"));
	     	list7.add(Arrays.asList("Meher Krishna " , "wow"));
	     	list7.add(Arrays.asList("Varaha" , "Chandra", "Mani" ));
	     	list7.add(Arrays.asList("Meher" , "Prasanna", "Right"));
	     	
	     	System.out.println(list7);
	     	
	     	System.out.println("----FlatMap list---");
	     	
	     	List<String> flatMapList = list7.stream()
							     	     .flatMap(li -> li.stream())
							     	     .toList();
	     	
	     	System.out.println(flatMapList);
	     	
//	     	 list7.stream()
//		     	     .flatMap(li -> li.stream())
//		     	     .forEach(li -> System.out.println(li));
	     	
	     	
	     	System.out.println("---Paritioning By multiple of 2 ---");
	     	
	     	List<Integer> list9 = Arrays.asList(10,21,22,17,11,20);
	     	
	        Map<Boolean, List<Integer>> collect = list9.stream()
	        .collect(Collectors.partitioningBy(n -> n  % 2 == 0));
	        
	        System.out.println(collect);
	        
	        
	        System.out.println("----ParallelStream----");
	        
	        List<Integer> list10 = Arrays.asList(10,20,30,40,50);
	        
	        list10.parallelStream()
	        .forEach(n -> System.out.println(n));
	        
	        
	        System.out.println("---reduce---");
	        
	        System.out.println("-- sum---");
	        Integer sum1 = list10.stream()
	        					.reduce(0, (a,b) -> a+b);
	        
	        System.out.println(sum1);
	        
	        System.out.println("---product ---");
	        Integer product = list10.stream()
	        		         .reduce(1, (a,b) -> a * b);
	        
	        System.out.println(product);
	        
	        System.out.println("----reduce list to string----");
	        List<String> name = Arrays.asList("Meher", "krishna", "Prasanna");
	        
	        String fullName = name.stream()
						        	.reduce("" , (a,b) -> a + " " + b)
						        	.trim();
						     
	        System.out.println(fullName);
	        
	        
	        
	        
	        
	        
	        
	}

}
