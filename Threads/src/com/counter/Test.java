package com.counter;

public class Test {

	public static void main(String[] args) throws  InterruptedException{
		
		
		Counter counter = new Counter();
		
		Thread1 t1 = new Thread1(counter);
		Thread2 t2 = new Thread2(counter);
		
		t1.start();
		t2.start();
		
//		try{
//			Thread.sleep(1000);
//		}
//		catch(InterruptedException ex){
//			System.out.println(ex.getMessage());
//		}

		
		t1.join();
		t2.join();
		
		System.out.println("count : " + counter.count);

		
	}

}
