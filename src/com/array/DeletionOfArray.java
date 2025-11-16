package com.array;

public class DeletionOfArray {
public static void main(String[] args) {
	  
	int[] arr= {78,56,34,67,58,69,38,93};
	int posindex=4;
	
	int[] newArr=new int [arr.length-1];
	int j=0;
	for(int i=0;i<arr.length;i++){
		
		if(i==posindex) {
			continue;
		}
		
		newArr[j]=arr[i];
		j++;
	}
	
	
	for(int del:newArr) {
		
		System.out.println(del);
	}
}
}
