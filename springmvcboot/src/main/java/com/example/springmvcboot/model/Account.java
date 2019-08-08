package com.example.springmvcboot.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account {

	private int accountNo;
	private float balance;
	private String accountType;
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
}
