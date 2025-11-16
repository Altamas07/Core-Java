package com.practicequestion;

public class SumDigits {
    public static void main(String[] args) {
		int num=53653;
		int sum=0;
		int rev;
		while(num>0) {
			
			rev=num%10;
			sum=sum+rev;
			num=num/10;
			
		}System.out.println(sum);
	}
}
