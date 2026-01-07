package com.collectionpracticequestion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class InsertinOnlyEvenNumbersInTreeSetFromArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(23);
		al.add(24);
		al.add(25);
		al.add(26);
		al.add(27);
		al.add(28);
		al.add(29);
		al.add(20);
		
		
		
		System.out.println(al);
		
		
				
		TreeSet<Integer> ts=new TreeSet<Integer>();
				
		for(Integer i:al) {
					
					if(i%2==0) {
						
				ts.add(i);
				
				
			}
		}
		System.out.println(ts);
		
	}
}
