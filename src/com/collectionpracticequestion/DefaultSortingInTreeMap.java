package com.collectionpracticequestion;

import java.util.TreeMap;

public class DefaultSortingInTreeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(76, "LAtte");
		tm.put(79, "Altamash");
		tm.put(65, "Laptop");
		tm.put(87, "Apple");
		tm.put(34, "Juice");
		tm.put(23, "Banana");
		tm.put(87, "grapes");
		
		System.out.println(tm);
	}
}
