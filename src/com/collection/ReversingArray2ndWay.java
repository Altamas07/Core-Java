package com.collection;

import java.util.ArrayList;

public class ReversingArray2ndWay {
       
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		arrayList.add(34);
		arrayList.add(35);
		arrayList.add(354);
		arrayList.add(355);
		arrayList.add(334);
		arrayList.add(354);
		arrayList.add(3675);
		
		ArrayList<Integer>arrayList2=new ArrayList<Integer>();
		
		for(int i=arrayList.size()-1; i>=0 ;i--) {
			
			arrayList2.add(arrayList.get(i));
			
			
			
		}
		System.out.println(arrayList2);
	}
}
