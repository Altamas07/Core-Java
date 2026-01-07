package com.collection;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SynchronizedVersionOfSet {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		Set<Integer> s= Collections.synchronizedSet(hs);
		
		s.add(34);
		s.add(45);
		s.add(23);
		
		System.out.println(s);
	}
}
