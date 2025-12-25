package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class ConstructorsOfArraylist {

	public static void main(String[] args) {
		
		Collection<Integer> c=new ArrayList<Integer>();
		
		ArrayList<Integer> i=new ArrayList<Integer>(); // creates empty arraylist with default initial 
		                                               // capacity of 10 
		
		ArrayList<Integer> i1=new ArrayList<Integer>(10); // creates arraylist with  initial capacity of
                                                          // capacity of 10 
		
		ArrayList<Integer> i2=new ArrayList<Integer>(c); // creates an arraylist copying all elements of collection c 
		
	
		
		
		
	}
}
