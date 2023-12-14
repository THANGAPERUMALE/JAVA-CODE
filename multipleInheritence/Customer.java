package com.multipleInheritence;

public class Customer implements Car,Bike{
	public void speedOfBike() {
		System.out.println("Maximum Speed of Bike is 160");
	}
	public void mileageOfBike() {
		System.out.println("MileAge Of This Bike is 45/L");
	}
	public void speedOfCar() {
		System.out.println("Maximum Speed of Car is 180");
	}
	public void mileageOfCar() {
		System.out.println("MileAge Of This Car is 30/L");
	}
	public static void main(String[] args) {
		Customer c=new Customer();
		c.speedOfBike();
		c.mileageOfBike();
		c.speedOfCar();
		c.mileageOfCar();
	}
}
