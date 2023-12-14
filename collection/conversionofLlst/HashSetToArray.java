package com.conversionoflist;
import java.util.*;
public class HashSetToArray {	 
    public static void main(String[] args) {
    	HashSet<String> h1 = new HashSet<String>();
    	h1.add("Kholi");
    	h1.add("Siraj");
    	h1.add("Faf");
    	h1.add("Maxi");
    	h1.add("Dinesh");
    	System.out.println("HashSet: " + h1);
    	String[] strArray = new String[h1.size()];
    	h1.toArray(strArray);
        System.out.println("Array created:");
        for(String s:strArray){
             System.out.println(s);
        }
    }
}
