package com.collectionpracticequestion;

import java.util.LinkedList;

public class InsertingElementAtFirstAndLAstIndex {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.addFirst("First");
		ll.addLast("Last");
		ll.add("bnm,");
		
		System.out.println(ll);
	}
}
