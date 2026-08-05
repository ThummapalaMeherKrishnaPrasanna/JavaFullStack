package com;

public class Test {

	public static void main(String[] args) {
		
		Airtel aSim = new Airtel();
		aSim.calling();
		aSim.data();
		aSim.sms();
		
		System.out.println("-------------------");
		
		
		Jio bSim = new Jio();
		bSim.calling();
		bSim.data();
		bSim.sms();
		bSim.jioHoststar();

	}

}
