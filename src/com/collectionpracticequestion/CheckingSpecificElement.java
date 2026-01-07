package com.collectionpracticequestion;


import java.util.ArrayList;

public class CheckingSpecificElement {

	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList<>();
		
		l.add(34);
		l.add(32);
		l.add(12);
		l.add(87);
		l.add(54);
		l.add(12);
		
		System.out.println(l);
		
		System.out.println(l.contains(12));
	}
}
