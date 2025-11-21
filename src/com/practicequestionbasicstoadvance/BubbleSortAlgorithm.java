package com.practicequestionbasicstoadvance;

public class BubbleSortAlgorithm {
           
	public static void main(String[] args) {
		
		int[] arr= {34,65,34,2455,232};
		
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=0;j<arr.length-1-i;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					// if condition is true it is going to be swapping concept::
					
					int temp=arr[j];
					
					arr[j]=arr[j+1];
					
					arr[j+1]=temp;
					
					
				}
			}
			
			
			}
		for(int arr1:arr) {
			
			System.out.println(arr1);
		}
	}
}
