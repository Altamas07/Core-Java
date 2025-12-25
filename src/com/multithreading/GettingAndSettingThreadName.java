package com.multithreading;

class Demo extends Thread{
	
	
}
public class GettingAndSettingThreadName {

	public static void main(String[] args) {
		
		Demo demo =new Demo();
		
		
		
		System.out.println(Thread.currentThread().getName()); // this class thread name is main thread 
		
		System.out.println(demo.getName());// child class thread name is Thread-0
		
		
		Thread.currentThread().setName("Altamash khan");
		
		System.out.println(Thread.currentThread().getName());
		
	}
}
