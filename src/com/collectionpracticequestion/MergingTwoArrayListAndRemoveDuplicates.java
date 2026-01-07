package com.collectionpracticequestion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class MergingTwoArrayListAndRemoveDuplicates {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		ArrayList<Integer> arr1= new ArrayList<Integer>();
		
		arr.add(23);
		arr.add(95);
		arr1.add(23);
		arr.add(75);
		arr.add(686);
		arr1.add(644);		
		arr.add(95687);
		arr1.add(23);
		arr1.add(95);
		
		// 1st way 
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		ts.addAll(arr);
		ts.addAll(arr1);
		
		System.out.println(ts);
	
		
		// 2nd way 
		
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.addAll(arr1);
		hs.addAll(arr);
		System.out.println(hs);
		
		
		
	}
}
