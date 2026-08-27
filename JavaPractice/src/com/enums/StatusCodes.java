package com.enums;

public enum StatusCodes {
	
	NOTFOUND(404),SUCCESS(200),BAD_REQUEST(400);
	
	int code;
	
	StatusCodes(int code){
		
		this.code = code;
	}
	
	int getCode(){
		
		return code;
	}
	
	
	
}
