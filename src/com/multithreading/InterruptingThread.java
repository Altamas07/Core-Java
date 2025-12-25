package com.multithreading;

class Interrupt extends Thread{
	
	public void run() {
		
		for(int i=0;i<=10;i++) {
			
			try {
				Thread.sleep(4677);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("child thread");
		}
	}
}
public class InterruptingThread {

	public static void main(String[] args) {
		
		Interrupt inter=new Interrupt();
		inter.start();
		inter.interrupt();
		
		for(int i=0;i<=10;i++) {
			
			System.out.println("main thread ");
		}
	}
}
