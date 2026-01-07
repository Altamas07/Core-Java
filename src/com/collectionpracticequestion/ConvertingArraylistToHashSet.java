package com.collectionpracticequestion;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertingArraylistToHashSet {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(34);
		hs.add(94);
		hs.add(24);
		hs.add(14);
		hs.add(64);
		hs.add(94);
		
		System.out.println(hs);
		
		//1st way
		ArrayList<Integer> al=new ArrayList<Integer>(hs);
		
		System.out.println(al);
		
		// 2nd way 
		ArrayList<Integer> al1=new ArrayList<Integer>();
		
		al1.addAll(hs);
		
		System.out.println(al1);
		
	}
}
