package com.cg.mra.beans;

public class Account {
	private String accountType;
	private String customerName;
	private double accountBalance;
	
	public Account(String accountType, String customerName,double accountBalance) {
		// TODO Auto-generated constructor stub
		this.accountBalance = accountBalance;
		this.customerName = customerName;
		this.accountType = accountType;
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

}