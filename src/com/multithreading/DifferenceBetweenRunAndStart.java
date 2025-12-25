package com.multithreading;

class Thread13 implements Runnable {
	
	
	public void run() {
		
		
		for(int i=0;i<10;i++) {
			
			System.out.println("child thread ");
		}
	}
	
}
public class DifferenceBetweenRunAndStart {

	public static void main(String[] args) {
		
		Thread13 t=new Thread13();
		Thread th=new Thread(t);
		
		th.start(); // here a new thread named thread-0 will be created 
		
		
		t.run(); // here it will execute like a normal method call no extra thread will be created 
		
		for(int i=0;i<10;i++) {
			
			System.out.println("main thraed ");
		}
		
	}
}
