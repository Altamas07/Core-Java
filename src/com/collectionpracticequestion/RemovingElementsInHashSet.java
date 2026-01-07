package com.collectionpracticequestion;

import java.util.HashSet;
import java.util.Iterator;

public class RemovingElementsInHashSet {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(34);
		hs.add(24);
		hs.add(74);
		hs.add(10);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(8);
		hs.add(9);
		
		
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext()) {
			
			if(it.next()<10) {
				it.remove();
			}
			
		}

		System.out.println(hs);
	}
}
