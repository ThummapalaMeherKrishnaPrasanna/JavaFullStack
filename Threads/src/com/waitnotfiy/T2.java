package com.waitnotfiy;

public class T2 extends Thread{
	
	Object obj;
	
	public T2( Object obj){
		this.obj = obj;
	}
	
	public void run(){
		
		
		
		synchronized (obj){
			System.out.println("Thread 2 started");
			System.out.println("THread 2 notify All threads");
			
			
			try {
				
				Thread.sleep(5000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			obj.notifyAll();
		}
		
	}
}