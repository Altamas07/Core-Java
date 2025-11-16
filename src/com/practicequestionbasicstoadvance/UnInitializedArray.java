package com.practicequestionbasicstoadvance;

public class UnInitializedArray {
    
	int[] a;
	
	static int[] s;
	
	public static void main(String[] args) {
		
		 System.out.println(s);
		 
		 System.out.println(s[1]);
		
		UnInitializedArray unInitializedArray=new UnInitializedArray();
		
	System.out.println(	unInitializedArray.a);
	
	System.out.println(unInitializedArray.a[0]);
		
		
	}
}
