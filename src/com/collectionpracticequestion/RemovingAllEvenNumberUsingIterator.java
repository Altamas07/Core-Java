package com.collectionpracticequestion;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovingAllEvenNumberUsingIterator {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(34);
		al.add(56);
		al.add(34);
		al.add(58);
		al.add(37);
		al.add(53);
		al.add(33);
		al.add(59);
		al.add(31);
		al.add(55);
		
		Iterator<Integer> itr=al.iterator();
		
		while(itr.hasNext()) {
			
			Integer i=itr.next();
			
			if(i%2==0) {
				
				itr.remove();
				
				
			}
			
		}

		System.out.println(al);
	}
}
