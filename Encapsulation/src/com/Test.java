package com;

public class Test {

	public static void main(String[] args) {
		
		BankUser user1 = new BankUser();
		
		user1.setAccountNum(218);
		System.out.println("Account number : "+user1.getAccountNum());
		
		user1.setBalance(153);
		System.out.println("Balance : "+user1.getBalance());
		
	    user1.setBalance(-1000);
	    System.out.println("Balance: " +user1.getBalance());
	    
	    
//		BankUser user = new BankUser(12354,"Meher","SBI458",154);
//		
//		user.display();
//		
//		user.balance = 200;
//		
//		user.display();
	}

}
