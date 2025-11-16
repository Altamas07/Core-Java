package com.array;

import java.util.Arrays;

import java.util.Collections;

public class SortingArray1 {
   public static void main(String[] args) {
	  
	   Integer[] arr = {34,54,24,56,14,45};
	   
	   Arrays.sort(arr,Collections.reverseOrder());
	   
	   for(int num:arr) {
		   
		   System.out.println(num); 
		   
	   }
}
}
