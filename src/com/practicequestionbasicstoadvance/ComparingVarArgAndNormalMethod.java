package com.practicequestionbasicstoadvance;

public class ComparingVarArgAndNormalMethod {
	
	static void m1(int...s) {
		
		System.out.println(s.length);
	}
	
	static void m1(int  s) {
		
		System.out.println(s);
		
	}
	
	public static void main(String[] args) {
		
		m1();
		m1(12);
		m1(87,87);
		
		
		
	}

}
