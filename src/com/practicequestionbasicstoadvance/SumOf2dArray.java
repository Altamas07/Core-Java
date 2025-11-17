package com.practicequestionbasicstoadvance;

public class SumOf2dArray {
	
	public static void main(String[] args) {
		
		int[][] arr= {{34,56,76},{45,34,32}};
		
		int sum=0;
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				sum=sum+arr[i][j];
				
			}
			
		}
		System.out.println(sum);
	}

}
