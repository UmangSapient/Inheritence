package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Invoice inv1= new Invoice(101,"Ramesh",4500.00);
		Invoice inv2= new Invoice(102,"Rajesh",5500.00);
		Invoice inv3= new Invoice(103,"Rakesh",6500.00);
		Invoice inv4= new Invoice(104,"Jayesh",7500.00);
		System.out.println(inv1.toString());
		
		Invoice[] invList=new Invoice[4];
		
		invList[0]=inv1;
		invList[1]=inv2;
		invList[2]=inv3;
		invList[3]=inv4;
		
		InvoiceManager mgr = new InvoiceManager();
		
		mgr.printInvoices(invList);
		

	}

}
