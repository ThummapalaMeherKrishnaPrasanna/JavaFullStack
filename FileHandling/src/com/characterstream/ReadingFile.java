package com.characterstream;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args) {
		
		File file = new File("F:/FLM/files/copy.txt");
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			
			int temp;
			
			while((temp = fr.read()) != -1){
				System.out.print((char) temp);
			}
			
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally{
			try {
				fr.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
		}

	}

}
