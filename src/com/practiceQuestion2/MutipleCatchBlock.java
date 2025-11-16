package com.practiceQuestion2;

public class MutipleCatchBlock {
     public static void main(String[] args) {
		
    	 int a=87,c=0;
    	 int[] arr= {34,65,34,76,35};
    	 
    	 try {
    		 System.out.println(a/c);
    		
    	 }
    	 catch (ArithmeticException e) {
    		 
    		 System.out.println(e.getMessage());
    		 
    	 	
		}
    	
    	 try {
			 
			 System.out.println(arr[8]);
} catch (Exception e) {
	 
	 System.out.println(e.getMessage());
		}
    		

     }
}