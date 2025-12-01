package com.abstraction;


interface Interf{
	
	void m1();
	
	void m2();
	
}

class ServiceProvider implements Interf{
	
	public void m1() {
		
		System.out.println("hii");
	}
	
	public void m2() {
		
		System.out.println("helo");
		
	}
}
public class Interface {

	public static void main(String[] args) {
		
		ServiceProvider serviceProvider=new ServiceProvider();
		
		serviceProvider.m1();
		serviceProvider.m2();
	}
}
