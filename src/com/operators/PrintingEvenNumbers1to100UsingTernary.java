package com.operators;

public class PrintingEvenNumbers1to100UsingTernary {
	
	
         public static void main(String[] args) {
			
        	 for(int i=1;i<=100;i++) {
        		 
        		 String result=(i%2==0?"Even":"odd");
        		 
        		 
        		 System.out.println(i+"is"+result);
        	 }
        	 System.out.print(" ");
		}
}
