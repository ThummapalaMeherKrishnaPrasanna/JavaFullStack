package com.streampract2;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;


public class StreamPract3 {

	public static void main(String[] args) {
		
      	
		String name = "MEHERKRISHNA";
		
		name.chars()
		    .mapToObj(c -> (char)c)
		    .forEach(c -> System.out.println(c));
	
  // retrive character by character and store in list	
	
		List<Character> list = name.chars()
		    .mapToObj(c -> (char)c)
		    .toList();
		
		System.out.println(list);
		
  // remove the duplicates from the string
		
		List<Character> list1 = name.chars()
									.distinct()
									.mapToObj(c -> (char)c)
									.toList();
		
		System.out.println(list1);
		
 // remove the duplicates from the string and reassign to new string 
		
         String name2 = name.chars()
		                    .distinct()
		                    .mapToObj(c -> String.valueOf((char) c))
		                    .collect(Collectors.joining());
         
         System.out.println(name2);
         
 
// MEHERKRISHNA   --> M-E-H-E-R-K-R-I-S-H-N-A  Store in the string
         
         
         
         String name3 = "MEHERKRISHNA";
         
         String name4 = name3.chars()
				              .mapToObj(c -> String.valueOf((char)c))
				              .collect(Collectors.joining(","));
         
         System.out.println(name4);
         
         
         
  // T MEHER KRISHNA   -> T-M-E-H-E-R-K-R-I-S-H-N-A
         
        String name5 =  "T MEHER KRISHNA";
         
        String name6 =  name5.chars()
				              .filter(c -> c != ' ')
				              .mapToObj(c -> String.valueOf((char)c))
				              .collect(Collectors.joining("-"));
        
        System.out.println(name6);
        
  // MEHER ->  Do not use list and array in operations
  // but o/p should look like [M,E,H,E,R]      
        
        String name7 = "MEHER";
        
        String name9 = name7.chars()
			             .mapToObj(c -> String.valueOf((char) c))
			             .collect(Collectors.joining( "," , "[" , "]"));
        
        
		System.out.println(name9);
		
		String name10 = "FRONT LINES EDUTECH";
		
		String[] split = name10.split(" ");
		
		System.out.println(Arrays.toString(split));
		
	    String collect = Arrays.stream(split)
	    					.collect(Collectors.joining("-"));
	    
	    System.out.println(collect);
	    
	    
	    String value = "My name name is is meher krishna";
	    
	    System.out.println(value);
	    
	    String[] values = value.split(" ");
	    
        String collect2 = Arrays.stream(values)
				               .distinct()
					           .collect(Collectors.joining(" "));
        
        System.out.println(collect2);
        
        
	   	String firstValueInWord =  Arrays.stream(values)
	   			                    // .distinct()
							   	       .map(val -> String.valueOf(val.charAt(0)))
							   	       .collect(Collectors.joining());
	   	
	   System.out.println(firstValueInWord);
	   
	   
	   String groupBy = "java";
	   
	   Map<Character, Long> groupl = groupBy.chars()
		          .mapToObj(c -> (char)c)
		          .collect(Collectors.groupingBy(c -> c , Collectors.counting()));
	  
	   System.out.println(groupl);
	   
	   String[] values2 = value.split(" ");
	   
	   Map<String, Long> collect3 = Arrays.stream(values2)
	         .collect(Collectors.groupingBy(c -> c , Collectors.counting()));
	   
	   System.out.println(collect3);
	   
	   
	   String name11 = "MEHERKRISHNA";
	   
	   Map<Character, Long> collect4 = name11.chars()
		         .mapToObj(c -> (char)c)
		         .collect(Collectors.groupingBy(c -> c ,  Collectors.counting()));
		   
		   System.out.println(collect4); 
		   
	   Map<Character, Long> collect5 = name11.chars()
	         .mapToObj(c -> (char)c)
	         .collect(Collectors.groupingBy(c -> c , () -> new TreeMap<>(), Collectors.counting()));
	   
	   System.out.println(collect5);
	   
	      
       
	}

}
