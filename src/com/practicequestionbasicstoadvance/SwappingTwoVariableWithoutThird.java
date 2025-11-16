package com.practicequestionbasicstoadvance;

public class SwappingTwoVariableWithoutThird {

	public static void main(String[] args) {
		
		int a=67;
		int b=43;
		
		System.out.println("Number before swapping ::");
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Number after swapping ::");
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
         System.out.println(b);		
	}
}
