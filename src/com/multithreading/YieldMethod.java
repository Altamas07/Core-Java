package com.multithreading;

class child extends Thread{
	
	public void run(){
		
		for(int i=0;i<=10;i++) {
			
			Thread.yield(); // here it is requesting to jvm or thread schedular to give chance of execution 
			                // to another thread of same priority or higher priority this request can be ignored some time 
			// it is not supported by many operating system 
			System.out.println("child thread");
		}
	}
}
public class YieldMethod {

	public static void main(String[] args) {
		
		child c=new child();
		
		c.start();
		
		for(int i=0;i<=10;i++) {
			
			System.out.println("main thread ");
		}
	}
}
