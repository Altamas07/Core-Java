package com.array;

public class SumOf2DArray {
  public static void main(String[] args) {
	int[] []arr= {{34,54,65,32,},{32,45,32,56},{45,34,56,78},{23,43,13,56}};
	
	for(int i=0;i<arr.length;i++){
		int sum=0;
		for(int j=0;j<arr[i].length;j++) {
			
			
			sum+=arr[i][j];
			
			
		}
		System.out.println("Row " + (i+1) + " sum " + sum);
	}
}
}
