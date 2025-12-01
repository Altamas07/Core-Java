package com.exception;

public class StackOverFlowError {

	
	public static void m1() {
		
		m2();
		
	}
	
	public static void m2() {
		
		m1();
		System.out.println("asd");
	}
	
	
		
	
	
	public static void main(String[] args) {
		try {
		m1();
		}
		catch(Throwable e) {
			
			System.out.print(e.getMessage());
		System.out.println("hello");
	}
}
}