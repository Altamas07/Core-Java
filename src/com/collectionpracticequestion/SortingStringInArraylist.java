package com.collectionpracticequestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class SortingStringInArraylist {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Banana");
		al.add("Apple");
		al.add("guava");
		al.add("grapes");
		al.add("Pomegrante");
		al.add("Jack fruit");
		al.add("Litchi");
		al.add("Mangoe");
		
		
		System.out.println("Before sorting");
		
		System.out.println(al);
		
		
		System.out.println("After sorting");
		
		Collections.sort(al);
		
		System.out.println(al);
		
		// 2nd way 
		TreeSet<String> ts=new TreeSet<String>();
		ts.addAll(al);
		
		System.out.println(ts);
	}
}
