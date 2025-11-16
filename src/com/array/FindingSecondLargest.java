package com.array;

import java.util.Arrays;

public class FindingSecondLargest {
     public static void main(String[] args) {
		
    	 int[] arr= {34,4,64,664,43,63,25};
    	 
    	 Arrays.sort(arr);
    	 
    	 int n=arr.length;
    	 
    	 System.out.println("The Second largest number is ::"+arr[n-2]);
	}
}  
