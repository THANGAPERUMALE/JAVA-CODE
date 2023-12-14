package com.list;
import java.util.*;
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<>();
		ArrayList<Integer> l=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter list of Integers: ");
		String str=sc.nextLine();
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++) {
			l1.add(Integer.valueOf(s[i]));
		}
		l1.add(0,5);
		l.add(93);
		l.add(74);
		l.add(8);
		l1.addAll(l);
		System.out.println("minimum element is "+Collections.min(l1));
		System.out.println("maximum element is "+Collections.max(l1));
		Collections.reverse(l1);
		System.out.println("Reversed list "+l1);
	}

}
