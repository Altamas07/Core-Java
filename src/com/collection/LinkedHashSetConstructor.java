package com.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetConstructor {

	public static void main(String[] args) {
		
		// In Linked Hash Set Insertion order will be preserved 
		
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>(); // empty linked hash set default capacity of 16 with 0.75 load factor
		LinkedHashSet<Integer> hs1=new LinkedHashSet<Integer>(50);// linked hash set object of 50 initial capacity with 0.75 load factor 
		LinkedHashSet<Integer> hs2=new LinkedHashSet<Integer>(50,0.45f); // linked hash set object of 50 initial capacity with 0.45 load factor 
		LinkedHashSet<Integer> hs3=new LinkedHashSet<Integer>(hs);// creates linked hash set object where all elements available in hs
		                                              // is now in hs3
	}
}
