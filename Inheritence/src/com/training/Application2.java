package com.training;

import com.training.module1.BankAccount;
import com.training.module1.SavingAccount;

public class Application2 {
	
	public static void main(String[] args) {
		
		
		BankAccount acc= new BankAccount();
		SavingAccount sb= new SavingAccount(234,"Ramesh",6000,1000);
		
		//BankAccount acc1=new BankAccount(123,"Abhishek",5000);
		sb.deposit(1000);
		System.out.println(sb.getBalance());
		
		sb.withdraw(3000);
		System.out.println(sb.getBalance());
		
		sb.deposit(500);
		System.out.println(sb.getBalance());
		
		sb.withdraw(2000);
		System.out.println(sb.getBalance());
	}

}
