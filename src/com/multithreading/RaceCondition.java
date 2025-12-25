package com.multithreading;
// multiple threads working simultaneosly on same object is called race condition 
class Thread14 implements Runnable{
	
	public void run() {
		
		for(int i=0;i<=10;i++) {
			
			System.out.println("Child thread ");
		}
		
	}
}
public class RaceCondition {

	public static void main(String[] args) {
		
		Thread14 t=new Thread14();
		Thread14 t1=new Thread14();
		Thread14 t2=new Thread14();
		Thread14 t3=new Thread14();
		Thread14 t4=new Thread14();
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
