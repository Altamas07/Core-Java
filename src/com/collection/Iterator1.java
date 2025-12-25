package com.collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		
		Collection<Integer> i=new ArrayList<Integer>();
		
		i.add(33);
		i.add(45);
		i.add(76);
		i.add(98);
		
		Iterator<Integer> i1=i.iterator();
		
		while(i1.hasNext()) {
			
			System.out.println(i1.next());
		}
		
;	}
}
