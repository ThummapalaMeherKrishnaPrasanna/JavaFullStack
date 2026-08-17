package com.counter;

public class Thread2 extends Thread{
	
	Counter counter;
	
	public Thread2(Counter counter){
		
		this.counter = counter;
	}
	
	public void run(){
		
		for(int i=1; i<=1000; i++){
			
			 try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			counter.increment();
		}
	} 
	
}
