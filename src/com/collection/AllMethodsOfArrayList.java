package com.collection;

import java.util.ArrayList;

public class AllMethodsOfArrayList {
         
	public static void main(String[] args) {
		
		ArrayList<Integer>arrayList=new ArrayList<Integer>();
		
			arrayList.add(34);
			arrayList.add(54);
			arrayList.add(64);
			arrayList.add(24);
			arrayList.add(74);
			arrayList.add(24);
			arrayList.add(14);
			  
			System.out.println("After adding element ::"+arrayList);
			
			// get()  fetching element 
			
			System.out.println(arrayList.get(1));
			
			// set()  replacing value 
			
			arrayList.set(1, 89);
			
			System.out.println(arrayList);
			
			// remove() remove element at index 
			
			arrayList.remove(1);
			
			System.out.println(arrayList);
			
			// size() to check size of that method 
			
			System.out.println(arrayList.size());
			
			// contains   To check an element is available at index or not 
			
			System.out.println(arrayList.contains(89));
			
			// isEmpty()  To check list is empty or not 
			
			System.out.println(arrayList.isEmpty());
			
			// indexOf() + lastIndexOf() to check first and last occurance in the list
			
			System.out.println(arrayList.indexOf(24)+" "+arrayList.lastIndexOf(24));
			
			// addAll()  this will add all  element available in first arrayList to another
			
			ArrayList<Integer>arrayList2=new ArrayList<Integer>();
			
			arrayList2.addAll(arrayList);
			
			System.out.println(arrayList2);
			
			// removeAll() remove all element available at that list  
			
			arrayList2.removeAll(arrayList);
			System.out.println(arrayList2);
			
			// clear() to clear all elements available in that list 
			
			arrayList.clear();
			System.out.println(arrayList);
	}
}
