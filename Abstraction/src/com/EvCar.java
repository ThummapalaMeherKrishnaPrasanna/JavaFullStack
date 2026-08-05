package com;

public class EvCar extends Vehicle{
	
	public void playMusic(){
		System.out.println("Music was Palying");
	}
	public void evCarBattery(){
		System.out.println("Charging");
	}
	
	public static void main(String[] args){
		   
		EvCar obj = new EvCar();
		
		obj.playMusic();
		obj.evCarBattery();
		obj.drive();	
	}
}
