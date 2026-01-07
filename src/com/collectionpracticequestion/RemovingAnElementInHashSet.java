package com.collectionpracticequestion;

import java.util.LinkedHashSet;

public class RemovingAnElementInHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		hs.add(23);
		hs.add(12);
		hs.add(67);
		hs.add(34);
		
		System.out.println(hs);
		
		hs.remove(23);
		System.out.println(hs);
	}
}
