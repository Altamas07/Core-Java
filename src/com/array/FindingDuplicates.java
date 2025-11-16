package com.array;

import java.util.HashSet;

public class FindingDuplicates {
public static void main(String[] args) {
	    
	
	
	int[] arr= {23,54,67,45,34,56,56,23};
	
	HashSet<Integer> seen=new HashSet<Integer>();
	
	 HashSet<Integer> duplicates=new HashSet<Integer>();
	 
	 for(int num:arr) {
		 
		 if(!seen.add(num)) {
			 
			 duplicates.add(num);
		 }
		 
	 }
	 System.out.println(duplicates);
	}

}
