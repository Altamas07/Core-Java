package com.array;

public class SearchingOfArray {
public static void main(String[] args) {
	int[] arr= {34,56,23,67,51,83,49,91};
	
	int element=97;
	boolean found=false;
	for(int i=0;i<arr.length;i++) {
		
		
		if(arr[i]==element) {
			found=true;
			
			System.out.println("element found at index :"+i);
			break;
		}
		
		}
	if(found==false) {
		
		System.out.println("element not found at any index :");
	}
}
}
