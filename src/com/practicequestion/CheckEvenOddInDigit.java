package com.practicequestion;

public class CheckEvenOddInDigit {
      public static void main(String[] args) {
	
    	  int num=436572586;
    	  
    	  int rev;
    	 int  evencount=0;
    	 int oddcount=0;
    	  while(num>0) {
    		  rev=num%10;
    		  if(rev%2==0) {
    		
				  evencount++;
    		  }
    		  
    		  else {
    			  
    			  oddcount++;
    		  }
    		  
    		  num=num/10;
    	  }
    	  System.out.println("Even digits:"+evencount);
	  System.out.println("odd number : "+oddcount);
    	
} 

}
