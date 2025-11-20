package com.controlStatement;

public class Iterating3dArrayWithForEachLoop {
             
	public static void main(String[] args) {
		
		int[][][] arr= {{{34,56,54},{54,63,64},{455,35,35}}};
		
		for(int[][] arr1:arr) {
			
			for(int[] arr2:arr1) {
				
				for(int arr3:arr2) {
					
					System.out.println(arr3);
				}
			}
		}
	}
}
