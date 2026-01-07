package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

	

public class InsertingStringAnStringBufferInTreeSet {

	
	public static void main(String[] args) {
		
		Comparator<Object> c=new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				
				String s1=o1.toString();
				String s2=o2.toString();
				
				int lencompare=Integer.compare(s1.length(), s2.length());
				
				if(lencompare!=0) {
					return lencompare;
					
				}
				
				return s1.compareTo(s2);
			}
			
			
		};
		TreeSet ts=new TreeSet(c);
		
		ts.add("iuyrd");
		ts.add("gfdeds");
		ts.add("enbvcds");
		ts.add("esdfds");
		ts.add("edgfds");
		
		
		ts.add(new StringBuffer("sdfghjkl"));
		ts.add(new StringBuffer("sghjkl"));
		ts.add(new StringBuffer("sdfgkl"));
		ts.add(new StringBuffer("sdfghj"));
		
		System.out.println(ts);
		
	}
}
