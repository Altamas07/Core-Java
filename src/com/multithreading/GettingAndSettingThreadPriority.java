package com.multithreading;

public class GettingAndSettingThreadPriority {

	public static void main(String[] args) {
	
	Thread thread =new Thread(); // by default main thread priority is always 5 and other threads priority
	                            //  is inherited by parent to child 
	thread.setPriority(3);
	
	System.out.println(thread.getPriority());
	
	thread.setPriority(45);// thread priority limit is 1to10 default and manually 
	System.out.println(thread.getPriority());
	}
	
	public final void setPriority(int n) {
		
	}
	
	public final int getPriority() {
		
		return 0;
		
	}
}
