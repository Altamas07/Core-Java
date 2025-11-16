package com.array;

public class FindingEvenIndexElement{
    public static void main(String[] args) {
		 int[] arr= {12,34,54,34,21,45,65};
		 
		 System.out.println("Reversed array::");
		 
		 for(int i=1;i<arr.length-1;i=i+2) {
			 
			 System.out.println(arr[i]);
		 }
	}
}
