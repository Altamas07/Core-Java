package com.collection;

import java.util.HashSet;

public class ConstructorOfHashSet {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>(); // empty hash set default capacity of 16 with 0.75 load factor
		HashSet<Integer> hs1=new HashSet<Integer>(50);// hash set object of 50 initial capacity with 0.75 load factor 
		HashSet<Integer> hs2=new HashSet<Integer>(50,0.45f); // hash set object of 50 initial capacity with 0.45 load factor 
		HashSet<Integer> hs3=new HashSet<Integer>(hs);// creates hash set object where all elements available in hs
		                                              // is now in hs3
	}
}
