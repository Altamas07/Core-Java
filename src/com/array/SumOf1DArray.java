package com.array;

public class SumOf1DArray {
   public static void main(String[] args) {
	 int[] arr= {23,45,34,65,34,76};
	 
	 int sum=0;
	 for(int i=0;i<arr.length-1;i++) {
		 
		 sum+=arr[i];
		 
	 }
	 System.out.println(sum);
} 
   
}
