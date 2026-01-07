package com.collection;

import java.util.Vector;

public class VectorSpecificMethod {
 
	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<Integer>();
		v.add(34);
		
		v.add(98);
		
		v.addElement(45);
		
		System.out.println(v);
		
		v.removeElement(34);
		
		System.out.println(v);
		
		v.removeElementAt(0);
		
		System.out.println(v);
		
		v.elementAt(0);
		System.out.println(v);
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.capacity());
		// these are all methods of vector but not recommended to use 
	}
}
