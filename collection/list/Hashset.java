package com.list;
import java.util.*;
public class Hashset {
	public static void main(String[] args) {
		HashSet<Integer> s1=new HashSet<>();
		HashSet<Integer> s2=new HashSet<>();
		HashSet<Integer> s3=new HashSet<>();
		s1.add(1);
		s1.add(22);
		s1.add(5);
		s1.add(8);
		s1.add(8);
		System.out.println("set1 :"+s1);
		s2.add(9);
		s2.add(5);
		s2.add(4);
		s2.add(3);
		s2.add(5);
		System.out.println("set2 :"+s2);
		s3.addAll(s1);
		s3.addAll(s2);
		System.out.println("Union of two sets: "+s3);
		set1.retainAll(s2);
		System.out.println("Intersection of set1 & set2: "+s1);
		
	}

}
