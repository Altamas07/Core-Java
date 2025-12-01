package com.oops;

class Test {
	
	int x=20;
	
	{
		m1();
		
		System.out.println("First instance block");
	}
	
	Test(){
		
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		
		Test test=new Test();
		
		System.out.println("main");
	}
	
	{
		
		System.out.println("Second instance block");
	}
	
	public void m1() {
		
		System.out.println(j);
	}
	
	int j=20;
}


public class ParentToChildInstanceControlFlow extends Test {

	
	int x=20;
	
	{
		m1();
		
		System.out.println("First instance block of child ");
	}
	
	ParentToChildInstanceControlFlow(){
		
		System.out.println("Constructor of child ");
	}
	
	public static void main(String[] args) {
		
		ParentToChildInstanceControlFlow parentToChildInstanceControlFlow=new ParentToChildInstanceControlFlow();
		System.out.println("main of child ");
	}
	
	{
		
		System.out.println("Second instance block of child ");
	}
	
	public void m1() {
		
		System.out.println(j);
	}
	
	int j=20;
}

