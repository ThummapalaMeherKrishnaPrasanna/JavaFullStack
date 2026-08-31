package com.lambdaExpression;

public class Test {

	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		
		Thread t1 = new Thread(myThread);
		t1.start();
		
		
		Runnable runnable = () -> { System.out.println(Thread.currentThread().getName());};
		
		Thread t2 = new Thread(runnable);
		t2.start();
		

	}

}
