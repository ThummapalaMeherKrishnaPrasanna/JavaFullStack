package com.inheritance;

public class Test {
	
	public static void main(String[] args) {
		
		Parent par = new Parent();
		
		System.out.println(par.a);
		par.m1();
		
		Child chil = new Child();
		
		System.out.println(chil.b);
		chil.m1();
		chil.m2();
		
		
	}
}
