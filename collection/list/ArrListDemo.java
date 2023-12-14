package com.list;
import java.util.*;
public class ArrListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>();
		ArrayList<Integer> l=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter list of Integers: ");
		String str=sc.nextLine();
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++) {
			l1.add(Integer.valueOf(s[i]));
		}
		l.add(26);
		l.add(78);
		l.add(94);
		l1.addAll(l);
		Collections.sort(l1);
		System.out.println("After sorting: "+l1);
		System.out.println("minimum element is "+Collections.min(l1));
		System.out.println("maximum element is "+Collections.max(l1));
		Collections.reverse(l1);
		System.out.println("Reversed list "+l1);
	}
}
