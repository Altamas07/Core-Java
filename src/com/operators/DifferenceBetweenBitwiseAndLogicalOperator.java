package com.operators;

public class DifferenceBetweenBitwiseAndLogicalOperator {
       
	public static void main(String[] args) {
		
		int year=2000;
		
		if((year %4==0 && year%100!=0)||(year%400==0)){
			
			System.out.println(year +" is leap year ");
			
			
		}
		else {
			
			System.out.println("NOT A LEAP YEAR ");
		}
		
		if((year%4==0&year%100!=0)||(year%400==0)){
			
			System.out.println(year+" is a leap year :");
			
		}
		
		else {
			System.out.println(year+" is not a leap year :");
		}
	}
}
// here both &&,|| and &,| are giving same output but logical && and logical || is faster 
// than bitwise operator 
