package com.array;

public class MultiArray {
	
	public static void main(String[] args) {
		
		int[][] arr= {{34,56,67,65},{45,34,23,54},{23,45,36,75},{45,67,43,23}};
		
		
		for(int i=0;i<4;i++) {
			
			for(int j=0;j<4;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
