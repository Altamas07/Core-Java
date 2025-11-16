package com.arrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;


public class RemovingDuplicates {
public static void main(String[] args) {
	ArrayList<Integer> arr=new ArrayList<Integer>();
	arr.add(43);
	arr.add(46);
	arr.add(44);
	arr.add(42);
	arr.add(41);
	arr.add(43);
	System.out.println("Original"+arr);
	
	LinkedHashSet<Integer> unique=new LinkedHashSet<>(arr);
	ArrayList<Integer> aew= new ArrayList<>(unique);
	
	System.out.println(aew);
	
}
}
