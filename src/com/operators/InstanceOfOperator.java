package com.operators;

public class InstanceOfOperator {
      
	public static void main(String[] args) {
		
		String s=new String();
		
		Thread t=new Thread();
		
		
		
		System.out.println(s instanceof Object);
		System.out.println(t instanceof Object);
	    System.out.println(t instanceof Runnable);
		
	}
}
