package com.fanniemae.beans;

public class Account {

	private int accId;
	private int accNum;
	private double balance;
	private double avgBalance;
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAvgBalance() {
		return avgBalance;
	}
	public void setAvgBalance(double avgBalance) {
		this.avgBalance = avgBalance;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accNum=" + accNum + ", balance=" + balance + ", avgBalance=" + avgBalance
				+ "]";
	}
	public Account(){}
	
	public Account(int accId, int accNum, double balance, double avgBalance) {
		super();
		this.accId = accId;
		this.accNum = accNum;
		this.balance = balance;
		this.avgBalance = avgBalance;
	}
	
	public Account(int accId, int accNum, double balance) {
		super();
		this.accId = accId;
		this.accNum = accNum;
		this.balance = balance;
	}
	public Account(int accId) {
		super();
		this.accId = accId;
			}
	
	
}
