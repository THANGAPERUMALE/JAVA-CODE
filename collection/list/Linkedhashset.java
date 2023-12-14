package com.list;
import java.util.*;
public class Linkedhashset {
	public static void main(String[] args) {
		LinkedHashSet<String> l1=new LinkedHashSet<String>();
		LinkedHashSet<String> l2=new LinkedHashSet<String>();
		l1.add("Gill");
		l1.add("Kholi");
		l1.add("Siraj");
		l1.add("Rohit");
		l1.add("Sachin");
		l1.add("Maxi");
		System.out.println("First list: "+l1);
		l2.add("Gill");
		l2.add("Siraj");
		l2.add("Sachin");
		System.out.println("Second list: "+l2);
		System.out.println("Whether list1 contains list2? "+l1.containsAll(l2));
		l1.removeAll(l2);
		System.out.println("After removing list1 elements present in list2: "+l1);
		l2.removeAll(l2);
		System.out.println("Whether list2 is empty? "+l2.isEmpty());
	}
}
