package com.controlStatement;

public class ForEachLoop {
         
	public static void main(String[] args) {
		
		int[][] arr= {{34,34,34,54,65},{65,43,5,765,6}};
		
		
		for(int[] arr1:arr) {
	 
			for(int arr2:arr1) {
				
				System.out.println(arr2);
			}
			
		}
	}
}
