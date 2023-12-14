package com.list;
import java.util.*;
public class ArrayAsList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String []s= {"java","HTML","C","C++"};
		Arrays.sort(s);
		ArrayList<String> l=new ArrayList<String>(Arrays.asList(s));
		System.out.println(l);
	}

}
