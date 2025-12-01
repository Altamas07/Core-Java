package com.abstraction;

interface Interfiii{
	
	void m1();
	
	default void display() {
		
		System.out.println("Default method executed ");
		
		priv();
	}
	
	static void stat() {
		
		System.out.println("Static block executed ");
		privstat();
	}
	
	private void priv() {
		
		System.out.println("Private method executed ");
		
		
	}
	
	private static void privstat() {
		
		System.out.println("Privstat metod executed ");
	}
}

  class Demo implements Interfiii{

	@Override
	public void m1() {
		
		System.out.println("Abstract method executed ");
		
	}
	
	
	
	  
	  
  }
public class AllInterfaceMethods {
             
	public static void main(String[] args) {
		
		Demo demo=new Demo();
		
		demo.m1();
		demo.display();
		Interfiii.stat();
		
		
	}
}
