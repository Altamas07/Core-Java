package com.project;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
		
    	
    	Scanner sc= new Scanner(System.in);
    	  System.out.println("SIMPLE CALCULATOR ::::");
    	  
    	  System.out.println("Enter your first number ::");
    	  int num=sc.nextInt();
    	  
    	  System.out.println("Enter your opertaor ::"+'+'+'-'+'%'+'*'+'/');
    	  char operator=sc.next().charAt(0);
    	  
    	  System.out.println("Enter your second number :::");
    	  int num1=sc.nextInt();
    	  
    	 
    	  int result=0;
    	  
    	  switch(operator) {
    	  
    	  case '+':
    		  
    		  result=(num+num1);
   System.out.println(result);
    		  
    	  case '-':
    		  
    		  result=num-num1;
    		  
    		  System.out.println(result);
    		  
    		  
    	  case '%':
    		  
    		  result=num%num1;
    		  
    		  System.out.println(result);
    		  
    	  case '/':
    		  
    		  result =num/num1;
    			  
    			  System.out.println(result); 
    			  
    	  case '*':
    		  
    		  result=num*num1;
    		  
    		  System.out.println(result );
    			  
    		  
    	  }
    	  sc.close();
    	  }
	}

