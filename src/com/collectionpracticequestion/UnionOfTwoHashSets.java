package com.collectionpracticequestion;

import java.util.HashSet;

public class UnionOfTwoHashSets {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(23);
		hs.add(12);
		hs.add(56);
		hs.add(67);
		hs.add(12);
		hs.add(45);
		hs.add(90);
		
		System.out.println(hs);
		
		HashSet<Integer> hs1=new HashSet<Integer>();
		hs1.add(67);
		hs1.add(90);
		hs1.add(87);
		hs1.add(66);
		hs1.add(99);
		
		System.out.println(hs1);
		
		
		HashSet<Integer> union=new HashSet<Integer>(hs);
		
		union.addAll(hs1);
		System.out.println(union);
	}
}
