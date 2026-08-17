package com.deadlock;

public class Thread2 extends Thread{
	
	Thread1 t1;
	
	public void run(){
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread 2");
	}
	
}
