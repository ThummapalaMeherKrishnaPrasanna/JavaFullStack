package com.enums;

public class Test {

	public static void main(String[] args) {
		
		Day day = Day.FRIDAY;
		System.out.println(day);
		
		StatusCodes code = StatusCodes.BAD_REQUEST;
		System.out.println(code + " = " + code.getCode());
		
		StatusCodes code2 = StatusCodes.SUCCESS;
		System.out.println(code2 + " = " + code.getCode());
		
	}

}
