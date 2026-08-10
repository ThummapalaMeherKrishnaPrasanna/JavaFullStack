package com;
import java.util.*;

public class B {

	public static int divide(){
		
		try{
			int num1 = 10;
			int num2 = 0;
		
			int result = num1/num2;
			return result;
		}
		catch(ArithmeticException e){
			System.out.println("Don't divide by zero" + e);
			return 1;
		}
		catch(Exception e){
			System.out.println("Invaild" + e.getMessage());
		}
		finally{
			return 18;
		}
	}
	public static void main(String[] args) {
		
		int res = divide();
		System.out.println(res);
	}
}
