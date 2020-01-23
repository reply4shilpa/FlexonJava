package com.flexon.basic;

public abstract class Bank {

	public static String accountType[] = { "checking account", "saving account", "investment account" };
	private String accountNumber;
	protected double balance;

	
	public void display() {

		System.out.println("accountType :" + accountType);
		System.out.println("accountNumber :" + accountNumber);
		System.out.println("Balance :" + balance);
	}

	public String getAccountNumber() {

		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}

 class Customer extends Bank {

	private String custFName;
	private String custLName;
	//private String custEmail;
	private String custPhoneNumber;
	protected String ssn;
	
	
	 Customer (){
	    }

	    Customer(String firstName, String lastName, String ssn, String custPhoneNumber){
	        this.custFName = firstName;
	        this.custLName = lastName;
	        this.ssn = ssn;
	        this.custPhoneNumber = custPhoneNumber;
	    }

	public void display() {
		System.out.println("Customer Name:" + this.custFName + " " + this.custLName);
		System.out.println("Customer ssn:" + this.ssn);
		System.out.println("Customer Phone Number:" + this.custPhoneNumber);

	}
}

interface Transaction {

	void deposit(double amt);

	void withdraw(double amt);

	void checkBalance(String accountNum);

}

class CheckingAccount extends Customer implements Transaction {

	@Override
	public void deposit(double amt) {
		this.balance+=amt;
	}

	@Override
	public void withdraw(double amt) {

		if (amt > this.balance)
			System.out.println("Insufficient Fund");
		else {
			this.balance -= amt;

		}

	}

	@Override
	public void checkBalance(String accountNum) {
		System.out.println("Balance is:" + this.balance);

	}

	

}

class SavingAccount extends Customer implements Transaction {

	@Override
	public void deposit(double amt) {
	}

	@Override
	public void withdraw(double amt) {
		try {

			if (amt < this.balance)
				System.out.println("Insufficient funds");
		} catch (ArithmeticException e) {
		}

	}

	@Override
	public void checkBalance(String accountNum) {
		System.out.println("Balance is:" + this.balance);
	}

}
