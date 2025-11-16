package com.project;

	import java.util.Scanner;

	public class PalindromeChecker {
		public static void main(String[] args) {
			
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Please enter your number to check :");
	        int num =sc.nextInt(); 
	        System.out.println("Please enter your string to check :");
	        String str=sc.next();
	        int temp=num;
	        int rev;
	        int sum=0;
	       
	        
	        String reverse="";
	        while(num>0) {
	        	
	        	rev=num%10;
	        	sum=(sum*10)+rev;
	        	num=num/10;
	        	
	        }
	        if(sum==temp) {
	        	System.out.println("Entered number is Palindrome :");
	        }
	        else {
	        	System.out.println("Entered number is not  Palindrome :");
	        }
	        for(int i=str.length()-1;i>=0;i--) {
	        	
	        	reverse+=str.charAt(i);
	        	
	        	
	        	
	        }
	        if(str.equals(reverse)) {
	        	System.out.println("Entered String is Palindrome :");
	        }
	        else {
	        	System.out.println("Entered String is not Palindrome");
	        }
	        sc.close();
	}
	}

