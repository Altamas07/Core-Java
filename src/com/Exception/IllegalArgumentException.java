package com.exception;

public class IllegalArgumentException {

	
	public static void main(String[] args) {
		
		Thread t=new Thread();
		
		t.setPriority(3);
		System.out.println(t);
		t.setPriority(45);
		System.out.println(t);
	}
}
