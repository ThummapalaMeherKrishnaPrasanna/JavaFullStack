package com;


public class Test {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 0;
		
		try{
			if(num2 == 0){
				throw new ArithmeticException(); 
			}
		}
		catch(ArithmeticException ex){
			System.out.println("Don't divide with Zero");
			
		}
		
		System.out.println("Hello");
       
		int res = num1 / num2;
		System.out.println(res);
	}

}
