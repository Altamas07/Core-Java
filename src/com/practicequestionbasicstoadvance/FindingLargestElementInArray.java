package com.practicequestionbasicstoadvance;

public class FindingLargestElementInArray {
      public static void main(String[] args) {
    	  
    	 
		
    	  int []arr= {45,76,34,234,234,65};
    	  
    	  int max=arr[0];
    	  
    	  for(int i=0;i<arr.length;i++ ) {
    		  
    		  if(arr[0]<arr[i]) {
    			  
    			  arr[0]=arr[i];
    			  
    			  max=arr[0];
    		  }
    		  
    	  }
    	  System.out.println(max);
	}
}
