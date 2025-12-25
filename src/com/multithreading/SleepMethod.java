package com.multithreading;
 class Sleep extends Thread{
	 
	 public void run() {
		 
		 for(int i=0;i<10;i++) {
			
			 System.out.println("run method   executed by child thread ");
		 }
	 }
 }
public class SleepMethod {

	public static void main(String[] args) throws InterruptedException {
		
		Sleep s=new Sleep();
		
		s.start();
		
		for(int i=0;i<=10;i++) { 
			
			  Thread.sleep(3000);
			
			System.out.println("main method executed by main thread  ");
		}
	}
}
