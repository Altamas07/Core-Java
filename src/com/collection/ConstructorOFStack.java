package com.collection;

import java.util.Stack;

public class ConstructorOFStack {

	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<Integer>(); // creates a default stack of initial capacity 10;
		
		
		/*s.add(54);
		s.add(98);
		s.add(23); you can add like this but it is confusing because these methods from vector and stack follows 
		lifo (last in first out )
		
		s.add(12);
		*/
		
		s.push(34); // this will add item at top of the stack 
		s.push(64);
		s.push(84);
		s.push(33);
		s.push(22);
		
		
		System.out.println(s.peek()); // this method will return first element of top of the stack 
		
		s.pop();// this will remove the first element top of the stack
		
		System.out.println(s);
		
		System.out.println(s.search(34)); // returns -1 if element is not found 
		
		
		
		System.out.println(s.empty());
	}
}
