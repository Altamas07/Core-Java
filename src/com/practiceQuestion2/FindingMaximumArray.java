package com.practiceQuestion2;
     
public class FindingMaximumArray {

	public static void main(String[] args) {
		
		
		int[] arr= {78,87,57,97,34,76};
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				
				max=arr[i];
			}
			
			
		}
		System.out.println(max);
	}
}
