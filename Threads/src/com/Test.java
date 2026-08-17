package com;

public class Test {

	public static void main(String[] args) {
		
	    System.out.println("========"+Thread.currentThread().getName());
	    
		MyThread thread = new MyThread();
		thread.start();
		
		for(int i=1; i<= 10; i++){
			System.out.println("Nicee");
		}
		
		

	}

}
