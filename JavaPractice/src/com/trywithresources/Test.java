package com.trywithresources;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the number1");
			int num1 = sc.nextInt();
			System.out.println("Enter the number2");
			int num2 = sc.nextInt();
			int result = num1 / num2;
			System.out.println(result);
		}
		catch(Exception ex){
			
			System.out.println(ex.getMessage());
		}

	}

}
