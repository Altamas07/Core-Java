package com.ControlStatement;

public class SumOfDigits {
	static int SumOfDigits(int a) {
		if(a==0) {
		
			return 0;
		}	
			return(a%10)+  SumOfDigits(a/10);
		}
		
	
	public static void main(String[] args) {
		System.out.println(SumOfDigits(6446745));
	
	}

}
