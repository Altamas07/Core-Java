package com.collection;

import java.util.List;
import java.util.ArrayList;

import java.util.Collections;

public class SynchronizedVersionOfArraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> i=new ArrayList<Integer>();
		
		List<Integer> l=Collections.synchronizedList(i);
		
		l.add(23);
		l.add(90);
		l.add(89);
		
		System.out.println(l);
	}
}
