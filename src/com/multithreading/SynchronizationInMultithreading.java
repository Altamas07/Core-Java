package com.multithreading;

class Display {
	
	public synchronized void wish(String name ) {
		
		for(int i=0;i<6;i++) {
			
			try {
				Thread.sleep(340);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Good morning "+name);
		}
	}
}
class MyThread12 extends Thread{
	
	Display d;
	String name;
	
	MyThread12(Display d, String name ){
		
		this.d=d;
		this.name=name;
		
	}
	public void run() {
		
		d.wish(name);
		
	}
}
public class SynchronizationInMultithreading {

	public static void main(String[] args) {
		
		Display ds=new Display();
		
		MyThread12 my=new MyThread12(ds, "Altamas");
		MyThread12 my1=new MyThread12(ds, "Khan");
		
		my.start();
		my1.start();
		
		
		
	}
}
