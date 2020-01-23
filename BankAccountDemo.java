package com.flexon.basic;

public class BankAccountDemo {
	public static void main(String[] args) {
		
		Customer custOne=new Customer("Shilpa","Bhag", "123456", "4089001239");
		CheckingAccount custOneCheck=new CheckingAccount();
		
		custOne.display();
		custOne.setAccountNumber("AC000198");
		String s=custOne.getAccountNumber();
		System.out.println("account number is:  "+s.substring(5,8));
		custOneCheck.deposit(300.00);
		custOneCheck.checkBalance("00900123");
		custOneCheck.withdraw(600.00);
		custOneCheck.checkBalance("00900123");
	}

}
