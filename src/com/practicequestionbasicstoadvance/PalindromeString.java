package com.practicequestionbasicstoadvance;

import java.util.Scanner;

public class PalindromeString {
        
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your string to check");
		
	 String sc=scanner.nextLine();
	 
	 String ch="";
	 for(int i=sc.length()-1;i>=0;i--) {
		 
		  ch+=sc.charAt(i);
		 
		 
	 }
	 
	 if(sc.equals(ch)){
		 
		 System.out.println("Palindrome ");
		 
	 }
	 else {
		 
		 System.out.println("not a palindrome");
	 }
	}
	
}
