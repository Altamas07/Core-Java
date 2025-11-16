package com.array;

public class InsertionOfArray {
	
	public static void main(String[] args) {
		
		int[] arr= {45,76,98,65,34,89,90}; 
		
		int posindex=2;
		int element=63;
		
		int[] newArr= new int[arr.length+1];
		
		for(int i=0;i<posindex;i++) {
			
			newArr[i]=arr[i];
			
		}
		newArr[posindex]=element;
		
		
		for(int i=posindex;i<arr.length;i++) {
			
			newArr[i+1]=arr[i];
		}
		for(int arry:newArr) {
			System.out.println(arry);
		}
	}

}
