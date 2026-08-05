package com.polymorphism;

public class Test {

	public static void main(String[] args) {
		
		TVRemote tv = new TVRemote();
		
		System.out.println("TV remote");
		
		tv.increaseVolume();
		tv.increaseVolume();
		tv.increaseVolume();
		tv.increaseVolume(5);
		tv.increaseVolume();
		
		int res = tv.increaseVolume(4);
		
		System.out.println("volume : "+ res);
		
		tv.turingOn();
		
		Remote.check();
		
		System.out.println("=================");
		
		AcRemote ac = new AcRemote();
		
		System.out.println("AC remote");
	
		ac.tempIncrease();
		ac.tempIncrease();
		ac.tempIncrease();
		
		ac.turingOn();
		
		
	}

}
