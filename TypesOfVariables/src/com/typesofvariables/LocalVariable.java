package com.typesofvariables;

public class LocalVariable {
	int x;
	void sum(){
		int a = 0;
		System.out.println(a);
		System.out.println(x);
	}
	
	void add(){
	
	}
	public static void main(String[] args) {
		
		String Name = "meher";
		System.out.println(Name);
		
		LocalVariable obj = new LocalVariable();
		
		obj.sum();
	}
}
