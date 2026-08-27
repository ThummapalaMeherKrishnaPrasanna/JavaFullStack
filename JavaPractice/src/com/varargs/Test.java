package com.varargs;

public class Test {
	
	public static void sum(int... nums){
		
		int sum = 0;
		
		for(int num : nums){
			sum += num;
		}
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		
		sum(10,20,30,40);
		sum(10,20);
		sum(30,40);

	}

}
