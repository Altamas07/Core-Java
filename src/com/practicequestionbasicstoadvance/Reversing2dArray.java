package com.practicequestionbasicstoadvance;

public class Reversing2dArray {
      
	public static void main(String[] args) {
		
		int[][] arr= {{45,34,34,345,675,4543},{765,43,234,65,2,65}};
		
		for(int i=arr.length-1;i>=0;i--) {
			
			for(int j=arr[i].length-1;j>=0;j--) {
				
				System.out.println(arr[i][j]);
				
			}
		}
 	}
}
