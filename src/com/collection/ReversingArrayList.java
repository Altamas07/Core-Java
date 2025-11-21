package com.collection;

import java.util.ArrayList;

public class ReversingArrayList {
     
	public static void main(String[] args) {
		
		ArrayList<String>arrayList=new ArrayList<>();
		
		arrayList.add("sdfghk");
		arrayList.add("sdfg");
		arrayList.add("sdhk");
		
		arrayList.add("shk");
		arrayList.add("sdfhk");
		arrayList.add("sghk");
		
		
		int left=0;
		int  right =arrayList.size()-1;
		
		while(left<right) {
			
			String temp=arrayList.get(left) ;
			
			arrayList.set(left, arrayList.get(right));
			arrayList.set(right, temp);
			
			
			right--;
			left++;
			
			
			
		}
		
		System.out.println( arrayList);
		
		
		
		
	}
}
