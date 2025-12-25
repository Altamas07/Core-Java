package com.multithreading;

class Thread1 extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("No-args Constructor "+i);
	}
	}
	
	public void run(int i) {
		
		System.out.println("Int-arg constructor ");
	}
	
}
public class ThreadRunMethodOverloading {

	public static void main(String[] args) {
		
	
	Thread1 thread1=new Thread1();
	
	thread1.start();
	
	for(int j=0;j<10;j++)
	{

		System.out.println("dfghjkl"+j);
		
	}
	}
}
