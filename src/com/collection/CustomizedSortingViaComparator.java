package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
	return	o2.compareTo(o1);
		
	}
	
	
}
public class CustomizedSortingViaComparator {

	public static void main(String[] args) {
		
	//	Comparator<Integer> c=new MyComparator() ; 
			
			
		TreeSet<Integer> ts=new TreeSet<Integer>(Comparator.reverseOrder()); 
		// if i comment line 21 and pass .reverseorder in the treeset constructor we will get descending order 
		
		ts.add(45);
		ts.add(44);
		ts.add(48);
		ts.add(49);
		ts.add(41);
		
		System.out.println(ts);
	}
}
