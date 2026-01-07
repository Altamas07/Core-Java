package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class InsertingStringInTreeSetDefaultSortingOrder {

	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<String>();
		 // alphabetical order or default order a-z 
		
		
		ts.add("f");
		ts.add("s");
		ts.add("k");
		ts.add("v");
		ts.add("w");
		ts.add("y");
		ts.add("l");
		ts.add("q");
		
		
		System.out.println(ts);
		
		TreeSet<String> ts1=new TreeSet<String>(Comparator.reverseOrder());
		
		// z-a 
		
		ts1.add("f");
		ts1.add("s");
		ts1.add("k");
		ts1.add("v");
		ts1.add("w");
		ts1.add("y");
		ts1.add("l");
		ts1.add("q");
		
		System.out.println(ts1);
	}
}
