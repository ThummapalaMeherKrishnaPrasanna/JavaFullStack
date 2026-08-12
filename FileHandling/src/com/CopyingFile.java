package com;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingFile {

	public static void main(String[] args) {
		
		File file = new File("F:/FLM/files/Employee.txt");
		File file2 = new File("F:/FLM/files/copy.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try{
           fis = new FileInputStream(file);
           fos = new FileOutputStream(file2);
           
           int temp;
           while((temp = fis.read()) != -1){
        	   fos.write(temp);
           }
           System.out.println("Copied successfully");
		} 
		catch(IOException ex){
			System.out.println(ex.getMessage());
		}
	}

}
