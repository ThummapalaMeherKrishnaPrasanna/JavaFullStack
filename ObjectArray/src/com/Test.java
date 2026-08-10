package com;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of employees : ");
		int size = sc.nextInt();
		
		Employee[] employee = new Employee[size];
		
		
//		Employee emp = new Employee("Meher", "Intern", 21, 10000);
		
//		employee[0] = emp;
//		
//		System.out.println(emp.name);
		
		for(int i=0; i<size; i++){
			
			System.out.print("Enter employee name : ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Enter employee domain : ");
			String domain = sc.nextLine();
			
			System.out.print("Enter employee age : ");
			int age = sc.nextInt();
			
			System.out.print("Enter employee salary : ");
			int salary = sc.nextInt();
			
			employee[i] = new Employee(name, domain, age, salary);
		}
		
		
		   for(int i=0; i<employee.length; i++){
			   
			   employee[i].display();
		   }
	}

}
