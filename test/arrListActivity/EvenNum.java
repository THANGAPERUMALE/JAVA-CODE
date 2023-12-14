package com.arrListActivity;
import java.util.*;
public class EvenNumber {
	public static ArrayList<Integer> storeEven(int n){
		ArrayList<Integer> l1=new ArrayList<>();
		for(int i=2;i<=n;i++) {
			if(i%2==0) {
				l1.add(i);
			}
		}
	    return l1;
	}
	public static ArrayList<Integer> printEven(ArrayList<Integer> l1){
		ArrayList<Integer> l2=new ArrayList<>();
		for(int i=0;i<l1.size();i++) {
			l2.add(l1.get(i)*2);
		}
		return l2;
	}
	public static int retrieveEven(int N,ArrayList<Integer> l1) {
		if(l1.contains(N)) {
			return N;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int userIn=input.nextInt();
		if(userIn<2) {
			System.out.println("Number Should be Greater than 1");
		}
		System.out.println("Even Numbers After mulitiple by 2: ");
		System.out.println(printEven(storeEven(userInput)));
		System.out.println("After retireving number: ");
		System.out.println(retrieveEven(userInput,storeEven(userInput)));
		input.close();
	}

}
