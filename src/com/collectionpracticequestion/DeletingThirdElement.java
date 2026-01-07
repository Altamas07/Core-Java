package com.collectionpracticequestion;

import java.util.ArrayList;

public class DeletingThirdElement {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(45);
		al.add(47);
		al.add(43);
		al.add(4145);
		al.add(4676);
		
		System.out.println("Before deleting third element");
		System.out.println(al);
		
		al.remove(2);
		
		System.out.println("After removing third element ");
		
		System.out.println(al);
	}
}
