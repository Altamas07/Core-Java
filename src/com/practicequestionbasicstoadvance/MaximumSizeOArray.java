package com.practicequestionbasicstoadvance;

public class MaximumSizeOArray {
	
	public static void main(String[] args) {
		
		int[] a=new int[2147483647];
		
		System.out.println(a.length-1);
		
		
		// there is no compile time error and program mistake but atruntime we got out of
		//memory exception due less memory because each each int value contain 4byte 
		//so 4byte*2147483647 it is a lot of memory so our system does not have that much memory so we got 
		// runtime exception saying OutOfMemory exception ::
		
		
	}

}
