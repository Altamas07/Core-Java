package com.multithreading;

class ChildWaiting extends Thread{
	
	static Thread mt;
	
	public void run() {
		
		try {
			
			mt.join();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

		for(int i=0;i<=10;i++) {
			
			System.out.println("child thread");
		}
		
	}
}
public class JoinMethodForChildWaiting {

	public static void main(String[] args) throws InterruptedException{
		ChildWaiting.mt=Thread.currentThread();
		
		ChildWaiting c=new ChildWaiting();
		
		c.start();
		
		for(int i=0;i<=10;i++) {
			
			
			System.out.println("main thraed");
		}
	}
}
// in this code child thread will wait until main execution complete first 
