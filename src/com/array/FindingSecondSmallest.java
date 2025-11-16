package com.array;

import java.util.Arrays;
import java.util.Collections;

public class FindingSecondSmallest {
     public static void main(String[] args) {
		
    	 Integer[] arr= {23,54,45,35,345,34};
    	 
    	 Arrays.sort(arr,Collections.reverseOrder());
    	 
    	 int n=arr.length;
    	 System.out.println(arr[n-2]);
	}
}
