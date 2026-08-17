package com.runnable;

public class MyThread2 implements Runnable{
	
	public void run(){
		
		Thread.currentThread().setName("Krishna Thread");
		System.out.println(Thread.currentThread().getName());
		for(int i=0; i<=10; i++){
			System.out.println("Wow");
		}
	}
}
