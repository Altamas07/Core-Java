package com.collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetMethods {

	public static void main(String[] args) {
		
		NavigableSet<Integer> ns=new TreeSet<Integer>();
		ns.add(45);
		ns.add(23);
		ns.add(76);
		
		ns.add(43);
		ns.add(12);
		
		
		System.out.println(ns);
		
		System.out.println(ns.ceiling(50)); // 76 it returns the lowest element greater than 50 or equal
		System.out.println(ns.higher(50)); // 76 it returns the lowest element greater
		System.out.println(ns.floor(50)); // 45 it returns the highest elements less than 50 or equal to 
		System.out.println(ns.lower(50)); // 45 it returns the highest elements less than 50
		System.out.println(ns.pollFirst()); // remove and returns the first element 
		System.out.println(ns.pollLast()); // remove and returns the last element
		System.out.println(ns.descendingSet()); // descending order 
		System.out.println(ns);
	}
}
