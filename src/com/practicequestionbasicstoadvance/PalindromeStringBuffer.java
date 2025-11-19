package com.practicequestionbasicstoadvance;

public class PalindromeStringBuffer {
    
	public static void main(String[] args) {
		
		String str="madam";
		StringBuffer stringBuffer= new StringBuffer(str).reverse();
		
		
		//StringBuffer reverse = stringBuffer.reverse();
		
		
		if(str.equals(stringBuffer)) {
			
			
			System.out.println("palindrome ");
			
			
		}
		else {
			
			System.out.println("Not a palindrome");
		}
	}
}
