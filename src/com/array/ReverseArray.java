package com.array;

public class ReverseArray {
   public static void main(String[] args) {
	int[] arr= {12,34,54,34,56};
	
	int[] rev=new int[arr.length];
	
	for(int i=arr.length-1;i>=0;i--) {
		
		rev[i]=arr[i];
		System.out.println(rev[i]);
	}
	
}
}
