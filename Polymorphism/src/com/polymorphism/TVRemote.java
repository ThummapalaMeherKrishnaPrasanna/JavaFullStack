package com.polymorphism;

public class TVRemote extends Remote{

	int volume;
	int doubleVol;
	void increaseVolume(){
		this.volume++;
		System.out.println("volume : " + this.volume);
	}
	
	 int increaseVolume(int volume){
		this.volume += volume;
		return this.volume;
	}
	
	@Override
    void turingOn(){
    	System.out.println("TV turing ON Meher");
    }
	

	
}
