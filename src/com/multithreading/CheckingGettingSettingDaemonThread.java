package com.multithreading;

class DaemonThread extends Thread{
	
	
}
public class CheckingGettingSettingDaemonThread {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().isDaemon());
		
		
		DaemonThread d=new DaemonThread();
		
		
		
		System.out.println(d.isDaemon());
		
		d.setDaemon(true);
		
		d.start();
		
	
		
		System.out.println(d.isDaemon());
		
		
	}
}
