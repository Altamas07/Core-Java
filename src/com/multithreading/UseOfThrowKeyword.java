package com.multithreading;


public class UseOfThrowKeyword {

	static void ageValidation(int age ) {
		
                            // use of throw keyword is to create object of exception and hand over to
		                    // JVM for default exception handling 
		if(age<18) {
		
	throw new ArithmeticException("dfgjkl;");
	
	}
		System.out.println("Eligible to vote ");
	}

	public static void main(String[] args) {
		
		
			ageValidation(45);
	
			
		
	}
}
