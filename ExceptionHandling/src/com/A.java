package com;

import java.util.*;

public class A {
	public static void main(String[] args) {
		
		Scanner sc = null;
		try{
			
		sc = new Scanner(System.in);
		
		System.out.println("Enter the num1 ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the num2");
		int num2 = sc.nextInt();
		
			System.out.println(num1/num2);
		
	    // NullPointerException
			String lastName = null;
			System.out.println(lastName.charAt(0));
	
		// StringIndexOutOfBoundsException	
			String name = "Meher";
			System.out.println(name.charAt(5));
		
		// ArrayIndexOutOfBoundsException	
		    int[] arr = {2,1,3};
		    System.out.println(arr[3]);
			
		}
		catch(InputMismatchException e){
			System.out.println("Enter valid input type " + e);
		}
		catch(StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e){
			System.out.println("IndexOutOfBounds" + e);
		}
		catch(ArithmeticException e){
			System.out.println("Don't divide with Zero " + e);
		} 
		catch(NullPointerException e){
			System.out.println("No value " + e);
			
		}
		catch(Exception e){
			//System.out.println(e.getMessage());
			System.out.println("Invalid " + e);
		}
		finally{
			sc.close();
			System.out.println("Scanner closed");
		}
		System.out.println("Great");
		
	}
}
