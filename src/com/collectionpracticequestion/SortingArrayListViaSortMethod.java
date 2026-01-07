package com.collectionpracticequestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingArrayListViaSortMethod {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(34);
		al.add(23);
		al.add(45);
		al.add(12);
		
		// default sorting order 
		System.out.println("Before sorting ::"+"\n"+al);
		Collections.sort(al);
		System.out.println("After sorting ::");
		System.out.println(al);
		
		// customized sorting order 
		
		MyComparator1 m=new MyComparator1();
		
		System.out.println("After customized sorting order ::");
		Collections.sort(al, m);
		
		System.out.println(al);
	}
}

class MyComparator1 implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2.compareTo(o1);
	}
	
	
}