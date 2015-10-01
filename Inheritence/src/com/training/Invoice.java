package com.training;

public class Invoice {
	
	private int invoicenumber;
	private String customerName;
	private double amount;
	
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getInvoicenumber() {
		return invoicenumber;
	}

	public void setInvoicenumber(int invoicenumber) {
		this.invoicenumber = invoicenumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Invoice(int invoicenumber, String customerName, double amount)
	{
		super();
		this.invoicenumber = invoicenumber;
		this.customerName = customerName;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Invoice [invoicenumber=" + invoicenumber + ", customerName="
				+ customerName + ", amount=" + amount + "]";
	}

	//@Override
	/*public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + this.invoicenumber + ":" + this.customerName + ":" + this.amount;
		}*/
	
	
	
	

}
