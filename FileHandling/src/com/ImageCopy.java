package com;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ImageCopy {

	public static void main(String[] args) {
		
		File file = new File("F:/FLM/files/Final OOPs.jpg");
		File file2 = new File("F:/FLM/files/OOPs.jpg");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try{
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file2);
			
			int temp;
			
			while((temp = fis.read()) != -1){
				fos.write(temp);
			}
			System.out.println("Image copied successfully");
		}
		catch(IOException ex){
			System.out.println(ex.getMessage());
		}
		finally{
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				
				System.out.println(e.getMessage());
			}
		}
	}

}
