package com.collectionpracticequestion;

import java.util.TreeSet;

public class FindingTheFirstAndLastElementOFTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(98);
		ts.add(78);
		ts.add(90);
		ts.add(56);
		ts.add(23);
		
		// first element
		System.out.println(ts.first());
		
		// last element
		
		System.out.println(ts.last());
	}
}
