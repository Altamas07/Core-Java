package com.multithreading;

class Thread4 extends Thread{
	
	public void run(){
		
		System.out.println("no-arg run method ");
	}
	
	public void run(int a) {
		
		System.out.println("overloaded constructor ");
	}
}
public class OverloadingOfRunMethod {

	public static void main(String[] args) {
		
		Thread4 t=new Thread4();
		t.start(); // here we got always no-arg run method because jvm will always gives priority to it  
		
	}
}
