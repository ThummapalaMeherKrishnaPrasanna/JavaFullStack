package com;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingAFile {

	public static void main(String[] args) {
		
		File file = new File("F:/FLM/files/Employee.txt");
		FileOutputStream fos = null;
		try{			
			
			fos = new FileOutputStream(file);
			
			String data = "All the employee are performing well😂😁.";
			
			//byte[] Byte = new byte[data];
			
			fos.write(data.getBytes());
			System.out.println("File written");
		}
		catch(IOException ex){
			System.out.println(ex.getMessage());
		}
		finally{
			try{				
				fos.close();
			}
			catch(IOException ex){
				System.out.println(ex.getMessage());
			}
		}
		
	}

}
