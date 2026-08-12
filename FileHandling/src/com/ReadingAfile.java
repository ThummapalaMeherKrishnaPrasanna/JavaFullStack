package com;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadingAfile {
	public static void main(String[] args) {
			
		File file = new File("F:/FLM/files/students.txt");
		FileInputStream fis = null;
		
		try{
			
			fis = new FileInputStream(file);
		
			int temp;
			
			while((temp = fis.read()) != -1){
				System.out.print((char) temp);
				
			}	
		
			
		}
		catch(IOException ex){
			System.out.println(ex.getMessage());
		}
		finally{
			
			try{
				fis.close();
			}
			catch(IOException ex){
				System.out.println(ex.getMessage());
			}
		}
//		try{
//			
//			file.createNewFile();
//			System.out.println("Created a file");
//		}
//		catch(IOException ex){
//			
//			System.out.println(ex.getMessage());
//		}
		
	}
}
