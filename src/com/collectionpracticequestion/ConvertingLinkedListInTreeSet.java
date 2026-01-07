package com.collectionpracticequestion;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class ConvertingLinkedListInTreeSet {

	public static void main(String[] args) {
		
		LinkedList<Integer> ls=new LinkedList<Integer>();
		
		ls.add(23);
		ls.add(67);
		ls.add(12);
		
		System.out.println(ls );
		TreeSet<Integer> ts=new TreeSet<Integer>(Collections.reverseOrder());
		
		ts.addAll(ls);
		
		System.out.println(ts);
		
		
		MyComparator21 my=new MyComparator21();
		
		TreeSet<Integer> ts1=new TreeSet<Integer>(my);

		ts1.addAll(ls);
		
		System.out.println(ts1);
	}
}

class MyComparator21 implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
	
}
