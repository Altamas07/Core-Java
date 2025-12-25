package com.multithreading;

// this way of defining a thread is best 

class MyRunnable implements Runnable{
	
	public void run() {
		
		for(int i=0;i<10;i++) {
			
			System.out.println("child thread ");
		}
	}
	
}
public class CreatingThreadByRunnable {

	public static void main(String[] args) {
		
		MyRunnable myRunnable=new MyRunnable();
// here i am creating two object first object is child class which implements Runnable interface
// but runnable does not have start method that's why we have to create thread class object to call that method 		
		Thread thread =new Thread(myRunnable);
		
		thread.start();
		
		for(int i=0;i<10;i++) {
			
			System.out.println("Main thread ");
		}
	}
}
// here also thread scheduler is called by JVM so answer is not predictable it vary every time  
