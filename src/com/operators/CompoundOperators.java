package com.operators;

public class CompoundOperators {
       
	public static void main(String[] args) {
		
		int a=12;
		int b=a+1;
		
	//	byte c=a+1; // here i can not add +1 in the a because the output will be int type but we are assigning it into byte 
		           // so we will get a compile time exception 
		
		byte d=10 ;
		d+=1;
		
		byte f=23;
		
		++f;
		
		System.out.println(b);
	
		System.out.println(d);
		System.out.println(f);
		
		
	}
}
