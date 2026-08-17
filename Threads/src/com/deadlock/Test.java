package com.deadlock;

public class Test {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.t2 = t2;
		t2.t1 = t1;
		
		t1.start();
		t2.start();
		
		System.out.println("Main");
		
	}

}
