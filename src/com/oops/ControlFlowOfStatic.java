package com.oops;


public class ControlFlowOfStatic {
         
	static int x=10;
	
	static {
		m1();
		
		System.out.println("First static block ");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main ");
	}
	
	static {
		
		System.out.println("Second Static block ");
	}
	static void m1() {
		
		System.out.println(c);
	}
	
	static int c=200;
	
}


