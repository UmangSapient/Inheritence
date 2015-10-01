package com.training.module1;

public class BankAccount
{

	private long accountNumber;
	private String accountHolderName;
	private double balance;
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(long accountNumber, String accountHolderName,
			double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankaAccount [accountNumber=" + accountNumber
				+ ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + "]";
	}
	
	
	public double deposit(double depositAmount)
	
	{
		balance= balance+depositAmount ;
		return balance;
		
	}
	
	public double withdraw(double withdrawAmount)
	{
		balance= balance-withdrawAmount;
		return balance;
		
		
	}
}
