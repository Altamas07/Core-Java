package com.multithreadingenhancement;

import java.lang.ThreadGroup;
public class ImportantMethodsOfEnhancements {

	public static void main(String[] args) {
		
		ThreadGroup tg=new ThreadGroup("asdfghjkl;");
		
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		int max=tg.getMaxPriority();
		
		System.out.println(max);
		
	tg.setMaxPriority(5);
	
	System.out.println(tg);
	
	
		System.out.println(Thread.currentThread().getName());
	}
}
