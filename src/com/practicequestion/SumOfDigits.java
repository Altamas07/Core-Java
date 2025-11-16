package com.practicequestion;

public class SumOfDigits {
	
	
	static int sumDigit(int num) {
		if(num==0)
		{
			return 0;
		}
		return (num%10)+sumDigit(num/10);
	}
     public static void main(String[] args) {
	   
    	 
    	 
    	  int num=45324;
    	     System.out.println(sumDigit(num));
    	 
} 
}
