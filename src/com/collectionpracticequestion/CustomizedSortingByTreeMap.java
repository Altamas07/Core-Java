package com.collectionpracticequestion;

import java.util.Comparator;
import java.util.TreeMap;

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2.compareTo(o1);
	}
	
}
public class CustomizedSortingByTreeMap {

	public static void main(String[] args) {
		// 1st way
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>(Comparator.reverseOrder());
		
		tm.put(54, "Altamsh khan");
		tm.put(65, "Latte");
		tm.put(57, "Altamash khan");
		tm.put(68, "apple");
		tm.put(59, "Altamsh Khan");
		tm.put(62, "guava");
		tm.put(58, "Altamash ");
		tm.put(61, "grapes");
		tm.put(56, "Altamash Khan");
		tm.put(66, "orange");
		tm.put(50, "khan");
		tm.put(60, "Banana");
		
		System.out.println(tm);
		
		// 2nd way
		
		Comparator<Integer> m=new MyComparator();
		TreeMap<Integer, String> tm1=new TreeMap<Integer, String>(m);


		tm1.put(54, "Altamsh khan");
		tm1.put(65, "Latte");
		tm1.put(57, "Altamash khan");
		tm1.put(68, "apple");
		tm1.put(59, "Altamsh Khan");
		tm1.put(62, "guava");
		tm1.put(58, "Altamash ");
		tm1.put(61, "grapes");
		tm1.put(56, "Altamash Khan");
		tm1.put(66, "orange");
		tm1.put(50, "khan");
		tm1.put(60, "Banana");
		
		System.out.println(tm1);
	}
}

