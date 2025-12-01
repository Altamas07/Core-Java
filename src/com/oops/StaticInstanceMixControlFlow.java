package com.oops;

public class StaticInstanceMixControlFlow {

	{
		System.out.println("First instance block ");
	}
	
	static {
		System.out.println("First static block ");
	}
	
	StaticInstanceMixControlFlow(){
		
		System.out.println("Constructor ");
	}
	
	public static void main(String[] args) {
		
		StaticInstanceMixControlFlow staticInstanceMixControlFlow=new StaticInstanceMixControlFlow();
		System.out.println("main");
		
	}
	
	{
		System.out.println("Second instance block");
	}
	static {
		
		System.out.println("second static block:");
	}
}
