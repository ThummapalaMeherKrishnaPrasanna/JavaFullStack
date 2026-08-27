package com.blocks;

public class BlocksParent {
	
	BlocksParent(){
		System.out.println("Parent class object");
	}
	
	static {
		System.out.println("parent static block 1");
	}
	
	{
		System.out.println("Parent instance block 1");
	}
}
