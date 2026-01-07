package com.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class MethodsOfQueueInterface {

	public static void main(String[] args) {
		
		Queue<Integer> q=new ArrayDeque<Integer>();
		
		q.offer(34);  // offer is preferred over add method because it does not throw any exception 
		q.offer(98);
		q.offer(76);
		q.offer(34);
		
		System.out.println(q.peek()); // returns the head  element of queue
		
		System.out.println(q.poll());// returns the head element and remove 
		System.out.println(q);
	}
}
