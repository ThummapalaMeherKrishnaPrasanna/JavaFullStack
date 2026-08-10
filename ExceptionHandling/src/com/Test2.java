package com;
import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Age : ");
		int age = sc.nextInt();
		
		
		if(age > 18){
			System.out.println("Eligible");
		}
		else{
			throw new InvaildAgeException("Age Below 18");
		}
		
		
	}

}
