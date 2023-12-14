package com.accouts.customer;
import com.accout.*;
public class Customer extends Account{
	public static void main(String[] args) {
		Customer c=new Customer();
		c.setAccno(111779);
		c.setIfsc("SBI0005");
		System.out.println(c.getIfsc());
		System.out.println(c.location);
		System.out.println(c.address);
		System.out.println(c.amount);
	}
}
