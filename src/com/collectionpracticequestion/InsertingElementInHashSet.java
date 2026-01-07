package com.collectionpracticequestion;

import java.util.HashSet;

public class InsertingElementInHashSet {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(54);
		hs.add(76);
		hs.add(89);
		hs.add(78);
		hs.add(34);        // in hash set insertion order is not preserved and duplicates are not
		                  // allowed 
		hs.add(21);
		hs.add(89);
		hs.add(78);
		hs.add(34);
		hs.add(21);
		
		System.out.println(hs);
		
	}
}
