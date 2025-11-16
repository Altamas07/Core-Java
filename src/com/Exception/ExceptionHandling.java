package com.exception;

public class ExceptionHandling {
	public static void main(String[] args) {
		int a=34;
		int b=0;
		try {
		System.out.println(a/b);
		
	} catch (Exception e){
			System.out.println("cannot divide by zero " +e);
			
		System.out.println(a*b);
		System.out.println("hello friends");
	}

}
}