package com;

public class D implements C {

	@Override
	public void m1() {
		System.out.println("Hello m1");
	}

	@Override
	public void m2() {
		System.out.println("Hello m2");
	}

	@Override
	public void m3() {
		System.out.println("Hello m3");	
	}
	public static void main(String[] args) {
		
		D d = new D();
		
		d.m1();
		d.m2();
		d.m3();
	}
}
