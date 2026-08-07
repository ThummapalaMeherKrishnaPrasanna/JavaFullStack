package com;

import java.util.Objects;

public class Employee {
	
	int id;
	
	String name;
	
	public Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	public Employee(){
		
	}
	
	public boolean equals(Object obj){
		
		Employee employee = (Employee) obj;
		
		boolean result = (this.id == employee.id) && (this.name.equals(employee.name));
		
		return result;
	}
	
	public int hashCode(){
		
		return Objects.hash(this.id, this.name);
	}
	
	public String toString(){
		
		return "["+this.id + " , " + this.name+"]";
	}
}
