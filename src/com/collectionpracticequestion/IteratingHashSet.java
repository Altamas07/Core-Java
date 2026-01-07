package com.collectionpracticequestion;

import java.util.HashSet;
import java.util.Iterator;

public class IteratingHashSet {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(33);
		hs.add(23);
		hs.add(12);
		hs.add(67);
		hs.add(21);
		
		Iterator<Integer> itr=hs.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}
}
