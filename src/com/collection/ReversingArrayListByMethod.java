package com.collection;

import java.util.ArrayList;
import java.util.Collections;


public class ReversingArrayListByMethod {
           
	public static void main(String[] args) {
		
		
		
		ArrayList<Integer>arrayList=new ArrayList<Integer>();
		
		arrayList.add(46);
		arrayList.add(42);
		arrayList.add(44);
		arrayList.add(42);
		arrayList.add(46);
		
		
		Collections.reverse(arrayList);
		System.out.println(arrayList);
	}
}
