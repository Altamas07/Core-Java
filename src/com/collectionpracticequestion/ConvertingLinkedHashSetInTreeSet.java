package com.collectionpracticequestion;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ConvertingLinkedHashSetInTreeSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(34);
		lhs.add(23);
		lhs.add(67);
		lhs.add(45);
		lhs.add(56);
		
		
		System.out.println("Before converting it into tree set ");
		
		System.out.println(lhs);
		
		// 1st way
		TreeSet<Integer> ts=new TreeSet<Integer>(lhs);
		
		System.out.println("After sorting ::");
		
		System.out.println(ts);
		
		// 2nd way 
		
		TreeSet<Integer> tsq=new TreeSet<Integer>();
		
		tsq.addAll(lhs);
		System.out.println(tsq);
		
	}
}
