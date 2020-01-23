package com.flexon.basic;

public class BankAccount {
	private String accountType;
	private String accountNumber;
	private double balance;
	private String name;
	private String email;
	private String phoneNumber;
	private char ssn[];

	public void deposit(double amt) {
		this.balance += amt;
	}

	public void withdraw(double amt) {
		if (amt > this.balance)
			System.out.println("Insufficient Fund");
		else {
			this.balance -= amt;
			System.out.println(this.name);
			System.out.println(this.balance);
		}
	}

	public void info() {
		System.out.println(this.name);
		System.out.println(this.accountNumber);
		System.out.println(this.balance);
		System.out.println(this.phoneNumber);
		System.out.println(this.email);
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
