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
		m1(12);  // here when i call m1 with single parameter there var arg method is not get called 
		        //  but general method is called due to its higher priority in java
		m1(87,87);
		
		
		
	}

}
