package com.collectionpracticequestion;

import java.util.IdentityHashMap;


public class Identityhashmap {

	public static void main(String[] args) {
		
	
	IdentityHashMap<Integer, String> ihm=new IdentityHashMap<Integer, String>();
	
	Integer key=new Integer(56);
	Integer key1=new Integer(56); 
	
	ihm.put(key1, "dfghjkl;'");
	ihm.put(key, "fghjkl;lkj");
	
	System.out.println(ihm);
	
	}
}
