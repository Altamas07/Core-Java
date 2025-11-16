package com.array;

public class FindingLargestNumber {
   public static void main(String[] args) {
	int[] arr= {32,54,65,644,312,634,980};
	
	int max=arr[0];
	
	for(int i=0;i<arr.length-1;i++) {
		
		if(arr[i]>max) {
			
			max=arr[i];
		}
		
		
	}
	System.out.println(max);
}
}
