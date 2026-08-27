package com.clone;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address = new Address(533201, "Amalapuram");
		
		Student st1 = new Student(1, "Meher" , 18, address);
		System.out.println(st1);

	    Student st2 = (Student) st1.clone();	
	    System.out.println(st2);
	    
	    st1.setId(12);
	    st1.setAge(21);
	    st1.setName("Krishna");
		st1.getAddress().setCity("Kakinada"); 
		
		System.out.println("====================");
		
		System.out.println(st1);
		System.out.println(st2);
		
		
	}

}
