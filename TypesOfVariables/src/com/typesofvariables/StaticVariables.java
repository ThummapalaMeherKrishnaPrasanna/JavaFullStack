package com.typesofvariables;

public class StaticVariables{
	
	String EmployeeName;
	int EmployeeId;
	int salary;
	static String companyName;
	
	public StaticVariables(String empName , int empId, int sal){
		
		EmployeeName = empName;
		EmployeeId = empId;
		salary = sal;
		companyName = "BVC";
	}
	public static void main(String[] args) {
		 
		StaticVariables obj = new StaticVariables("Meher", 216, 10000);
		
		System.out.println(obj.EmployeeName);
		System.out.println(StaticVariables.companyName);
		
		StaticVariables objTwo = new StaticVariables("krushna", 218, 20000);
		
		StaticVariables.companyName = "BVC Odalarevu";
		
		
		System.out.println(objTwo.EmployeeName);
		System.out.println(StaticVariables.companyName);
	}
}
