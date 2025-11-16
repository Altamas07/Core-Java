package com.array;

public class CopyingArrayElement {
      public static void main(String[] args) {
		
    	    int[] arr= {56,77,87,95,54};
    	    
    	    int[] arr1=new int[arr.length];
    	    
    	    for(int i=0;i<arr.length;i++) {
    	    	
    	    	arr1[i]=arr[i];
    	    	
    	    }
    	   System.out.println("Original elements are ::");
    	    for(int i=0;i<arr.length;i++) {
    	    	System.out.println(arr[i]);
    	    }
    	    System.out.println("After copying all elements::");
    	    
    	    for(int j=0;j<arr1.length;j++) {
    	    	
    	    	System.out.println(arr1[j]);
    	    }
    	  
	}
}
