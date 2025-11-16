package com.array;



public class ArrayBasic {
	public static void main(String[] args) {
		
		
		  int[] arr; // Declaration of array
		  arr=new int[5]; // creation of array
		  // Initialization of array
		  arr[0]=23;
		  arr[1]=65;
		  arr[2]=76;
		  arr[3]=54;
		  arr[4]=71;
		  
		  
		  
		  // initialization and declaration 
		//  trying to catch exception//
		  try {
		  int[] a= { 545,344,76,324,675,900};
		  System.out.println(a[a.length-1]);
	}catch(Exception e) {
		System.out.println("Could not found the array index: "+e);
	}
		  System.out.println(arr[4]);
		  // traversing the array by for loop
		  for(int i=0;i<=arr.length-1;i++) {
			  
			  System.out.println(arr[i]);
		  }
		  // traversing array by for each loop
		  
	for(int a:arr) {
		System.out.println(a);
	}
		  }
}
