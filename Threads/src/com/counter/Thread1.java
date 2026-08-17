package com.counter;

public class Thread1 extends Thread{
	
	Counter counter;
	
	public Thread1(Counter counter){
		
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
