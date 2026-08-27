package com.clone;

public class Address {
	
	private int pinCode;
	
	private String city;

	 
	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address() {
		super();
	}
	
	public Address(int pinCode, String city) {
		super();
		this.pinCode = pinCode;
		this.city = city;
	}
    
	// copy constructor 
	public Address(Address address){
		
		this.pinCode = address.pinCode;
		this.city = address.city;
	}
	@Override
	public String toString() {
		return "Address [pinCode=" + pinCode + ", city=" + city + "]";
	}
	 
	
	 
	 
}
