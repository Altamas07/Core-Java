package com.collection;

import java.util.NavigableMap;
import java.util.TreeMap;
;

public class NavigableMapMethods {

	public static void main(String[] args) {
		
		NavigableMap<Integer,String> ns=new TreeMap<>();
		ns.put(45,null);
		ns.put(23,null);
		ns.put(76,null);
		
		ns.put(43,null);
		ns.put(12,null);
		
		
		System.out.println(ns);
		
		System.out.println(ns.ceilingKey(50)); // 76 it returns the lowest element greater than 50 or equal
		System.out.println(ns.higherKey(50)); // 76 it returns the lowest element greater
		System.out.println(ns.floorKey(50)); // 45 it returns the highest elements less than 50 or equal to 
		System.out.println(ns.lowerKey(50)); // 45 it returns the highest elements less than 50
		System.out.println(ns.pollFirstEntry()); // remove and returns the first element 
		System.out.println(ns.pollLastEntry()); // remove and returns the last element
		System.out.println(ns.descendingMap()); // descending order 
		System.out.println(ns);
	}
}
