package com.practicequestion;

public class Palindrome {
	public static void main(String[] args) {
		  
		int num=535;
		int sum=0;
		int rev;
		int temp=num;
		while(num>0) {
			
			rev=num%10;
			sum=(sum*10)+rev;
			num=num/10;
		}	
			if(sum==temp) {
				
				System.out.println("Number is palindrome :");
		}
			else {
				
				System.out.println("not a palindrome :");
			}
		}
	}

