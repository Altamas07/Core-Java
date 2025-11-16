package com.controlStatement;

public class SumOfDigits {
	static int sumOfDigits(int a) {
		if(a==0) {
		
			return 0;
		}	
			return(a%10)+  sumOfDigits(a/10);
		}
		
	
	public static void main(String[] args) {
		System.out.println(sumOfDigits(6446745));
	
	}

}
