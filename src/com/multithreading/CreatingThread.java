package com.multithreading;
 
class MyThread extends Thread{
	
	public void run() {
		
		for(int i=0;i<=10;i++) {
			
			System.out.println(i);
		}
	}
	
}
public class CreatingThread {

	public static void main(String[] args) {
		
		MyThread myThread=new MyThread();
		
		myThread.start();
		
		for(int j=0;j<=10;j++) {
			
			System.out.println(j);
		}
	}
}
// in this type of terminology output is going to vary every time 
