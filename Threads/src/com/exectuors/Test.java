package com.exectuors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	public static void main(String[] args) {
		
		Executor t1 = new Executor();
	
	    ExecutorService executor = Executors.newFixedThreadPool(5);
	    
	    executor.execute(t1);
	    
	    executor.shutdown();
	    
	    
	    ExecutorService ex2 = Executors.newSingleThreadExecutor();
	    
	    ex2.execute(t1);
	    
	    executor.shutdown();
	}

}
