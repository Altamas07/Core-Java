package com.exception;



public class ExceptionHandling {
	public static void main(String[] args) {
		int a=34;
		int b=0;
		try {
		System.out.println(a/b);
		
	} catch (Exception e){
		
		// Method 1
		
		e.printStackTrace();
		
		// Method 2
			System.out.println("cannot divide by zero " +e);
			
		//	Method 3
			System.out.println(e.getMessage());
			
		System.out.println(a*b);
		System.out.println("hello friends");
	}

}
}