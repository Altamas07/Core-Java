package com.collectionpracticequestion;

import java.util.Iterator;
import java.util.TreeSet;

public class RemovingElementFromTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(34);
		ts.add(35);
		ts.add(75);
		ts.add(56);
		ts.add(87);
		ts.add(24);
		ts.add(78);
		ts.add(39);
		ts.add(98);
		ts.add(23);
		ts.add(3);
		
		System.out.println("Before removing");
		
		System.out.println(ts);
		
		Iterator<Integer> itr=ts.iterator();
		while(itr.hasNext()) {
			
			if(itr.next()<50) {
				
				itr.remove();
				
				
			}
		}
		System.out.println("After removing");
		System.out.println(ts);
		
	}
}
