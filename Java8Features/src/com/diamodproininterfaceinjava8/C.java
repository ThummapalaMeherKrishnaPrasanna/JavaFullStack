package com.diamodproininterfaceinjava8;

public class C implements Room1,Room2{
	
	public void laptop() {
		
		Room1.super.laptop();
		Room2.super.laptop();
		
//		System.out.println("Apple laptop");
	}
}
