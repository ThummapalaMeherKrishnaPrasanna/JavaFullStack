package com.deadlock;

public class Thread1 extends Thread{
	
	Thread2 t2;
	
	public void run(){
		
		
		 try {
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Thread 1");
	}
}
