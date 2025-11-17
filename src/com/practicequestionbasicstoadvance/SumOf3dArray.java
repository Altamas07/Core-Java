package com.practicequestionbasicstoadvance;

public class SumOf3dArray {

	public static void main(String[] args) {
		
		int[][][] arr= {{{43,54,546,4},{34,234,234},{34,565,23}}};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				for(int k=0;k<arr[i][j].length;k++) {
					
					
					sum=sum+arr[i][j][k];
				}
			}
		}
		System.out.println(sum);
	}
}
