package com.collectionpracticequestion;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator32 implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		int lendiffer=o1.length()-o2.length();
		
		if(lendiffer!=0) {
			
			return lendiffer;
			
		}
		else {
		return o1.compareTo(o2);
	}
	}
	
}


public class TreeSetSortingInStringByLengthAndAlphabeticallyOrder {

	public static void main(String[] args) {
		 TreeSet<String> te=new TreeSet<String>(new MyComparator32());
		 te.add("LKJHGF");
		 te.add("oihgc");
		 te.add("ASVBNM");
		 te.add("ASDFGHJKL");
		 
		 System.out.println(te);
	}
}
