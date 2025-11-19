package com.operators;

public class ExplicitTypeCasting {
        
	public static void main(String[] args) {
		
		int a=130;
		
		byte b= (byte)a;
		// here i am converting int to byte manually compiler i not converting automatically 
		
		double c=235560000;
		int d=(int)c ; // here also manually converting double to int 
		
		System.out.println(a);
		
		System.out.println(b);
		
		System.out.println(c);
		
		System.out.println(d);
	}
}
