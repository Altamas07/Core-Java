package com.array;

public class SmallestElementInArray {
      public static void main(String[] args) {
		
    	  
    	  int[] arr= {35,45,45,23,55,334};
    	  
    	  int min=arr[0];
    	  
    	  for(int i=0;i<arr.length;i++) {
    		  
    		  if(arr[i]<min) {
    			  
    			  min=arr[i];
    		  }
    	  }
    	  System.out.println(min);
	}
}
