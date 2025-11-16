package com.exception;
   @SuppressWarnings("serial")
   class MyException extends Exception{ 
	   public MyException(String message) {
		   super(message);
	   }
   }
   
public class CustomException {
	static void checkAge(int age) throws MyException {
		if(age<18) {
			throw new MyException("Age must be greater than 18:");
			
		}
		else {
			System.out.println("you are eligible to vote");
		}
		
	}
       public static void main(String[] args) {
	   try {
		checkAge(45);
	   }catch(MyException e) {
		System.out.println("Caught exception :" +e.getMessage());
	}
	   System.out.println("thanks");
  }
       
}
