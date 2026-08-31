package com.lambdaExpression;

public class TestCal {

	public static void main(String[] args) {
		
	    
		Calculator calculator = ( a, b) -> {
		
				int c = a + b;
				return c;
			};
			
			int res = calculator.sum(10,20);
			System.out.println(res);

	}

}
