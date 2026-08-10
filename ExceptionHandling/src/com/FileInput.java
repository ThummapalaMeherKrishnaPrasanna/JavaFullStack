package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInput {
	
	public static void main(String[] args) {
		
		try{
			readFile();	
		}
		catch(FileNotFoundException ex){
			System.out.println("File not Found");
		}
			
		
	}
	
	public static void readFile() throws FileNotFoundException{
		
		File file = new File("C://Users/LALITHA PRASANNA/Projects/ExceptionHandling/src/com/file.txt");
		FileInputStream fileRead = new FileInputStream(file);
			
	}

}
