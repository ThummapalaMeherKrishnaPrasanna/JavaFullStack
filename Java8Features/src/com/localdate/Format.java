package com.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Format {

	public static void main(String[] args) {
		
		
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		
		String format = LocalDate.now().format(ofPattern);
		
		System.out.println(format);
		
		
	}

}
