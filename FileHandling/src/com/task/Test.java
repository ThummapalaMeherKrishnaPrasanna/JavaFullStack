package com.task;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args){
		
		for(int i=1; i<=10; i++){
			
			File file = new File("F:/FLM/files/task/File"+i+ ".txt");
			FileOutputStream fos = null;
			
			try{
				fos = new FileOutputStream(file);
				String data = "This is File " + i;
				
				fos.write(data.getBytes());
				System.out.println("Written successfully on file : " + i);
			}
			catch(IOException e){
				
				System.out.println(e.getMessage());
			}
			finally{
				
				try {
					fos.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
	}

}
