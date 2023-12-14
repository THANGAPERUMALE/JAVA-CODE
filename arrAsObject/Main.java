package com.arrAsObject;

public class Main {

	public static void main(String[] args) {
		Employee employee[]=new Employee[3];
		employee[0]=new Employee(1,"abc","kerala");
		employee[1]=new Employee(2,"pqr","mumbai");
		employee[2]=new Employee(3,"suv","chennai");
		for(Employee i:employee) {
			System.out.println(i.id+" "+i.name+" "+i.location);
		}
	}
}
