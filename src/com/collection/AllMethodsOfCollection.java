package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class AllMethodsOfCollection {

	public static void main(String[] args) {
		
		Collection<Integer> c=new ArrayList<Integer>();
		
		c.add(34);  // add method to add single element
		c.add(32);
		c.add(23);
		
		System.out.println(c);
		
		Collection<Integer> c1=new ArrayList<Integer>();
		
		c1.add(54);
		c1.add(78);
		
		
		c.addAll(c1); // to add current collection to another collection 
		
		System.out.println("After adding all elements to c ");
		
		System.out.println(c);
		
		c.remove(23);// to remove a particular element from collection 
		System.out.println("After removing");
		System.out.println(c);
		
		
		c.removeAll(c1); // to remove all elements from existing collection 
		System.out.println("after removingAll element of c1 from c  ::");
		
		System.out.println(c);
		
		c.retainAll(c1); // gives the elements that a collection stores from another collection 
		
		System.out.println("After retaining elements of c1 from c  ");
		
		System.out.println(c);
		
		c1.clear(); // clears all elements of collection 
		
		System.out.println("After clearing c1 collection ");
		
		System.out.println(c1);
		
		
		System.out.println(c1.contains(34)); //  checks whether element is available or not
		
		System.out.println(c.containsAll(c1)); // checks whether parameter collection is available in c1 or not 
		
		
		System.out.println(c1.isEmpty()); // checks list is empty or not 
		
		
		System.out.println(c.size()); // returns the size of that collection 
		
		
		
	}
}
