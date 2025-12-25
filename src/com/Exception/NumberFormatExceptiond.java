package com.exception;

public class NumberFormatExceptiond {

	public static void main(String[] args) {
		
		int i= Integer.parseInt("23");
		
		System.out.println(i);
		
		int j=Integer.parseInt("ten");
		System.out.println(j);
	}
}
