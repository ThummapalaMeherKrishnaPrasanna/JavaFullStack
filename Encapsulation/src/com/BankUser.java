package com;

public class BankUser {
	
	private long accountNum;
	
	private String userName;
	
	private String ifscCode;
	
	private double balance;
	
	private static String branch = "Hyderabad";   

	
	public void setAccountNum(long accountNum){
		this.accountNum = accountNum;
	}
	
	public long getAccountNum(){
		return this.accountNum;
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	public String getUserName(){
		return this.userName;
	}
	
	public void setIfscCode(String ifscCode){
		this.ifscCode = ifscCode;
	}
	public String getIfscCode(){
		return this.ifscCode;
	}
	
	public void setBalance(double balance){
		if(balance > 0){
			this.balance = balance;
		}
		else if(balance <= 0){
			System.out.println("Negative number is not valid");
		}
	}
	public double getBalance(){
		return this.balance;
	}
	
	public String getBranch(){
		return BankUser.branch;
	}
	
	
//	public BankUser(long accountNum, String userName, String ifscCode,double balance){
//	
//	this.accountNum = accountNum;
//	this.userName = userName;
//	this.ifscCode = ifscCode;
//	this.balance  = balance;
//	
//}
//
//public BankUser(){
//	
//}

//void display(){
//	
//	System.out.println(this.accountNum);
//	System.out.println(this.userName);
//	System.out.println(this.ifscCode);
//	System.out.println(this.balance);
//	System.out.println(BankUser.branch);
//	
//}
}
