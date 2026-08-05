package com.polymorphism;

public class AcRemote extends Remote{
	
	int temp;
	
	void tempIncrease(){
		
		this.temp++;
		System.out.println("temprature : " + this.temp);
		
	}
	
	void turingOn(){
    	System.out.println("AC turing ON");
    }
	
	
}
