package com.training.module1;

public class SavingAccount extends BankAccount 

{
	private double minBalance;

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(long accountNumber, String accountHolderName,
			double balance) {
		super(accountNumber, accountHolderName, balance);
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(long accountNumber, String accountHolderName,
			double balance, double minBalance) {
		super(accountNumber, accountHolderName, balance);
		this.minBalance = minBalance;
	}

	@Override
	public double withdraw(double withdrawAmount) 
	{
		// TODO Auto-generated method stub
		double currentBalance=0.0;
		
		if(getBalance()-withdrawAmount > minBalance)
		{
			currentBalance =getBalance()-withdrawAmount ;
			setBalance(currentBalance);
		}
		
		return currentBalance;
	}
	
	
	
}
