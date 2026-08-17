package com.waitnotfiy;

public class T1 extends Thread{
	
	Object obj;
	
	public T1( Object obj){
		this.obj = obj;
	}
	
	public void run(){
		
		
		
		synchronized(obj){
		System.out.println("Thread 1 started");
		System.out.println("Thread 1 entering to waiting state");
			try {
				obj.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("Thread 1 is resumed");
	}
	
	
}