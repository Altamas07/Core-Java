package com.operators;

public class MixedUnaryOperator {
           
	public static void main(String[] args) {
		 
		int a=10;
		int b=6;
	/*	int c= ++a + a++ + ++b + b++;
		
		System.out.println(b);
		System.out.println(a);
		System.out.println(c);
	*/	int d=--a + a-- + --b + b--;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
	}
}
