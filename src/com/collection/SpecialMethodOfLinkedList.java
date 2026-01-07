package com.collection;

import java.util.LinkedList;

public class SpecialMethodOfLinkedList {
	
    public static void main(String[] args) {
	 LinkedList<Integer> integers=new LinkedList<Integer>();
	 
	 integers.add(23);
	 integers.add(67);
	 integers.add(98);
	 
	 System.out.println(integers);
	 
	 
	 integers.addFirst(34);
	 
	 System.out.println("After adding at first index ");
	 
	 System.out.println(integers);
	 integers.addLast(56);
	 
	 System.out.println("After adding at last index ");
	 
	 System.out.println(integers);
	 
	 System.out.println(integers.getFirst()); // returns value at first index 
	 
	 System.out.println(integers.getLast() ); // returns value at last index 
	 
	 integers.removeFirst();
	 
	 System.out.println("After removing first element ");
	 
	 System.out.println(integers);
	 
	 integers.removeLast();
	 
	 System.out.println("After removing last  element ");
	 
	 System.out.println(integers);
}
}
