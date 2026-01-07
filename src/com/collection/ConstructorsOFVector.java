package com.collection;

import java.util.Collection;
import java.util.Vector;

public class ConstructorsOFVector {

	public static void main(String[] args) {
		
		Collection<Integer> c=new Vector<Integer>();
		
		Vector<Integer>v=new Vector<Integer>();
		// creates an empty vector of initial capacity 10 it grows when its size reaches more than
		// capacity it will become double of it size 
		
		Vector<Integer>v1=new Vector<Integer>(100);
		// creates vector of 100 initial capacity it grows when its size reaches more than
		// capacity it will become double of it size 
		
		Vector<Integer>v2=new Vector<Integer>(100,100);
		// creates vector of 100 initial capacity it grows when its size reaches more than
				// capacity it will become double of it size 
			
		Vector<Integer>v3=new Vector<Integer>(c);
		
		// creates an vector of copying all elements of collection c 
	}
}
