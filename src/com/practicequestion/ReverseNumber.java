package com.practicequestion;

public class ReverseNumber {
      public static void main(String[] args) {
		  
    	  
    	    int num=422432;
    	    int sum=0;
    	    int rev;
    	    while(num>0) {
    	    	
    	    	rev=num%10;
    	    	sum=(sum*10)+rev;
    	    	num=num/10;
    	    	
    	    }
    	    System.out.println(sum);
	}
}
