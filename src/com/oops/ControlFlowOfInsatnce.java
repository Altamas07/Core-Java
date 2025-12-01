package com.oops;

public class ControlFlowOfInsatnce {
             
	int x=10;
	
	{
		m1();
		System.out.println("First instance block ");
	}
	ControlFlowOfInsatnce(){
		System.out.println("constructor");
		
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		ControlFlowOfInsatnce controlFlowOfInsatnce=new ControlFlowOfInsatnce();
		System.out.println("main");
	}
	
	public void m1(){
		
		System.out.println(j);
		
	}
	
	
	{
		System.out.println("Second static block ");
	}
	
	int j=20;
}
