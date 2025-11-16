package com.exception;

import java.util.Scanner;

public class MultipleExceptionHandling {
       public static void main(String[] args) {
	      int marks[]= {43,56,43,87,67,89,90,69,};
	      Scanner sc=new Scanner(System.in);
	      System.out.println("enter your index to found array:");
	      int ind=sc.nextInt();
	      System.out.println("Enter your number to divide array:");
	      int num=sc.nextInt();
	      try {
	    	  System.out.println("the array at the index you entered is: "+marks[ind]);
		     
		      
	      
       } catch (ArrayIndexOutOfBoundsException e){
    	   System.out.println("Array index not found :");
       }
	     
	      
	      try {
	    	  System.out.println("The value of array/number is :"+marks[ind]/num); 
	    	  
	      } catch(ArithmeticException e) {
	    	  System.out.println("You cannot divide any number by zero in java:");
	      }
	      System.out.println("Thanks for using this code");
	      sc.close();
}

}
