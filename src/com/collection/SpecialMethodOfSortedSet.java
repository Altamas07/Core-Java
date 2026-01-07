package com.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SpecialMethodOfSortedSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> ss=new TreeSet<>();
		ss.add(45);
		ss.add(23);
		ss.add(21);
		ss.add(30);
		System.out.println(ss.first()); //return first element in the tree set 
		System.out.println(ss.last()); // return last element in the tree set 
		
		SortedSet<Integer> headset=ss.headSet(30); // here it will return elements less than 30 
		
		System.out.println(headset);
		
		SortedSet<Integer> tailset=ss.tailSet(30); // here it will return elements greater than 30 or equal  

		System.out.println(tailset); 
		
		SortedSet<Integer>ss1=ss.subSet(10, 30);
		
		System.out.println(ss1);
}
}