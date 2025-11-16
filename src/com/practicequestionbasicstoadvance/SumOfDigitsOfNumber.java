package com.practicequestionbasicstoadvance;

public class SumOfDigitsOfNumber {
   public static void main(String[] args) {
	int a=987654;
	
	
	int sum=0;
	int b;
	while(a!=0){
	b=a%10;
	sum+=b;
	a=a/10;
	
	}
	
	System.out.println(sum);
}
}
