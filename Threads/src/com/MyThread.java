package com;

public class MyThread extends Thread{
	
	public void run(){
		
//	 System.out.println(Thread.currentThread().getName());
	 Thread.currentThread().setName("Meher Thread");
	 
	 System.out.println("=========" + Thread.currentThread().getName());
	 
		for(int i=1; i<=10; i++){
			System.out.println("Wow");
		}
		
	}
	
}
