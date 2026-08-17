package com.callable;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Test {

	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			
			sc = new Scanner(System.in);
			
			System.out.println("Enter the First number");
			int a = sc.nextInt();
			
			System.out.println("Enter the second number");
			int b = sc.nextInt();
			
			Calculator cal = new Calculator(a,b);
			
			ExecutorService executor = Executors.newFixedThreadPool(3);
			
			Future<Integer> future =  executor.submit(cal);
			
		    executor.shutdown();
	    
		
			int sum = future.get();
			System.out.println(sum * 2);
			
		}
		catch (InterruptedException | ExecutionException e) {
			
			e.printStackTrace();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			sc.close();
		}
		
	}

}
