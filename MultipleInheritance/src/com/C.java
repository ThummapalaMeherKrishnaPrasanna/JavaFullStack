package com;

public class C implements A , B{
    
	static int age = 20;
	
	@Override
	public void m3() {
		System.out.println("Method 3");
		
	}

	@Override
	public void m1() {
		System.out.println("Method 1");
		
	}

	@Override
	public void m2() {
		System.out.println("Method 2");
		
	}

	public static void main(String[] args) {
		
		C c = new C();
		
		c.m1();
		c.m2();
		c.m3();
		
		System.out.println();
		
		System.out.println(A.age);
		System.out.println(B.age);
		
		System.out.println(C.age);
		
		
	}

}
