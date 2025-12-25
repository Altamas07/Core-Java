package com.multithreading;

class Thread5 extends Thread{
	
	
}
public class DefaultPriorityForMainThread {

	public static void main(String[] args) {
		
		Thread5 t=new Thread5();
		
		t.start();
		
		System.out.println(Thread.currentThread().getPriority()		); // here i am not defining priority 
		// of main thread but by default i will get 5 
		
		System.out.println(t.getPriority());
		
		// here child is created by main thread so the priority of main thread is going to be by default to child thread
	}
}
