package com.array;

public class FindingDuplicates1 {
    public static void main(String[] args) {
		int[] arr= {23,4,54,32,54,67,4,32};
		
		System.out.println("Duplicates value  are:::");
		
	for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
				
			}
		}
	}
}
