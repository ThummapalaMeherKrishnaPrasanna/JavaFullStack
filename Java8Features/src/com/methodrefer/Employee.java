package com.methodrefer;

public class Employee {
	
	int empId;
	
	String empName;
	
	int salary;
	
	Department department;
    
	
	public Employee() {
		super();
	}


	public Employee(int empId, String empName, int salary, Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.department = department;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}
   
	public String getDepartmentName() {
		
		return department.getDeptName();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", department=" + department
				+ "]";
	}
	
	
}
