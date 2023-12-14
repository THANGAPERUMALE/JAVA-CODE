package com.arrayAddition;

public class ArrayAddition {
	public static void add(int[]a) {
		int sum=0;
		for(int i:a) {
		  sum+=i;
		}
		System.out.print("Sum = "+sum);
	}
	public static void main(String[]args) {
		int arr[]= {20,56,87,9};
		add(arr);
	}
}
