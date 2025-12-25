package com.multithreading;

class Thread34 extends Thread{
	
	public void run(){
		
		for(int i=0;i<=10;i++) {
			
			System.out.println("child thread ");
		}
	}	
}
public class ExecutionOrderByThreadPriority {

	public static void main(String[] args) {
		
		Thread34 t= new Thread34();
		
		// t.start();  // here 2 threads are there one is main thread and second is child thread output will be random 
		
		t.setPriority(10); // here also we will get same output so thread priority is not guarantee 
		
		t.start();
		
		for(int j=0;j<=10;j++) {
			
			System.out.println("main thread");
		}
		
	}
	
}
