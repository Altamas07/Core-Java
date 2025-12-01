package com.array;

public class PrintingAlternateElementInArray {
           
	public static void main(String[] args) {
		
		int[] arr= {65,4,3,5,5,2,4563,35,90};
		
		for(int i=0;i<arr.length;i+=2) {
			
			System.out.println(arr[i]);
		}
	}
}
