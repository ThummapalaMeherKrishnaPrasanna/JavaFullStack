package com.callable;

import java.util.concurrent.Callable;

public class Calculator implements Callable<Integer> {
	
	int a;
	int b;
	
	public Calculator(){
		
	}
	
	public Calculator(int a, int b){
		
		this.a = a;
		this.b = b;
	}
	
	public Integer call(){
		
		return a + b;
	}
	
}
