package com.collectionpracticequestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SearchingElementsOfListAccordingNaturalSortingOrder {

	public static void main(String[] args) {
		// natural sorting order ;
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(45);
		al.add(34);
		al.add(23);
		al.add(12);
		al.add(98);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		System.out.println(Collections.binarySearch(al, 45));
		
		
		
		
		ArrayList<Integer> all=new ArrayList<Integer>();
		all.add(45);
		all.add(34);
		all.add(23);
		all.add(12);
		all.add(98);
		
		MyComparator2 m=new MyComparator2();
		
		Collections.sort(all, m);
		
		System.out.println(all);
		
		System.out.println(Collections.binarySearch(all, 34, m));
	}
}
class MyComparator2 implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2.compareTo(o1);
	}
	
	
}
