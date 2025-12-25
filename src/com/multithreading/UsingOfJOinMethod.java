package com.multithreading;

class Thread152 implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			
			System.out.println("Child thread ");
		}
		
	}
	
	
}
public class UsingOfJOinMethod {

	public static void main(String[] args) throws InterruptedException {
		
		Thread152 t=new Thread152();
		Thread t1=new Thread(t);
		
		t1.start();
		
		t1.join();
		// here main tread will wait until child thread completion 
		for(int i=0;i<10;i++) {
			
			System.out.println("main thread ");
		}
		
	}
}
