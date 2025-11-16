package com.practicequestionbasicstoadvance;

public class VarArgMethod {
             
	static void m1(int...x) {
		
		
    int total =0;
		
		for(int x1:x) {
			
			total=total+x1;
		}
		
		
		System.out.println(total);
		
		
		System.out.println("the number of elements "+x.length);
		
	}
	
	public static void main(String[] args) {
		
		
		m1(12);
		m1(7,45);
		m1(34,54,45);
		
		
		
	}
}
