package com.multithreading;
class Thread15 implements Runnable{
	
	 synchronized public void run() {
		
		for(int i=0;i<=10;i++) {
			
			System.out.println("Child thread ");
		}
		
	}
}
public class SolvingRaceCondition {

	public static void main(String[] args) {
		
		Thread15 t=new Thread15();
		Thread15 t1=new Thread15();
		Thread15 t2=new Thread15();
		Thread15 t3=new Thread15();
		Thread15 t4=new Thread15();
		Thread th=new Thread(t);
		Thread th1=new Thread(t1);
		Thread th2=new Thread(t2);
		Thread th3=new Thread(t3);
		Thread th4=new Thread(t4);

		th.start();
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		
		for(int i=0;i<10;i++) {
			
			System.out.println("mainthread ");
		}
		
	}
}
