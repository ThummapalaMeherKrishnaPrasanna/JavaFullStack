package com.optionalpract;

import java.util.Optional;

public class OptionalPract {
		
	public static void main(String[] args) {
		
		String name = "Meher";
		
		System.out.println(name);
		
		String name2 = "Meher Krishna";
		
		System.out.println(name2.length());
		
		Optional<String> name3 = Optional.of("Meher");
		
		System.out.println(name3.get());
		
		Optional<String> name4 = Optional.empty();
		
//		System.out.println(name4.get().length());
		
		Optional<String> name5 = Optional.ofNullable("Satya");
		
	    System.out.println(name5.get());
	    
	    Optional<String> name6 = Optional.ofNullable(null);
	    
	  //  System.out.println(name6.get());
	    
	    System.out.println(name6.orElse("Invalid value"));
	    
	 //   System.out.println(name6.orElseThrow( () -> new RuntimeException("Exception")));
	   
	    
	    Optional<String> name7 = Optional.ofNullable(null);
	    
	    if(name7.isPresent()) {
	    	System.out.println(name7.get());
	    }
	    else {
	    	System.out.println("Invalid value");
	    }
	  
	    
	}
}
