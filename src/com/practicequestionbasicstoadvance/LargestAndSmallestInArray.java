package com.practicequestionbasicstoadvance;

public class LargestAndSmallestInArray {
	
	public static void main(String[] args) {
		
		int[] arr= {54,87,89,67,54,34,98,89};
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			
			
			if(max<arr[i]) {
				
				max=arr[i];
				
				
				
			}
			
		
		
			
		}
		System.out.println(max);
		
		for(int j=0;j<arr.length;j++) {
			
			if(min>arr[j]) {
				
				min=arr[j];
				
			}
		}
		System.out.println(min);
	}

}
