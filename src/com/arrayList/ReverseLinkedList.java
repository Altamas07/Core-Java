package com.arrayList;

import java.util.Iterator;
import java.util.LinkedList;


public class ReverseLinkedList {
	public static void main(String[] args) {
	
		LinkedList<String> arr=new LinkedList<>();
		arr.add("Altamas");
		arr.add("Altam");
		arr.add("Altama");
		arr.add("Alta");
		
		System.out.println((arr));
		
		Iterator<String> str=arr.descendingIterator();
		while(str.hasNext()) {
			
			System.out.println(str.next());
		}
		System.out.println("\n");
		for(int i=arr.size()-1;i>=0;i--) {
			
			System.out.println(arr.get(i));
		}
	
		
		}
	}

