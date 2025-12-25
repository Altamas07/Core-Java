package com.multithreading;

class JoinDemo extends Thread{
	
	public void run() {
		
		for(int i=0;i<=10;i++) {
			
			
			System.out.println("child thread ");
		}
	}
}
public class JoinMethod {

	public static void main(String[] args) throws InterruptedException {
		
		JoinDemo j=new JoinDemo();
		
		j.start();
	//	j.join(); // join without time guarantees execution order  
		j.join(100); // join with time can not guarantees execution order 
		
		for(int i=0;i<=10;i++) {
			
		System.out.println("main thread ");
		
		}
		
	}
}
