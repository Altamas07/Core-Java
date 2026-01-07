package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class NullPointerExceptionTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(34);
		
		ts.add(56);
		ts.add(59);
		
		ts.add(56);
		
		//ts.add(null);
		
		// if i am trying to insert null after inserting any value then we will get null pointer exception 
		
		System.out.println(ts);
	
		TreeSet<Integer> ts1=new TreeSet<Integer>(Comparator.nullsFirst(Integer::compareTo));
		
		ts1.add(null);
		
		ts1.add(34);
		
		ts1.add(56);
		ts1.add(59);
		ts1.add(8);
		ts1.add(51);

		// we can insert null by customized sorting order 
		
		System.out.println(ts1);
	}
}
