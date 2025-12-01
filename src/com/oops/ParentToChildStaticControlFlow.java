package com.oops;

class Test2{
	
	static int i=98;
	
	static {
		m1();
		
		System.out.println("First static block ::");
	}
	
	public static void main(String[] args) {
		
		System.out.println("parent main");
	}
	
	 static void m1() {
		
		System.out.println(j);
		
		System.out.println("second static  block parent ");
	}
	
	static int j=87;
	
}
public class ParentToChildStaticControlFlow extends Test2{

	static int i=34;
	
	static {
		m2();
		
		System.out.println("First static  block of child::");
	}
	
	public static void main(String[] args) {
		
		System.out.println("child  main");
	}
	
	 static void m2() {
		
		
		System.out.println(j);
		
		 System.out.println("Second static block child ");
	}
	
	static int j=8344;
	
	
}
