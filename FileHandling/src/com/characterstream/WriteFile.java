package com.characterstream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		
		
		File file = new File("F:/FLM/files/write2.txt");
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			
			fw.write("WOW it's nice");
		    System.out.println("Written successfully");
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally{
			try {
				fw.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
		}

	}

}
