package com.collectionpracticequestion;

import java.util.HashSet;

public class RemovingHashSetSpecificElement {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(67);
		hs.add(76);
		hs.add(23);
		hs.add(12);
		hs.add(90);
		hs.add(56);
		
		System.out.println(" Before Removing the specific element ");
		System.out.println(hs);
		
		hs.remove(12);
		System.out.println("After removing that specific element ::"+"\n"+hs);
	}
}
