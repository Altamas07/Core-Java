package com.concurentcollection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap1 {

	public static void main(String[] args) {
		
	
	ConcurrentHashMap<Integer, String> m=new ConcurrentHashMap<>();
	
	m.put(76, "altamash");
	m.put(76, "Altamash"); // here it will replace the value 
	
	System.out.println(m);
	
	m.putIfAbsent(76, "Altamash khan"); // it does not replace the value if it is already present 
	
	System.out.println(m);
	
	m.remove(76,"Altamash khan"); // removes the exact matching entry 
	System.out.println(m);
	
	
	m.replace(76,"Altamash", "Altamash khan");// it will replace the old value with new 
	
	System.out.println(m);
	
	}
}
