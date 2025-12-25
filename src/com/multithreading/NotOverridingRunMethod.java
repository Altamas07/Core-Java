package com.multithreading;

class Thread3 extends Thread{
	
	
}
public class NotOverridingRunMethod   {

	public static void main(String[] args) {
		
		Thread3 thread=new Thread3();
		
		thread.start();
		
	}
}

// if we don't override run method of thread class we won't get any output on console but we won't
// get any exception o r error 