package com.runnable;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		MyThread2  t1 = new MyThread2();
		
		Thread thread = new Thread(t1);
		
		thread.start();
		
		 
		for(int i=0; i<=10; i++){
			System.out.println("Nice");
		}
	}

}
