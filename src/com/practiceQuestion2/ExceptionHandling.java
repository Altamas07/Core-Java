package com.practiceQuestion2;

public class ExceptionHandling {
    public static void main(String[] args) {
		
    	int a=45;
    	int b=0;
    	int c=5;
 
    	try {
    	
    		System.out.println(a/b);
    	}catch (ArithmeticException e) {
			
    	System.out.println( e.getMessage());
		}
    	System.out.println(a/c);
    	
    	
    	System.out.println("end");
	}
    
}
