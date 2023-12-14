package com.accouts;

public class Account {
	private int accno;
	private String ifsccode;
	protected String location="chennai";
	protected String address="East street";
	public double amount=40000;
	public void setAccno(int n) {
		accno=n;
	}
	public int getAccno() {
		return accno;
	}
	public void setIfsc(String s) {
		ifsccode=s;
	}
	public String getIfsc() {
		return ifsccode;
	}
}
