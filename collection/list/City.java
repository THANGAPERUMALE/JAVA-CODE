package com.list;
import java.util.*;
public class City {
	private String dist;
	private int pincode;
	City(String dist,int pincode){
		this.dist=dist;
		this.pincode=pincode;
	}
	public static void display(HashSet<City>cities) {
		System.out.println("Entered cities : ");
		for(City city:cities) {
			System.out.println(city.dist+" "+city.pincode);
		}
	}
	public static void main(String[] args) {
		HashSet<City> cities=new HashSet<City>();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of data: ");
		int user=input.nextInt();
		for(int i=0;i<user;i++) {
			System.out.print("Enter District Name: ");
			String dist=input.next();
			System.out.print("Enter Pincode of it: ");
			int pincode=input.nextInt();
			cities.add(new City(dist,pincode));
		}
		display(cities);
	}
}
