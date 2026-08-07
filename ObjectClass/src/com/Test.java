package com;

public class Test {

	public static void main(String[] args) {
		
		Employee st = new Employee(1, "Meher");
		
		Employee st1 = new Employee(2, "Krishna");
		
		Employee st2 = new Employee(2, "Krishna");
		
		boolean isEqual = st.equals(st1);
		System.out.println(isEqual);
		
		boolean isEqual1 = st1.equals(st2);
		System.out.println(isEqual1);
		
		Employee st3 = new Employee(3, "Meher");
		Employee st4 = new Employee(3, "Meher");
		
		int st3Hashcode = st3.hashCode();
		int st4Hashcode = st4.hashCode();
		
		System.out.println(st3Hashcode);
		System.out.println(st4Hashcode);
		
		
		System.out.println(st3);
		System.out.println(st1);
		System.out.println(st);
		System.out.println(st2);
		
	}

}
