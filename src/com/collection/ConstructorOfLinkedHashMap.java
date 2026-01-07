package com.collection;


import java.util.LinkedHashMap;

public class ConstructorOfLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm=new LinkedHashMap<Integer, String>();
		// default linked hash map of 16 default capacity with 0.75 load factor
		

		LinkedHashMap<Integer, String> hm1=new LinkedHashMap<Integer, String>(20);
		// creates  linked hash map object with 20 capacity  with 0.75 load factor 
		
		LinkedHashMap<Integer, String> hm2=new LinkedHashMap<Integer, String>(20,0.45f);
		// creates linked  hash map object with 20 capacity  with 0.45 load factor 
		
		LinkedHashMap<Integer, String> hm3=new LinkedHashMap<Integer, String>(hm);
		// creates  linked hash map object with copying all elements of hm into hm3
		
		hm.put(34, "Altams khan");
		hm.put(64, "hashim ");
		hm.put(37, "sad khan");  // insertion order is preserved 
		hm.put(45, "saad khan");
		hm.put(86, "Altamash khan");
		hm.put(32, "Altamas khan");
		
		System.out.println(hm);
	}
}
