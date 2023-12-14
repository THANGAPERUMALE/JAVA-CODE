package com.scanDemo;
import java .util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1 for Add");
		System.out.println("2 for Subtract");
		System.out.println("3 for Mutiply");
		System.out.println("4 for ToFind Odd Or Even");
		int givenNum=sc.nextInt();
		do {
			if(givenNum==1) {
				System.out.println("Numbers to Perform Addition");
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println(a+b);
				System.out.println("Give an option to perform operation");
				givenNum=sc.nextInt();
				continue;
			}
			else if(givenNum==2) {
				System.out.println("Numbers to Perform Subtraction");
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println(a-b);
				System.out.println("Give an option to perform operation");
				givenNum=sc.nextInt();
				continue;
			}
			else if(givenNum==3) {
				System.out.println("Numbers to Perform Multiplication");
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println(a*b);
				System.out.println("Give an option to perform operation");
				givenNum=sc.nextInt();
				continue;
			}
			else if(givenNum==4) {
				System.out.println("Number to Find Odd or Even");
				int a=sc.nextInt();
				if(a%2==0) {
					System.out.println("Given Number is Even");
				}
				else {
					System.out.println("Given Number is Odd");
				}
				System.out.println("Give an option to perform operation");
				givenNum=sc.nextInt();
				continue;
			}
			else if(givenNum==5) {
				System.out.print("Terminating Operation....");
				break;
			}
			else {
				System.out.println("Provide 1 to 4 And 5 to Terminate the operation");
				givenNum=sc.nextInt();
				continue;
			}
		}while(true);
		sc.close();
	}
}
