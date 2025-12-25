package com.multithreading;
/*
class Thread23 extends Thread {
	
	public void run(){
		
		for(int i=0;i<10;i++) {
			
			System.out.println("Child thread ");
		}
	}
}*/

class Thread23 implements Runnable{

	@Override
	public void run() {
		

		for(int i=0;i<10;i++) {
			
			System.out.println("Child thread ");
		}
		
		
	}
	
	
}
public class TwoWaysToCreateThread {

	public static void main(String[] args) {
		
		Thread23 th=new Thread23();
		
		Thread t=new Thread(th);
		
		t.start();
		
		for(int i=0;i<20;i++) {
			
			System.out.println("main method ");
		}
	}
}
