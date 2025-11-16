package com.array;

import java.util.Arrays;

public class FindingThirdLargest {
   public static void main(String[] args) {
	
	   int[] arr= {23,43,53,4,24,65,75};
	   
	   Arrays.sort(arr);
	   int n=arr.length;
	   System.out.println("The third largest number is::" + arr[n-3]);
}
}
