package com.localdate;

import java.time.LocalDate;

public class LocalDatePract {

	public static void main(String[] args) {
		
		LocalDate presentDate = LocalDate.now();
		
		System.out.println(presentDate);
		
		LocalDate date = LocalDate.of(2025, 9,10);
        
		System.out.println(date);
		
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfYear());
		System.out.println(date.isLeapYear());
		System.out.println(date.lengthOfMonth());
		System.out.println(date.plusDays(10));
		System.out.println(date.minusDays(15));
		System.out.println(date.plusMonths(3));
		System.out.println(date.minusMonths(4));
		System.out.println(date.withDayOfYear(100));
		
		
		
		
		
		
	}

}
