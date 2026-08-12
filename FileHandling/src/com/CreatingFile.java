package com;

import java.io.File;
import java.io.IOException;


public class CreatingFile {

	public static void main(String[] args) {
		
		File file = new File("F:/FLM/files/First.txt");
		
		try{
			file.createNewFile();
			System.out.println("File created");
		}
		catch(IOException ex){
			System.out.println(ex);
		}
	}

}
