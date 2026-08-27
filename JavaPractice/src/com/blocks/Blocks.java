package com.blocks;

public class Blocks extends BlocksParent{
	
	Blocks(){
		System.out.println("Child class object");
	}
	
	static{
		// static block will executed when CLSS time
		System.out.println("child static  blocks 2");
	}
	
	{
		// Instance block will executed when the object is created 
		// But instance bolck executed before a construcotor   
		System.out.println("child Instance  blocks 2");
	}
	public static void main(String[] args) {
		
		System.out.println("This is main");
		
		Blocks blocks = new Blocks();
		
	}

}
